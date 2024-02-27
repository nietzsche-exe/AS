package es.ciudadescolar.ejemplobasedatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.ciudadescolar.ejemplobasedatos.db.dbContacto;

public class FormularioActivity extends AppCompatActivity {

    EditText txtNombre, txtTelefono, txtEmail;
    Button btnInsertar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        txtNombre = findViewById(R.id.txtNombre);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtEmail = findViewById(R.id.txtEmail);
        btnInsertar = findViewById(R.id.btnInsertar);


        btnInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dbContacto dbContacto = new dbContacto(FormularioActivity.this);
                long id = dbContacto.insertarContacto(txtNombre.getText().toString(), txtTelefono.getText().toString(), txtEmail.getText().toString());
                if(id > 0){
                    Toast.makeText(FormularioActivity.this, "Contacto insertado", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(FormularioActivity.this, "Error al insertar el contacto", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void limpiarCampos(){
        txtNombre.setText("");
        txtTelefono.setText("");
        txtEmail.setText("");
    }
}