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
        riversideArea.add(new Attraction(R.drawable.riverside_image, R.string.riverside_name1, R.string.riverside_description1, "geo:51.5112172,-0.0594708"));
        riversideArea.add(new Attraction(R.string.riverside_name2, R.string.riverside_description2, "geo:51.5090902,-0.0519156"));
        riversideArea.add(new Attraction(R.string.riverside_name3, R.string.riverside_description3, "geo:51.5132389,-0.0439882"));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), riversideArea);
        ListView listView = rootView.findViewById(R.id.list_view_layout);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Attraction attraction = riversideArea.get(position);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(attraction.getLocation()));
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            } });
        return rootView;
    }
}
