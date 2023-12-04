package es.ciudadescolar.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lista;
    private List<String> ejemploLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.Listviewejemplo);
        ejemploLista = new ArrayList<>();
        ejemploLista.add("Popeye el marino soy");
        ejemploLista.add("Detras de una rubia voy");
        ejemploLista.add("Le meto la mano me dice marrano");
        ejemploLista.add("Le meto el cipote y me dice machote");
        ejemploLista.add("Lets gooooooo");

        ArrayAdapter<String> adapatador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ejemploLista);

        lista.setAdapter(adapatador);
        lista.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "El ejemplo seleccionado es: " + ejemploLista.get(position) , Toast.LENGTH_SHORT).show();
    }
}