package com.example.alena.eastlondonguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RiversideFragment extends Fragment {


    public RiversideFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> riversideArea = new ArrayList<>();
        riversideArea.add(new Attraction(R.drawable.riverside_image, R.string.riverside_name1, R.string.riverside_description1));
        riversideArea.add(new Attraction(R.string.riverside_name2, R.string.riverside_description2));
        riversideArea.add(new Attraction(R.string.riverside_name3, R.string.riverside_description3));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), riversideArea);
        ListView listView = rootView.findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
        return rootView;
    }
}
