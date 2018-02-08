package com.example.alena.eastlondonguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        towerArea.add(new Attraction(R.drawable.tower_image, R.string.tower_name1, R.string.tower_description1));
        towerArea.add(new Attraction(R.string.tower_name2, R.string.tower_description2));
        towerArea.add(new Attraction(R.string.tower_name3, R.string.tower_description3));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), towerArea);
        ListView listView = rootView.findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
        return rootView;
    }
}
