package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place>{

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView albumName = listItemView.findViewById(R.id.place_name);
        albumName.setText(currentPlace.getmPlaceName());

        TextView albumYear = listItemView.findViewById(R.id.place_adres);
        albumYear.setText(currentPlace.getmPlaceAdres());

        ImageView albumImage = listItemView.findViewById(R.id.image);
        albumImage.setImageResource(currentPlace.getImageResourceId());

        return listItemView;
    }
}
