package com.example.a6iv7_melody_friend_1;

/*Los imports de spiner*/
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
/*Hasta aquí*/

import java.util.ArrayList;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;




public class Entrada_datos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.entrada_de_datos);


        /*Esto de abajo es del spiner, lo que sirve para la entrada de datos*/

        /*Inicio Spinner Semestre*/
        Spinner spinnerSemestre = findViewById(R.id.spinner_semestre);
        ArrayAdapter<CharSequence>adapterSemestre=ArrayAdapter.createFromResource(this, R.array.Semestre, android.R.layout.simple_spinner_item);

        adapterSemestre.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerSemestre.setAdapter(adapterSemestre);
        /*Final Spinner Semestre*/

        /*Inicio Spinner Carrera*/
        Spinner spinnerCarrera=findViewById(R.id.spinner_carrera);
        ArrayAdapter<CharSequence>adapterCarrera=ArrayAdapter.createFromResource(this, R.array.Carrera, android.R.layout.simple_spinner_item);

        adapterCarrera.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerCarrera.setAdapter(adapterCarrera);
        /*Final Spinner Carrera*/

        /*Inicio Spinner Edad*/
        Spinner spinnerEdad=findViewById(R.id.spinner_edad);
        ArrayAdapter<CharSequence>adapterEdad=ArrayAdapter.createFromResource(this, R.array.Edad, android.R.layout.simple_spinner_item);

        adapterEdad.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerEdad.setAdapter(adapterEdad);
        /*Final Spinner Edad*/

        /*Inicio Spinner Sexo*/
        Spinner spinnerSexo=findViewById(R.id.spinner_sexo);
        ArrayAdapter<CharSequence>adapterSexo=ArrayAdapter.createFromResource(this, R.array.Sexo, android.R.layout.simple_spinner_item);

        adapterSexo.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerSexo.setAdapter(adapterSexo);
        /*Final Spinner Sexo*/

    }

}
