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
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Ganello's Pizza Company",
                "1431 Peterson Rd, Libertyville, IL 60048",
                R.drawable.restaurants_ganellos,
                "http://ganellos.com/",
                "tel:847-549-3140"));

        locations.add(new Location("The Picnic Basket",
                "501 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_the_picnic_basket,
                "http://www.picnicbasketfood.com/",
                "tel:847-367-8336"));

        locations.add(new Location("Townee Square",
                "508 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_townee_square,
                "http://www.towneesquare.com/",
                "tel:847-367-9144"));

        locations.add(new Location("Milwalky Trace",
                "603 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_milwaky_trace,
                "http://www.milwalky-trace.com/",
                "tel:847-530-7172"));

        locations.add(new Location("Hanakawa Steakhouse & Sushi Bar",
                "411 S Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_hanakawa,
                "http://hanakawasteakhouse.com/",
                "tel:847-247-0091"));

        locations.add(new Location("Wildberry Pancakes and Cafe",
                "1783 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_wildberry,
                "http://www.wildberrycafe.com/libertyville.html",
                "tel:847-247-7777"));

        locations.add(new Location("The Green Room of Libertyville",
                "624 Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_the_green_room,
                "http://www.thegreenroomlibertyville.com/",
                "tel:847-362-2292"));

        locations.add(new Location("Shakou Sushi",
                "625 N Milwaukee Ave Libertyville, IL 60048",
                R.drawable.restaurants_shakou,
                "http://shakourestaurants.com/",
                "tel:224-433-6675"));

        locations.add(new Location("Thai Noodles Cafe",
                "318 S Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_thai_noodles_cafe,
                "http://thainoodlescafe.com/",
                "tel:-362-3494"));

        locations.add(new Location("Mickey Finn's Brewery",
                "345 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.restaurants_mickey_finns,
                "http://www.mickeyfinnsbrewery.com/",
                "tel:847-362-6688"));


        /**
         * binds the LocationAdapter to this ArrayList
         */
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
        gridView.setAdapter(itemsAdapter);
        return rootView;

    }

}
