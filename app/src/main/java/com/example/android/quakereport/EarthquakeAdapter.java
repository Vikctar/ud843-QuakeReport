package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Get the current {@link Earthquake} object located at this position in the list
        Earthquake earthquake = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID tv_magnitude
        TextView magnitude = listItemView.findViewById(R.id.tv_magnitude);
        // Get the magnitude from the earthquake object and set this text on the magnitude text view
        magnitude.setText(earthquake.getMagnitude());

        // Find the TextView in the list_item.xml layout with the ID tv_city
        TextView city = listItemView.findViewById(R.id.tv_city);
        // Get the city from the earthquake object and set this text on the city text view
        city.setText(earthquake.getCity());

        // Find the TextView in the list_item.xml layout with the ID tv_date
        TextView date = listItemView.findViewById(R.id.tv_date);
        // Get the date from the earthquake object and set this text on the date text view
        date.setText(earthquake.getDate());

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;

    }
}
