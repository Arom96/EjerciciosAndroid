package com.example.controlspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    private EditText txt1, txt2;
    private TextView txt3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        Spinner spinnerl = findViewById(R.id.spinner1);
        String[] opciones ={"Sumar","Restar","Multiplicar","Dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, opciones);
        spinnerl.setAdapter(adapter);
    }

    public void operar(View view){
        String valor1 = txt1.getText().toString();
        String valor2 = txt2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        String selec = spinner1.getSelectedItem().toString();

        if(selec.equals("Sumar")){
            int suma = nro1 + nro2;
            String res = String.valueOf(suma);
            txt3.setText(res);

        }else if (selec.equals("Restar")){
            int resta = nro1 - nro2;
            String res = String.valueOf(resta);
            txt3.setText(res);

        }else if(selec.equals("Dividir")){
            int div = nro1 / nro2;
            String res = String.valueOf(div);
            txt3.setText(res);
        }else if(selec.equals("Multiplicacion")){
            int multi = nro1 * nro2;
            String res = String.valueOf(multi);
            txt3.setText(res);
        }
    }

}