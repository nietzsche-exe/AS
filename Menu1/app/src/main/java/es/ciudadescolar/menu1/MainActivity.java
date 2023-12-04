package es.ciudadescolar.menu1;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

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
    public boolean onOptionsItemSelected(MenuItem comunidad){
        int id=comunidad.getItemId();
        if (id==R.id.Madrid) {
            Toast.makeText(this, "Poblacion 1: Alcobendas \n" +
                            "poblacion 2: Mejorada del campo \n" +
                            "poblacion 3: Parla"
                    , Toast.LENGTH_LONG).show();
        } else if (id==R.id.Barcelona) {
            Toast.makeText(this, "Poblacion 1: Alella\n" +
                            "poblacion 2: Aiguafreda\n" +
                            "poblacion 3: Alpens"
                    , Toast.LENGTH_LONG).show();
        } else if (id==R.id.Girona) {
            Toast.makeText(this, "Poblacion 1: Santa Pau\n" +
                            "poblacion 2: Portbou\n" +
                            "poblacion 3: Colera"
                    , Toast.LENGTH_LONG).show();
        } else if (id==R.id.Tarragona) {
            Toast.makeText(this, "Poblacion 1: Altafulla\n" +
                            "poblacion 2: Creixell\n" +
                            "poblacion 3: els Pallaresos"
                    , Toast.LENGTH_LONG).show();
        } else if (id==R.id.Lleida) {
            Toast.makeText(this, "Poblacion 1: Adons\n" +
                            "poblacion 2: Adrall\n" +
                            "poblacion 3: Agramunt"
                    , Toast.LENGTH_LONG).show();
        } else if (id==R.id.Huesca) {
            Toast.makeText(this, "Poblacion 1: Alquezar\n" +
                            "poblacion 2: Ainsa\n" +
                            "poblacion 3: Torla"
                    , Toast.LENGTH_LONG).show();
        } else if (id==R.id.Teruel) {
            Toast.makeText(this, "Poblacion 1: Albarracín\n" +
                            "poblacion 2: Valderrobres\n" +
                            "poblacion 3: Calaceite"
                    , Toast.LENGTH_LONG).show();
        } else if (id==R.id.Zaragoza) {
            Toast.makeText(this, "Poblacion 1: Sos del Rey Católico\n" +
                            "poblacion 2: Uncastillo\n" +
                            "poblacion 3: Anento"
                    , Toast.LENGTH_LONG).show();
        }
        return true;
    }
}