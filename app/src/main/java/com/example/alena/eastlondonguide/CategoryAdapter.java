package com.example.alena.eastlondonguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the adapter
     *                        across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TowerFragment();
        } else if (position == 1) {
            return new RiversideFragment();
        } else if (position == 2) {
            return new IsleOfDogsFragment();
        } else {
            return new EastEndFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Return the {@link String} that should be displayed for the given page number.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_tower);
        } else if (position == 1) {
            return mContext.getString(R.string.category_riverside);
        } else if (position == 2) {
            return mContext.getString(R.string.category_isleOfDogs);
        } else {
            return mContext.getString(R.string.category_eastEnd);
        }
    }
}
