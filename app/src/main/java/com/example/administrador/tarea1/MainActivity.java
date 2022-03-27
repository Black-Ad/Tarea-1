package com.example.administrador.tarea1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Obtenemos los botones aqui
        Button button = findViewById(R.id.submit_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Actividad2.class);

                final EditText name = findViewById(R.id.first_name_text),
                        canti = findViewById(R.id.last_name_text),
                        precio = findViewById(R.id.Precio);

                String firstNameString1 = name.getText().toString();
                String firstNameString2 = canti.getText().toString();
                String firstNameString3 = precio.getText().toString();

                if (firstNameString1.equals("") || firstNameString2.equals("") || firstNameString3.equals("")) {
                    // Detener ejecución del método
                    return;
                }

                int numero2 = Integer.parseInt(firstNameString2);
                int numero3 = Integer.parseInt(firstNameString3);
                int multi = numero2 * numero3;
                int divi = (int) (multi * 0.18);
                int igv = multi + divi;

                String str1 = String.valueOf(numero2);
                String str2 = String.valueOf(igv);


                intent.putExtra("firstNameString1", firstNameString1);
                intent.putExtra("str1", str1);
                intent.putExtra("str2", str2);
                startActivity(intent);
            }
        });
    }
}