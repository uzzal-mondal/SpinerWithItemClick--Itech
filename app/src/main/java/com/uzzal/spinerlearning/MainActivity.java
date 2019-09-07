package com.uzzal.spinerlearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] programingName;
    private String[] programmingFamilar;
    private TextView tvResult;

    private Button button;
    int[] images = {R.drawable.dartlogo, R.drawable.fluterlogo,
            R.drawable.javalogo, R.drawable.javascriptlogo, R.drawable.kotlinlogo,
            R.drawable.phplogo,
            R.drawable.pythonlogo};


    private boolean isFirstSelection = true;
    String value;
    String showData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // array declare.
        programingName = getResources().getStringArray(R.array.programming_name);
        programmingFamilar = getResources().getStringArray(R.array.programming_familar);

        button = findViewById(R.id.button_id);

        spinner = findViewById(R.id.spinner_id);

        tvResult = findViewById(R.id.textViewShow_id);

        CustomAdapter adapter = new CustomAdapter(this, images, programingName, programmingFamilar);

        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                value = programingName[position];
                showData = programmingFamilar[position];

                if (isFirstSelection == true) {

                    isFirstSelection = false;
                } else {
                    Toast.makeText(MainActivity.this, value + "is selected", Toast.LENGTH_SHORT).show();


                }

                // Toast.makeText(MainActivity.this, ""+value, Toast.LENGTH_SHORT).show();
                // Toast.makeText(MainActivity.this, ""+showData, Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v.getId() == R.id.button_id) {

                    if (value.equals("Dart")) {

                        tvResult.setText(R.string.kotlinPro_text);

                    }

                    else if (value.equals("Fluter")) {

                        tvResult.setText(value);
                    }

                    else if (value.equals("Java")) {

                        tvResult.setText(R.string.kotlinPro_text);
                    }

                    else if (value.equals("Java Script")) {

                        tvResult.setText(value);
                    }

                   else if (value.equals("Kotlin")) {

                        tvResult.setText(R.string.kotlinPro_text);
                    }




                }


            }
        });


    }
}
