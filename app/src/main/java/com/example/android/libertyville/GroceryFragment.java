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
public class GroceryFragment extends Fragment {


    public GroceryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Jewel/Osco",
                "1300 S Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.grocery_jewel,
                "http://www.jewelosco.com/pd/stores/IL/Libertyville/Libertyville-Milwaukee-and-Golf/D59E73208",
                "tel:847-816-8200"));

        locations.add(new Location("Mariano's Fresh Market",
                "1720 N Milwaukee Ave, Vernon Hills, IL 60061",
                R.drawable.grocery_marianos,
                "http://www.marianos.com/",
                "tel:847-816-0994"));

        locations.add(new Location("Sunset Foods",
                "1451 E Peterson Rd, Libertyville, IL 60048",
                R.drawable.grocery_sunset,
                "http://www.sunsetfoods.com/",
                "tel:847-573-9570"));

        locations.add(new Location("Trader Joe's",
                "1600 S Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.grocery_trader_joes,
                "http://www.traderjoes.com/",
                "tel:847-680-1739"));

        locations.add(new Location("Walgreen's (South Store)",
                "1470 S Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.grocery_walgreens_s,
                "https://www.walgreens.com/locator/walgreens-1470+s+milwaukee+ave-libertyville-il-60048/id=5258",
                "tel:847-247-0682"));

        locations.add(new Location("Walgreen's (North Store)",
                "1770 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.grocery_walgreens_n,
                "https://www.walgreens.com/locator/walgreens-1770+n+milwaukee+ave-libertyville-il-60048/id=5257",
                "tel:847-327-9706"));


        /**
         * binds the LocationAdapter to this ArrayList
         */
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
        gridView.setAdapter(itemsAdapter);
        return rootView;

    }

}