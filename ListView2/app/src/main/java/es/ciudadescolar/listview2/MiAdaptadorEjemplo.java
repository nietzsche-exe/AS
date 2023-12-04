package es.ciudadescolar.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Arrays;
import java.util.List;

public class MiAdaptadorEjemplo extends ArrayAdapter<Ejemplo> {

    Context ctx;
    int layoutTemplate;

    List<Ejemplo> ejemploList;
    public MiAdaptadorEjemplo(@NonNull Context context, int resource, @NonNull List<Ejemplo> objects) {
        super(context, resource, objects);

        this.ctx = context;
        this.layoutTemplate = resource;
        this.ejemploList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View v = LayoutInflater.from(ctx).inflate(layoutTemplate,parent, false);

        // OBTENER LA INFORMACIÓN DEL ELEMENTO DE LA LISTA QUE ESTAMOS RECORRIENDO EN ESTE MOMENTO.
        Ejemplo elemntoActual = ejemploList.get(position);

        // RESCATAR LOS ELEMENTOS DE LA INTERFAZ DE USUARIO DE LA TEMPLATE (PLANTILLA)
        TextView textViewTitulo = (TextView) v.findViewById(R.id.textViewTitulo);
        TextView textViewSubtitulo = (TextView) v.findViewById(R.id.textViewSubtitulo);
        TextView textViewNumero = (TextView) v.findViewById(R.id.textViewNumero);

        // HACER UN SET DE LA INFO. DEL elementoActual en los elementos de la interfaz del usuario.
        textViewTitulo.setText(elemntoActual.getTitulo());
        textViewSubtitulo.setText(elemntoActual.getSubtitulo());
        textViewNumero.setText(elemntoActual.getNumeroEjemplo() + "");

        return v;
    }

    // MiAdaptadorEjemplo adaptadorEjemplo = new MiAdaptadorEjemplo(this, R.layout.ejemplo_item, ejemplolist);


}
