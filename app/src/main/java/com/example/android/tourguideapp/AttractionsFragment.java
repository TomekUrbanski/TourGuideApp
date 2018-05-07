package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ImageView map = rootView.findViewById(R.id.map);
        map.setImageResource(R.drawable.map_attractions);

        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place("Luna Park", "ul. Gałgana Grzegorzka 1", R.drawable.atr1));
        place.add(new Place("Touring balloon flight", "Most Grunwaldzki 2", R.drawable.atr2));
        place.add(new Place("Zoo", "ul Pawia 8 / ul. Żurawia 5", R.drawable.atr3));
        place.add(new Place("Bungee jumping", "ul. Ostatnia 20", R.drawable.atr4));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), place);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getContext(), "Choose between -lead to- and -information-", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

}
