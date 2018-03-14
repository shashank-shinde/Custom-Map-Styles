package com.sas_apps.custommapstyle;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private static final String TAG = "MapsActivity";
    private String mapStyle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        mapStyle=getIntent().getStringExtra(getResources().getString(R.string.app_name));
        Log.d(TAG, "onCreate: getIntent "+mapStyle);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
       switch (mapStyle){
           case "Silver":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.silver));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                    break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
           case "Retro":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.retro));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
           case "Dark":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.dark));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
           case "Night":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.night));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
           case "Aubergine":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.aubergine));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }

           case "Desert":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.desert));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
           case "BlueWater":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.blue_water));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
           case "Avocado":
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.avocado));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
           default:
               try {
                   boolean success = googleMap.setMapStyle(
                           MapStyleOptions.loadRawResourceStyle(
                                   this, R.raw.standerd));
                   if (!success) {
                       Log.e(TAG, "Style parsing failed.");
                   }
                   break;
               } catch (Resources.NotFoundException e) {
                   Log.e(TAG, "Can't find style. Error: ", e);
                   break;
               }
       }
        mMap = googleMap;
        LatLng india = new LatLng(20.59, 78.96);
        mMap.addMarker(new MarkerOptions().position(india).title("India"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(india));
    }
}
