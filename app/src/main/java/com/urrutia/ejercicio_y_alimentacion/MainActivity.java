package com.urrutia.ejercicio_y_alimentacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Creamos la variables que haran referencia a los widget
    private TextView txtTitulo;
    private Button btnIniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Realizar las referencias
        txtTitulo = findViewById(R.id.txtTitulo);
        btnIniciar = findViewById(R.id.btnIniciar);


    }
}