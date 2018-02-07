package com.example.alena.eastlondonguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
        isleOfDogsArea.add(new Attraction(R.drawable.isle_of_dogs_image, "test"));
        isleOfDogsArea.add(new Attraction("test"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), isleOfDogsArea);
        ListView listView = rootView.findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
        return rootView;
    }
}
