package com.example.android.libertyville;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by J on 2/16/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Activity context, ArrayList<Location> locations) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it must be 0.


        super(context, 0, locations);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View singleLocationView = convertView;

        /*check to see if there is a single_location inflated and if not, inflates one*/
        if (singleLocationView == null) {
            singleLocationView = LayoutInflater.from(getContext()).inflate(
                    R.layout.single_location, parent, false);
        }

        final Location thisLocation = getItem(position);

        final TextView thisName = (TextView) singleLocationView.findViewById(R.id.location_name);
        thisName.setText(thisLocation.getLocationName());

        TextView thisAddress = (TextView) singleLocationView.findViewById(R.id.location_address);
        thisAddress.setText(thisLocation.getLocationAdress());

        /*--
        Get the image (which is basically the background of the GridView tile) and set an
        onClickListener to it to open a new activity to show all the details of the location.
        Add all the necessary Location info to the bundle to be passed to the onCreate method
        of the new Activity created by DetailedLocationMaker.class with single_location_detailed.xml
         */
        ImageView thisImage = (ImageView) singleLocationView.findViewById(R.id.location_image);
        thisImage.setImageResource(thisLocation.getLocationImageResourceID());
        thisImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openDetailedLocationView = new Intent(getContext(), DetailedLocationMaker.class);
                Bundle aLocation = new Bundle();
                aLocation.putInt("image", thisLocation.getLocationImageResourceID());
                aLocation.putString("name", thisLocation.getLocationName());
                aLocation.putString("address", thisLocation.getLocationAdress());
                aLocation.putString("website", thisLocation.getLocationWebsiteLink());
                aLocation.putString("phone", thisLocation.getLocationPhoneNumeber());
                openDetailedLocationView.putExtras(aLocation);
                getContext().startActivity(openDetailedLocationView);
            }
        });

        return singleLocationView;
    }
}
