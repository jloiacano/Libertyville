package com.example.android.libertyville;

/**
 * Created by J on 2/16/2017.
 * {@link Location} A location object to store the name and address of locations with
 * it's picture (if available) and website link (if available)
 */

public class Location {

    /*-- in case there is no image --*/
    private static final int NO_IMAGE_PROVIDED = -1;
    /*-- Name of Location--*/
    private String mName;
    /*-- Address of location --*/
    private String mAddress;
    /*-- resource id integer of the appropriate image --*/
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    /*-- website link for location --*/
    private String mWebsiteLink;

    /*-- Phone number of Location --*/
    private String mPhoneNumber;

    /*-- setter for the Location Object with an image --*/
    public Location(String name, String address, int imageResourceID, String websiteLink, String phoneNumber) {
        mName = name;
        mAddress = address;
        mImageResourceID = imageResourceID;
        mWebsiteLink = websiteLink;
        mPhoneNumber = phoneNumber;
    }

    /*-- setter for the Location Object without an image or website link --*/
    public Location(String name, String address) {
        mName = name;
        mAddress = address;
    }

    /*-- getter for the Location name --*/
    public String getLocationName() {
        return mName;
    }

    /*-- getter for the Location address --*/
    public String getLocationAdress() {
        return mAddress;
    }

    /*-- getter for the Locations image resource id --*/
    public int getLocationImageResourceID() {
        return mImageResourceID;
    }

    /*-- getter for the Locations website URL in String form --*/
    public String getLocationWebsiteLink() {
        return mWebsiteLink;
    }

    /*-- getter for the Locations phone number in String form --*/
    public String getLocationPhoneNumeber() {
        return mPhoneNumber;
    }


    @Override
    public String toString() {
        return "Location{" +
                "mName='" + mName + '\'' +
                ", mAddress='" + mAddress + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mWebsiteLink='" + mWebsiteLink + '\'' +
                ", mPhoneNumber='" + mPhoneNumber + '\'' +
                '}';
    }
}
