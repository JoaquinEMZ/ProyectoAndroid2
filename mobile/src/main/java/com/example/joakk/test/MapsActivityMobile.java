package com.example.joakk.test;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityMobile extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private static final LatLng tiendaStaAdriana = new LatLng(-33.011994, -71.543508);
    private static final LatLng verduleriaLyL = new LatLng(-33.012134, -71.543272);
    private static final LatLng verduleriaMyM = new LatLng(-33.011986, -71.544053);
    private static final LatLng panaderiaVillanelo = new LatLng(-33.012647, -71.5431322);
    private static final LatLng almacenPB = new LatLng(-33.011442, -71.542876);

    private Marker mStaAdriana;
    private Marker mLyL;
    private Marker mMyM;
    private Marker mPanaderiaVillanelo;
    private Marker mAlmacenPB;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_mobile);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mStaAdriana = mMap.addMarker(new MarkerOptions()
                        .position(tiendaStaAdriana)
                        .title("Tienda Santa Adriana")
                        .snippet("Ofrece zapallo, cebollin, pimenton, papa, zanahoria, ajo, lechuga, palta"));
        mStaAdriana.setTag(0);

        mLyL = mMap.addMarker(new MarkerOptions()
                    .position(verduleriaLyL)
                    .title("Verduleria L y L")
                    .snippet("Ofrece papas, alcachofas, palta, pepino, lechuga,guisantes"));
        mLyL.setTag(0);

        mMyM = mMap.addMarker(new MarkerOptions()
                    .position(verduleriaMyM)
                    .title("Verduleria M y M")
                    .snippet("Ofrece lechuga, papa, guisantes, coliflor, zapallo, cebollin, brocoli"));
        mMyM.setTag(0);

        mPanaderiaVillanelo = mMap.addMarker(new MarkerOptions()
                    .position(panaderiaVillanelo)
                    .title("Panaderia y Pasteleria Villanelo")
                    .snippet("Ofrece pasteles caceros, pan, pizza y algunos productos basicos"));
        mPanaderiaVillanelo.setTag(0);

        mAlmacenPB = mMap.addMarker(new MarkerOptions()
                    .position(almacenPB)
                    .title("Almacen de productos basicos")
                    .snippet("Ofrecen papel higienico, cepillos, etc."));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(tiendaStaAdriana));
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }
}
