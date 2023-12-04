package es.ciudadescolar.alarma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void activarAlarma(View view){
       Intent intent =  new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "salir de clase")
                .putExtra(AlarmClock.EXTRA_HOUR, 14)
                .putExtra(AlarmClock.EXTRA_MINUTES, 25);
        startActivity(intent);
    }

}