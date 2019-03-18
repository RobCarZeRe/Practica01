package com.example.bepis08.practica01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.TxtTexto);
        tv1 = (TextView)findViewById(R.id.TxtResultado);
        et2 = (EditText)findViewById(R.id.TxtBuscar);
    }

    //metodo para ver la cantidad de palabras

    public void Visualizar(View view) {

        String texto1 = et1.getText().toString();
        StringTokenizer a = new StringTokenizer(texto1);
        int npalabras = a.countTokens();
        String Resultado = String.valueOf(npalabras);
        String palabraBuscar="";
        int contador=0;
        palabraBuscar = et2.getText().toString();
        while(a.hasMoreTokens()){
            if(!a.nextElement().equals(palabraBuscar)){

            }else{
                contador++;
            }
        }

        tv1.setText("El numero de palabras en este texto es: "+ Resultado + "\n"
                    +"la palabra __"+palabraBuscar+"__ aparece "+contador+" en el texto");


    }
}
