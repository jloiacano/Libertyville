package com.example.android.libertyville;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by J on 3/1/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;
    private int mPageCount = 4;


    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SchoolsFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new ParksFragment();
        } else {
            return new GroceryFragment();
        }
    }

    @Override
    public int getCount() {
        return mPageCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return "Schools";
        } else if (position == 1) {
            return "Eat!";
        } else if (position == 2) {
            return "Parks";
        } else {
            return "Grocery";
        }
    }
}
