package com.example.alena.eastlondonguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class IsleOfDogsFragment extends Fragment {


    public IsleOfDogsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> isleOfDogsArea = new ArrayList<>();
        isleOfDogsArea.add(new Attraction(R.drawable.isle_of_dogs_image, R.string.isle_of_dogs_name1, R.string.isle_of_dogs_description1, "geo:51.5053469,-0.0254861"));
        isleOfDogsArea.add(new Attraction(R.string.isle_of_dogs_name2, R.string.isle_of_dogs_description2, "geo:51.4875074,-0.0115488"));
        isleOfDogsArea.add(new Attraction(R.string.isle_of_dogs_name3, R.string.isle_of_dogs_description3, "geo:51.508064,0.006149"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), isleOfDogsArea);
        ListView listView = rootView.findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction attraction = isleOfDogsArea.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(attraction.getLocation()));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            } });
        return rootView;
    }
}
