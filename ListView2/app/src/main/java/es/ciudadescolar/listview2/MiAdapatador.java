package es.ciudadescolar.listview2;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class MiAdapatador extends ArrayAdapter<Ejemplo> {

        Context ctx;
        int layoutTemplate;
        List<Ejemplo> ejemploList;

    public MiAdapatador(@NonNull Context context, int resource, @NonNull List<Ejemplo> objects) {
        super(context, resource, objects);

        this.ctx = context;
        this.layoutTemplate = resource;
        this.ejemploList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){

        View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        Ejemplo elementoActual = ejemploList.get(position);

        TextView textViewTitulo = (TextView) v.findViewById(R.id.textViewTitulo);
        TextView textViewSubtitulo = (TextView) v.findViewById(R.id.textViewSubtitulo);
        TextView textViewNumero = (TextView) v.findViewById(R.id.textViewNumero);

        textViewTitulo.setText(elementoActual.getTitulo());
        textViewSubtitulo.setText(elementoActual.getSubtitulo());
        textViewNumero.setText(elementoActual.getNumero()+"");


        return v;
    }


}
