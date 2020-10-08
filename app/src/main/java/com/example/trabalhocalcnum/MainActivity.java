package com.example.trabalhocalcnum;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNumero;
    Button btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumero = findViewById(R.id.edtValor);
        btnCalc = findViewById(R.id.btnVerd);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String txtNum = "";


                int numero = Integer.parseInt(edtNumero.getText().toString());
                if(numero%2 == 0)
                {
                    txtNum = "Par";
                }
                else
                {
                    txtNum = "Impar";
                }



                    AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                    alert.setTitle("Resultados");
                    alert.setMessage("O número é: " + txtNum + "\n" +
                            "O dobro do numero: " + (numero*2) + "\n" +
                            "Raiz Quadrada: " + Math.sqrt(numero));
                    alert.setNeutralButton("Fechar", null);
                    alert.show();


            }
        });
    }
}