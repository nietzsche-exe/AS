package es.ciudadescolar.listview2;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lista;
    List<Ejemplo> ejemplolist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista = (ListView) findViewById(R.id.listaViewEjemplo);
        ejemplolist = new ArrayList<>();
        ejemplolist.add(new Ejemplo("Título Ejemplo 1", "Subtitulo Ejemplo 1", "", 1));
        ejemplolist.add(new Ejemplo("Título Ejemplo 2", "Subtitulo Ejemplo 2", "", 2));
        ejemplolist.add(new Ejemplo("Título Ejemplo 3", "Subtitulo Ejemplo 3", "", 3));
        ejemplolist.add(new Ejemplo("Título Ejemplo 4", "Subtitulo Ejemplo 4", "", 4));

        MiAdaptadorEjemplo adaptadorEjemplo = new MiAdaptadorEjemplo(this, R.layout.ejemplo_item, ejemplolist);

        lista.setAdapter(adaptadorEjemplo);
    }
}