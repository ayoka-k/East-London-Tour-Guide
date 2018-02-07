package com.example.alena.eastlondonguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Activity contex, ArrayList<Attraction> list) {
        super(contex, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Attraction} object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID description_text_view
        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        // Get the description from the current Attraction object and
        // set this text on the description TextView
        descriptionTextView.setText(currentAttraction.getDescription());

        // Find the ImageView in the list_item.xml layout with the ID image_view
        ImageView image = listItemView.findViewById(R.id.image_view);
        // Check if an image is provided for this word or not
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            image.setImageResource(currentAttraction.getImageResourceId());
            //Make sure the image is visible
            image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image.setVisibility(View.GONE);
        }
        return listItemView;
    }
}