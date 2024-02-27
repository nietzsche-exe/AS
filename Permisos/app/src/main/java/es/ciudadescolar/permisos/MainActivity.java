package es.ciudadescolar.permisos;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import android.Manifest;

public class MainActivity extends AppCompatActivity {
    int CODIGO_RESPPUESTA = 200;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        verificarPermisosSMS();
        verificarPermisosCONTACTOS();
        verificarPermisosINTERNET();
        verificarPermisosGPS();
        verificarPermisosFOTOS();
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void verificarPermisosFOTOS() {
        int permisosFOTOS = ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        if (permisosFOTOS == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Permisos FOTOS concedido", Toast.LENGTH_SHORT).show();
        }
        else {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},CODIGO_RESPPUESTA);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void verificarPermisosGPS() {
        int permisosGPS = ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION);
        if (permisosGPS == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Permisos GPS concedido", Toast.LENGTH_SHORT).show();
        }
        else {
            requestPermissions(new String[]{Manifest.permission.ACCESS_FINE_LOCATION},CODIGO_RESPPUESTA);
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void verificarPermisosINTERNET() {
        int permisosINTERNET = ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET);
        if (permisosINTERNET == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Permisos INTERNET concedido", Toast.LENGTH_SHORT).show();
        }
        else {
            requestPermissions(new String[]{Manifest.permission.INTERNET},CODIGO_RESPPUESTA);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void verificarPermisosCONTACTOS() {
        int permisosCONTACTOS = ContextCompat.checkSelfPermission(this, Manifest.permission.READ_CONTACTS);
        if (permisosCONTACTOS == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Permisos CONTACTOS concedido", Toast.LENGTH_SHORT).show();
        }
        else {
            requestPermissions(new String[]{Manifest.permission.READ_CONTACTS},CODIGO_RESPPUESTA);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void verificarPermisosSMS(){
        int permisosSMS = ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS);
        if (permisosSMS == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "Permisos SMS concedido", Toast.LENGTH_SHORT).show();
        }
        else {
            requestPermissions(new String[]{Manifest.permission.SEND_SMS},CODIGO_RESPPUESTA);
        }

    }
}