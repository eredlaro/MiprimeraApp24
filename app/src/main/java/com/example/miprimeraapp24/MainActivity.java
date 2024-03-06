package com.example.miprimeraapp24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button btnIniciar;
    EditText campo;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIniciar = (Button) findViewById(R.id.init);
        campo = (EditText)findViewById(R.id.iniciar2);
        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sum = sum + 1;
                Toast.makeText(getApplicationContext(),"Llevas  " +sum+ " clicks realizados",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), Menu.class);
                intent.putExtra("mensaje",campo.getText().toString());
                startActivity(intent);
            }
        });





//Comentarios
      // esto es un comentario

        /* estes es un comentario
                de dos  lieneas o
                moveTaskToBack()   */

 // Constantes

  final double PI = 3.141594;
  final String NAME = "erik";



 // Variables
 int numero = 5;
        System.out.print(numero);
      numero = 10;
        System.out.print(numero);
      numero = 25;

System.out.print("numero" +numero);

// Tipos de datos
        // Enteros Int

        int numeros = 7;
        numeros = 4;

        //Flotantes float

            float decimal = 10.5F;

        //Double double
        double conpunto = 23.7;

        // Cadenas String
        String nombre = "Eduardo";

        //Boleanos boolean

        boolean estado = false;
                estado = true;


        //Operadores
    /*    ==  igual
          != diferentes
          > mayor que
          < menor que
          >= mayor igual que
          <= menor igual que



*/






    }
}