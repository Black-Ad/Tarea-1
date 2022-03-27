package com.example.administrador.tarea1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);


        Intent intent = getIntent();
        String firstNameString1 = intent.getStringExtra("firstNameString1");
        String firstNameString2 = intent.getStringExtra("str1");
        String firstNameString3 = intent.getStringExtra("str2");


        TextView showFirstName = (TextView) findViewById(R.id.show_first_name1);
        showFirstName.setText(firstNameString1);

        TextView showFirstName2 = (TextView) findViewById(R.id.show_first_name2);
        showFirstName2.setText(firstNameString2);

        TextView showFirstName3 = (TextView) findViewById(R.id.show_first_name3);
        showFirstName3.setText(firstNameString3);
    }
}