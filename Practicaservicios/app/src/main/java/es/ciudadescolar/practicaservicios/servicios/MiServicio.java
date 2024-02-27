package es.ciudadescolar.practicaservicios.servicios;

import android.app.LocaleManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiServicio extends Service implements LocationListener {

    private Context ctx;
    double latitud;
    double longitud;
    Location localizacion;
    LocaleManager locationManager;
    boolean gpsActivo;
    TextView texto;

    public MiServicio(Context c){
        super();
        this.ctx = c;
    }

    public void setView(View v){
        texto = (TextView)v;
        texto.setText("Coordenadas: "+latitud+", "+ longitud);
    }

    @SuppressWarnings("MissingPermission")
    public void getLocation(){
        try{

        }
        catch(Exception e){
        }
        if(gpsActivo){
            locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER, 1000*60,10,this);
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onLocationChanged(@NonNull Location location) {

    }

    @Override
    public void onLocationChanged(@NonNull List<Location> locations) {
        LocationListener.super.onLocationChanged(locations);
    }

    @Override
    public void onFlushComplete(int requestCode) {
        LocationListener.super.onFlushComplete(requestCode);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
        LocationListener.super.onStatusChanged(provider, status, extras);
    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {
        LocationListener.super.onProviderEnabled(provider);
    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
        LocationListener.super.onProviderDisabled(provider);
    }
}
