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
public class ChurchFragment extends Fragment {


    public ChurchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View places_list = inflater.inflate(R.layout.fragment_list, container, false);

        ImageView map = places_list.findViewById(R.id.map);
        map.setImageResource(R.drawable.map_church);

        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(getString(R.string.swietej_trojcy), getString(R.string.pl_marszalka_pilsudksiego3), R.drawable.church1));
        place.add(new Place(getString(R.string.kosciol_wizytek), getString(R.string.ul_wislana78), R.drawable.church2));
        place.add(new Place(getString(R.string.sw_michała_archaniola),getString(R.string.ul_warszawska34), R.drawable.church3));
        place.add(new Place(getString(R.string.ewangelicko_augsburski), getString(R.string.ul_gromu250), R.drawable.church4));

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
