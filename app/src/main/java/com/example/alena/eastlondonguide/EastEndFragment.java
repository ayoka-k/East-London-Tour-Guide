package com.example.alena.eastlondonguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EastEndFragment extends Fragment {


    public EastEndFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        final ArrayList<Attraction> eastEndArea = new ArrayList<>();
        eastEndArea.add(new Attraction(R.drawable.east_end_image, R.string.east_end_name1, R.string.east_end_description1 ));
        eastEndArea.add(new Attraction(R.string.east_end_name2, R.string.east_end_description2));
        eastEndArea.add(new Attraction(R.string.east_end_name3, R.string.east_end_description3));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), eastEndArea);
        ListView listView = rootView.findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
        return rootView;
    }
}
