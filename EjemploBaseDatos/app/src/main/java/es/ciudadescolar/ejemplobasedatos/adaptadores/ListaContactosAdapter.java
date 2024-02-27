package es.ciudadescolar.ejemplobasedatos.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import es.ciudadescolar.ejemplobasedatos.R;
import es.ciudadescolar.ejemplobasedatos.VerActivity;
import es.ciudadescolar.ejemplobasedatos.entidades.Contactos;

public class ListaContactosAdapter extends RecyclerView.Adapter<ListaContactosAdapter.ContactosViewHolder>{

    public class ContactosViewHolder extends RecyclerView.ViewHolder{

        public TextView viewNombre, viewTelefono, viewEmail;

        public ContactosViewHolder(View itemView){
            super(itemView);
            viewNombre = itemView.findViewById(R.id.viewNombre);
            viewTelefono = itemView.findViewById(R.id.viewTelefono);
            viewEmail = itemView.findViewById(R.id.viewEmail);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, VerActivity.class);
                    intent.putExtra("ID", listaContactos.get(getAdapterPosition()).getId());
                    context.startActivity(intent);
                }
            });
        }
    }

    ArrayList<Contactos> listaContactos;

    public ListaContactosAdapter(ArrayList<Contactos> listaContactos){
        this.listaContactos = listaContactos;
    }

    @NonNull
    @Override
    public ContactosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_contacto, null, false);
        return new ContactosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactosViewHolder holder, int position) {

        holder.viewNombre.setText(listaContactos.get(position).getNombre());
        holder.viewTelefono.setText(listaContactos.get(position).getTelefono());
        holder.viewEmail.setText(listaContactos.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }
}
