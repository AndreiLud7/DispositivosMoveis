package com.example.aula_dia_15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edpeso, edaltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edpeso = findViewById(R.id.peso);
        edaltura = findViewById(R.id.altura);
    }
    public void calcularIMC(View view){

        double peso = Double.parseDouble(edpeso.getText().toString());
        double altura = Double.parseDouble(edaltura.getText().toString());
        String IMC = String.valueOf(peso/(altura*2));
        Log.d(IMC, "calcularIMC: ");
        Toast.makeText(this, IMC, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),Resultado.class);
        intent.putExtra("valorimc",IMC);
        startActivity(intent);


    }

}