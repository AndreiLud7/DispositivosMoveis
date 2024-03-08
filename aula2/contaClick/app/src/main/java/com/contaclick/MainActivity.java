package com.contaclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText edmin, edMax;
    TextView textviewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edmin = findViewById(R.id.texmin);
        edMax = findViewById(R.id.textmax);
        textviewResult = findViewById(R.id.textv);


    }
    public void NumeroAleatorio(View V){
        int max, min;
        min = Integer.parseInt(edmin.getText().toString());
        max = Integer.parseInt(edmin.getText().toString());
        Random R = new Random;
        R.nextInt( bound max - min+1);

    }




}