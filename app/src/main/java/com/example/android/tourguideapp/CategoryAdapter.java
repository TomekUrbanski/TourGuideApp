package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumFragment();
        } else if (position == 1) {
            return new MonumentFragment();
        } else if (position == 2) {
            return new ChurchFragment();
        } else {
            return new AttractionsFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.name_activity1);
        } else if (position == 1) {
            return mContext.getString(R.string.name_activity2);
        } else if (position == 2) {
            return mContext.getString(R.string.name_activity3);
        } else {
            return mContext.getString(R.string.name_activity4);
        }
    }
}