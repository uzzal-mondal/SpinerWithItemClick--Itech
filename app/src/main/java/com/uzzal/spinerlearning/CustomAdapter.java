package com.uzzal.spinerlearning;

import android.content.Context;
import android.content.SearchRecentSuggestionsProvider;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    LayoutInflater inflater;

    Context context;
    int[] images;
    String[] programingName;
    String[] programmingFamilar;

    public CustomAdapter(Context context, int[] images, String[] programingName, String[] programmingFamilar) {
        this.context = context;
        this.images = images;
        this.programingName = programingName;
        this.programmingFamilar = programmingFamilar;
    }

    @Override
    public int getCount() {
        return programingName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){

           LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_data_show,null,false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewSample_id);
        imageView.setImageResource(images[position]);

        TextView proName = convertView.findViewById(R.id.textViewSample_id);
        proName.setText(programingName[position]);

        TextView proFamous = convertView.findViewById(R.id.textView2Sample_id);
        proFamous.setText(programmingFamilar[position]);




        return convertView;
    }
}
