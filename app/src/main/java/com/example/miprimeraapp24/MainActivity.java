package com.example.miprimeraapp24;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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