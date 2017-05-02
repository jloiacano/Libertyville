package com.example.android.libertyville;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by J on 3/1/2017.
 * <p>
 * creates an activity to show an individual location with icons to access further information
 */

public class DetailedLocationMaker extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_location_detailed);

        int image = -1;
        String name = "";
        String address = "";
        String website = "";
        String phone = "";

        //get the extras that were put in the bundle from the intent to start this in LocationAdapter
        Bundle thisBundlesExtras = getIntent().getExtras();

        if (thisBundlesExtras != null) {
            image = thisBundlesExtras.getInt("image");
            name = thisBundlesExtras.getString("name");
            address = thisBundlesExtras.getString("address");
            website = thisBundlesExtras.getString("website");
            phone = thisBundlesExtras.getString("phone");
        }

        // sets the image in single_location_detailed.xml to the one passed in the bundle extras
        ImageView detailImage = (ImageView) findViewById(R.id.detailed_location_image);
        detailImage.setImageResource(image);

        // sets the name in single_location_detailed.xml to the one passed in the bundle extras
        TextView detailName = (TextView) findViewById(R.id.detailed_location_name);
        detailName.setText(name);

        // sets the address in single_location_detailed.xml to the one passed in the bundle extras
        TextView detailAddress = (TextView) findViewById(R.id.detailed_location_address);
        detailAddress.setText(address);

        /*--
        finds the phone link icon in single_location_detailed.xml
        checks to see if there was a phone number passed in from the Location through
        the bundled extras. If there wasn't, gets rid of the icon, otherwise sets an onClickListener
        to the phone icon to open the dialer with the appropriate phone number
         */
        ImageView phoneLink = (ImageView) findViewById(R.id.phone_link);
        if (phone.equals("") || phone.equals("N/A") ||
                phone.equals("tel:") || phone.equals(null)) {
            phoneLink.setVisibility(View.GONE);
        } else {
            final String phoneNumber = phone;
            phoneLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent callNumber = new Intent(Intent.ACTION_DIAL);
                    callNumber.setData(Uri.parse(phoneNumber));
                    startActivity(callNumber);
                }


            });
        }
        /*--
        finds the map link icon in single_location_detailed.xml
        checks to see if there was an address passed in from the Location through
        the bundled extras. If there wasn't, gets rid of the icon, otherwise sets an onClickListener
        to the map icon to open Maps to the passed address.
         */
        ImageView addressLink = (ImageView) findViewById(R.id.maps_address);
        if (address.equals("") || address.equals("N/A") ||
                address.equals("ADDRESS") || address.equals(null)) {
            addressLink.setVisibility(View.GONE);
        } else {
            final String addressToMap = address;
            addressLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent mapAddress = new Intent(Intent.ACTION_VIEW);
                    mapAddress.setData(Uri.parse("geo:0,0?q=" + addressToMap));
                    startActivity(mapAddress);
                }
            });
        }
        /*--
        finds the website link icon in single_location_detailed.xml
        checks to see if there was a website passed in from the Location through
        the bundled extras. If there wasn't, gets rid of the icon, otherwise sets an onClickListener
        to the website link icon to open the website in a browser.
         */
        ImageView webLink = (ImageView) findViewById(R.id.website_link);
        if (website.equals("") || website.equals("N/A") ||
                website.equals("WEBSITE") || website.equals(null)) {
            webLink.setVisibility(View.GONE);
        } else {
            final String linkToWebsite = website;
            webLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent openWebsite = new Intent(Intent.ACTION_VIEW);
                    openWebsite.setData(Uri.parse(linkToWebsite));
                    startActivity(openWebsite);
                }

            });
        }

    }
}
