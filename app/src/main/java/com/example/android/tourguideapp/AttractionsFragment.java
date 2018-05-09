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
        View places_list = inflater.inflate(R.layout.fragment_list, container, false);

        ImageView map = places_list.findViewById(R.id.map);
        map.setImageResource(R.drawable.map_attractions);

        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(getString(R.string.luna_park), "ul. Gałgana Grzegorzka 1", R.drawable.atr1));
        place.add(new Place(getString(R.string.ballon_flight), "Most Grunwaldzki 2", R.drawable.atr2));
        place.add(new Place(getString(R.string.zoo), "ul Pawia 8 / ul. Żurawia 5", R.drawable.atr3));
        place.add(new Place(getString(R.string.bungee_jump), "ul. Ostatnia 20", R.drawable.atr4));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), place);
        ListView listView = places_list.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(getContext(), R.string.toast_msg_listClick, Toast.LENGTH_SHORT).show();
            }
        });

        return places_list;
    }

}
