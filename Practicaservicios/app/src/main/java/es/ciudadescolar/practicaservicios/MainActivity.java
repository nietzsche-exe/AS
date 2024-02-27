package es.ciudadescolar.practicaservicios;

import androidx.appcompat.app.AppCompatActivity;
import es.ciudadescolar.practicaservicios.servicios.MiServicio;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MiServicio servicio = new MiServicio(getApplicationContext());
    }
}