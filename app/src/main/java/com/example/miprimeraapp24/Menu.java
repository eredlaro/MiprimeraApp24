package com.example.miprimeraapp24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    Button regresar;
    TextView etiqueta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        regresar = (Button) findViewById(R.id.button);
        etiqueta = (TextView)findViewById(R.id.etiqueta);
        Bundle extras = getIntent().getExtras();
        if(extras!= null)
            etiqueta.setText(extras.getString("mensaje"));


        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }
}