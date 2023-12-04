/*
package es.ciudadescolar.josejulliansaavedra_examen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class MiAdaptador extends ArrayAdapter<Lista> {

    Context ctx;
    int layoutTemplate;
    List<Lista> ejemploList;

    public MiAdapatador(@NonNull Context context, int resource, @NonNull List<Lista> objects) {
        super(context, resource, objects);

        this.ctx = context;
        this.layoutTemplate = resource;
        this.ejemploList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){

        View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        Lista elementoActual = ejemploList.get(position);


        TextView textViewNombre = (TextView) v.findViewById(R.id.textViewNombre);
        TextView textViewNumero = (TextView) v.findViewById(R.id.textViewNumero);

        textViewNombre.setText(elementoActual.getNombre());
        textViewNumero.setText(elementoActual.getNumeroAleatorio());

        return v;
    }

}
*/