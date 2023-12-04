package es.ciudadescolar.josejulliansaavedra_examen;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public boolean onCreateOptionsMenu(Menu mimenu){
        getMenuInflater().inflate(R.menu.context_menu,mimenu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem examen){
        int id=examen.getItemId();
        if (id==R.id.info) {
            Toast.makeText(this, "Esta es la APP de Jose Julian Saavedra Gonzalez"
                    , Toast.LENGTH_LONG).show();
        }
        return true;
    }

    public void activarAlarma(){
        Intent intent =  new Intent(AlarmClock.ACTION_SET_ALARM)
                .putExtra(AlarmClock.EXTRA_MESSAGE, "Prueba Primera Evaluación")
                .putExtra(AlarmClock.EXTRA_HOUR, 12)
                .putExtra(AlarmClock.EXTRA_MINUTES, 30);
        startActivity(intent);
    }

    public void iniciarMenu(View view){
        Intent intent = new Intent(MainActivity.this, MainActivityListView.class);
        startActivity(intent);
    }

    public void iniciarCalculo(View view){
        Intent intent = new Intent(MainActivity.this, MainActivityCalcularNota.class);
        startActivity(intent);
    }

}