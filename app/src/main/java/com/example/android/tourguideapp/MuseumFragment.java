package com.example.android.tourguideapp;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.PopupMenu;
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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View places_list = inflater.inflate(R.layout.fragment_list, container, false);

        ImageView map = places_list.findViewById(R.id.map);
        map.setImageResource(R.drawable.map_museum);


        ArrayList<Place> place = new ArrayList<Place>();
        place.add(new Place(getString(R.string.m_JanaPawłaII), getString(R.string.ul_wojska_polskiego33), R.drawable.mon1));
        place.add(new Place(getString(R.string.m_poniatowskich), getString(R.string.ul_uszczerbku2), R.drawable.mon2));
        place.add(new Place(getString(R.string.m_polish_jews), getString(R.string.ul_madulenskiego120), R.drawable.mon3));
        place.add(new Place(getString(R.string.m_warsaw_uprising), getString(R.string.ul_garderobiana1c), R.drawable.mon4));

        final PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), place);
        final ListView listView = places_list.findViewById(R.id.list);
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
