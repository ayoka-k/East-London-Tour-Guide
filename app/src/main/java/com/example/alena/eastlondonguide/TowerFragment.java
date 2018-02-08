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

public class TowerFragment extends Fragment {

    public TowerFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> towerArea = new ArrayList<>();
        towerArea.add(new Attraction(R.drawable.tower_image, R.string.tower_name1, R.string.tower_description1, "geo:51.508054,-0.0789826"));
        towerArea.add(new Attraction(R.string.tower_name2, R.string.tower_description2, "geo:51.5054564,-0.0775452"));
        towerArea.add(new Attraction(R.string.tower_name3, R.string.tower_description3, "geo:51.5107013,-0.0690854"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), towerArea);
        ListView listView = rootView.findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction attraction = towerArea.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(attraction.getLocation()));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
        return rootView;
    }
}
