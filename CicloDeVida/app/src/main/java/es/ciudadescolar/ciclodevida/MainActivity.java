package es.ciudadescolar.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    protected void irActivity2(View view){
        Intent intentDatos = new Intent(MainActivity.this, SecundarioActivity.class);
        startActivity(intentDatos);

    }


}