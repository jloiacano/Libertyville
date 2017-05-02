package com.example.android.libertyville;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Adler Park",
                "1500 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.parks_adler,
                "http://www.pdga.com/course-directory/course/adler-park",
                "tel:847-918-7275"));

        locations.add(new Location("Bluebery Hill",
                "230 Blueberry Hill Rd, Libertyville, IL 60048",
                R.drawable.parks_blueberry_hill,
                "N/A",
                "N/A"));

        locations.add(new Location("Butler Lake",
                "810 W Lake St, Libertyville, IL 60048",
                R.drawable.parks_butler_lake,
                "https://www.facebook.com/pages/Butler-Lake-Park/146069248755449",
                "tel:847-918-2074"));

        locations.add(new Location("Charles Brown",
                "1015 Dawes Street Libertyville, IL 60048",
                R.drawable.parks_charles_brown,
                "http://www.libertyville.com/Facilities/Facility/Details/Charles-Brown-Park-2",
                "tel:847-918-7275"));

        locations.add(new Location("Cook Park",
                "100 W Church St, Libertyville, IL 60048",
                R.drawable.parks_cook,
                "http://www.littlelakecounty.com/cook-park-playground-libertyville/",
                "tel:847-918-2074"));

        locations.add(new Location("Gilbert Stiles",
                "1670 Cass Ave, Libertyville, IL 60048",
                R.drawable.parks_gilbert_stiles,
                "http://recplanet.com/node/28081",
                "tel:847-918-2074"));

        locations.add(new Location("Greentree",
                "500 Greentree Pkwy Libertyville, IL 60048",
                R.drawable.parks_greentree,
                "http://recplanet.com/node/28082",
                "tel:847-918-2074"));

        locations.add(new Location("Independence Grove",
                "16400 West Buckley Road Libertyville, IL 60048",
                R.drawable.parks_independence_grove,
                "http://www.lcfpd.org/ig/",
                "tel:847-968-3499"));

        locations.add(new Location("Jo Ann Eckmann",
                "1600 Nathan Ln, Libertyville, IL 60048",
                R.drawable.parks_jo_ann_eckmann,
                "http://recplanet.com/node/28083",
                "tel:847-918-2074"));

        locations.add(new Location("Nicholas-Dowden",
                "920 Crane Blvd, Libertyville, IL 60048",
                R.drawable.parks_nicholas_dowden,
                "https://www.facebook.com/pages/Nicholas-Dowden-Park/191722980875988",
                "tel:847-918-7275"));

        locations.add(new Location("Paul Neal",
                "1251 New Castle Dr, Libertyville, IL 60048",
                R.drawable.parks_paul_neal,
                "http://recplanet.com/node/28086",
                "tel:847-918-2074"));

        locations.add(new Location("Riverside",
                "870 Country Club Dr, Libertyville, IL 60048",
                R.drawable.parks_riverside,
                "https://www.facebook.com/pages/Riverside-Park/152050821475675",
                "tel:847-362-5733"));

        locations.add(new Location("Sunrise Rotary",
                "100 E Maple Ave, Libertyville, IL 60048",
                R.drawable.parks_sunrise_rotary,
                "http://www.libertyvillesunriserotary.com/",
                "N/A"));


        /**
         * binds the LocationAdapter to this ArrayList
         */
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
        gridView.setAdapter(itemsAdapter);
        return rootView;

    }

}