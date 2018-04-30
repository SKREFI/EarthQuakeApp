package com.example.android.quakereport;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayList<Earthquake> {

    public static class ViewHolder{
        TextView tvMg;
        TextView tvLocation;
        TextView tvDate;

        ViewHolder(View v){
            tvDate = v.findViewById(R.id.date_textview)
            tvLocation = v.findViewById(R.id.location_textview);
            tvMg = v.findViewById(R.id.mg_textview);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Earthquake earthquake = getItem(position);
        if(earthquake!=null){
            viewHolder.tvMg.setText(earthquake.getMg());
            viewHolder.tvLocation.setText(earthquake.getLocation());
            viewHolder.tvDate.setText(earthquake.getDate());
        }

        return convertView;
    }

}
