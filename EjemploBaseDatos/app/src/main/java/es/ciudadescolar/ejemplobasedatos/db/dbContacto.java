package es.ciudadescolar.ejemplobasedatos.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import es.ciudadescolar.ejemplobasedatos.entidades.Contactos;

public class dbContacto extends dbAyudante {

    Context context;

    public dbContacto(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarContacto(String nombre, String telefono, String email) {
        long id = 0;
        try {
            dbAyudante dbAyudante = new dbAyudante(context);
            SQLiteDatabase db = dbAyudante.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("telefono", telefono);
            values.put("email", email);
            id = db.insert(CONTACTOS_TABLE, null, values);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public ArrayList<Contactos> mostrarContactos() {
        dbAyudante dbAyudante = new dbAyudante(context);
        SQLiteDatabase db = dbAyudante.getWritableDatabase();
        ArrayList<Contactos> listaContactos = new ArrayList<>();
        Contactos contactos = null;
        Cursor cursorContactos = null;
        cursorContactos = db.rawQuery("SELECT * FROM " + CONTACTOS_TABLE, null);
        if (cursorContactos.moveToFirst()) {
            do {
                contactos = new Contactos();
                contactos.setId(cursorContactos.getInt(0));
                contactos.setNombre(cursorContactos.getString(1));
                contactos.setTelefono(cursorContactos.getString(2));
                contactos.setEmail(cursorContactos.getString(3));
                listaContactos.add(contactos);
            } while (cursorContactos.moveToNext());
        }

        return listaContactos;
    }
}