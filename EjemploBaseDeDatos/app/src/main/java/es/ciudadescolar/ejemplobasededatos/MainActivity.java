package es.ciudadescolar.ejemplobasededatos;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import es.ciudadescolar.ejemplobasededatos.db.dbAyudante;

public class MainActivity extends AppCompatActivity {

    private Button btnBaseDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBaseDatos = findViewById(R.id.btnBaseDatos);
        btnBaseDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbAyudante dbAyudante = new dbAyudante(MainActivity.this);
                SQLiteDatabase db = dbAyudante.getWritableDatabase();
                if (db != null) {
                    Toast.makeText(MainActivity.this, "Base de datos creada", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Error al crear la base de datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}