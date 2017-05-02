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
public class SchoolsFragment extends Fragment {


    public SchoolsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location("Libertyville H.S.",
                "708 W Park Ave, Libertyville, IL 60048",
                R.drawable.schools_libertyville_hs,
                "https://lhswildcats.org/",
                "tel:847-327-7000"));

        locations.add(new Location("Highland Middle School",
                "310 W Rockland Rd, Libertyville, IL 60048",
                R.drawable.schools_highland_ms,
                "http://www.d70schools.org/schoolsites/?school_id=4",
                "tel:847-362-9020"));

        locations.add(new Location("Adler Park Elementary",
                "1740 N Milwaukee Ave, Libertyville, IL 60048",
                R.drawable.schools_adler_park_elementary,
                "http://www.d70schools.org/schoolsites/?school_id=1",
                "tel:847-362-7275"));

        locations.add(new Location("Butterfield Elementary",
                "1441 Lake St, Libertyville, IL 60048",
                R.drawable.schools_butterfield_elementary,
                "http://www.d70schools.org/schoolsites/?school_id=2",
                "tel:847-362-3120"));

        locations.add(new Location("Copeland Manor Elementary",
                "801 7th Ave, Libertyville, IL 60048",
                R.drawable.schools_copeland_manor_elementary,
                "http://www.d70schools.org/schoolsites/?school_id=3",
                "tel:847-362-0240"));

        locations.add(new Location("Rockland Elementary",
                "160 W Rockland Rd, Libertyville, IL 60048",
                R.drawable.schools_rockland_elementary,
                "http://www.d70schools.org/schoolsites/?school_id=5",
                "tel:847-362-3134"));

        /**
         * binds the LocationAdapter to this ArrayList
         */
        LocationAdapter itemsAdapter = new LocationAdapter(getActivity(), locations);
        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
        gridView.setAdapter(itemsAdapter);
        return rootView;
    }

}
