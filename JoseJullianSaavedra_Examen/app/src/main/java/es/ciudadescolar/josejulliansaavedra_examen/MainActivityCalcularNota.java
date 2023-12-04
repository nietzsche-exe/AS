package es.ciudadescolar.josejulliansaavedra_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivityCalcularNota extends AppCompatActivity {

    private EditText num1EditText;
    private EditText num2EditText;
    private EditText num3EditText;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_calcular_nota);


        num1EditText = findViewById(R.id.txtNumero1);
        num2EditText = findViewById(R.id.txtNumero2);
        num3EditText = findViewById(R.id.txtNumero3);
        resultadoTextView = findViewById(R.id.txtResultado);
    }

    public void calcular(View view) {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double num3 = Double.parseDouble(num3EditText.getText().toString());


        double resultado = (num1 + num2 + num3) / 3;
        long numeroRedondeado = Math.round(resultado);
        resultadoTextView.setText(String.valueOf(numeroRedondeado));
    }

    public void borrar(View view) {
        num1EditText.setText("");
        num2EditText.setText("");
        num3EditText.setText("");
        resultadoTextView.setText("");
    }

}