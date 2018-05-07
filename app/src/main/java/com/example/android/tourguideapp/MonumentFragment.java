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
public class MonumentFragment extends Fragment {


    public MonumentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ImageView map = rootView.findViewById(R.id.map);
        map.setImageResource(R.drawable.map_monuments);

        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place("Wolności", "ul. Wolności 3", R.drawable.mon1));
        place.add(new Place("Pomnik na Wzgórzu Kaim", "ul. Na Wzgórzu 1", R.drawable.mon2));
        place.add(new Place("Chwała Saperom", "ul. Żołnierzy Wyklętych 67", R.drawable.mon3));
        place.add(new Place("Tysiąclecia jazdy Polskiej", "pl. Uni Lubelskiej", R.drawable.mon4));

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
