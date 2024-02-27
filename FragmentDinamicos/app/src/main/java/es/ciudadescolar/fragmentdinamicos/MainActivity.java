package es.ciudadescolar.fragmentdinamicos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction;
    Fragment fragmentInicio, fragmentManzana, fragmentPera, fragmentPlatano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentInicio = new FragmentInicio();
        fragmentPlatano = new FragmentPlatano();
        fragmentPera = new FragmentPera();
        fragmentManzana = new FragmentManzana();

        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragmentos, fragmentInicio).commit();
    }

    public void onClick(View view) {
       transaction = getSupportFragmentManager().beginTransaction();

            if(view.getId() == R.id.btnPlatano) {
                transaction.replace(R.id.contenedorFragmentos, fragmentPlatano);
                transaction.addToBackStack(null);
            } else if (view.getId() == R.id.btnManzana) {
                transaction.replace(R.id.contenedorFragmentos, fragmentManzana);
                transaction.addToBackStack(null);
            } else if (view.getId() == R.id.btnPera){
                transaction.replace(R.id.contenedorFragmentos, fragmentPera);
                transaction.addToBackStack(null);
            };
            transaction.commit();
        }

    }
