package es.ciudadescolar.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1EditText;
    private EditText num2EditText;
    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1EditText = findViewById(R.id.txtNumero1);
        num2EditText = findViewById(R.id.txtNumero2);
        resultadoTextView = findViewById(R.id.txtResultado);
    }

    public void suma(View view) {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double resultado = num1 + num2;
        resultadoTextView.setText(String.valueOf(resultado));
    }

    public void multiplicar(View view) {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double resultado = num1 * num2;
        resultadoTextView.setText(String.valueOf(resultado));
    }

    public void restar(View view) {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        double resultado = num1 - num2;
        resultadoTextView.setText(String.valueOf(resultado));
    }

    public void dividir(View view) {
        double num1 = Double.parseDouble(num1EditText.getText().toString());
        double num2 = Double.parseDouble(num2EditText.getText().toString());
        if (num2 != 0) {
            double resultado = num1 / num2;
            resultadoTextView.setText(String.valueOf(resultado));
        } else {
            resultadoTextView.setText("Error: División por cero");
        }
    }

    public void borrar(View view) {
        num1EditText.setText("");
        num2EditText.setText("");
        resultadoTextView.setText("");
    }






}