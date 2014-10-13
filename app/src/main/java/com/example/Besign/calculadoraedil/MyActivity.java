package com.example.Besign.calculadoraedil;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.lang.reflect.Array;


public class MyActivity extends Activity  {

     private TextView Scr; //Pantalla de Texto
    private float NumberBf; // salvar pantalla antes de hacer alguna operacion
    private String Operation;
    private ButtonClickListener btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Scr = (TextView) findViewById(R.id.resultado);

        int[] idList  = {

                R.id.boton0,R.id.boton1,R.id.boton2,R.id.boton3,R.id.boton4,R.id.boton5,
                R.id.boton6,R.id.boton7,R.id.boton8,R.id.boton9,R.id.botoncoma

        };


        //Codigo Botones
        final String[] valorFinal = {null};

        for (int i =0; i < idList.length; i++ ) {

            //id:idList
            //final Button btnNumber1 = (Button) findViewById(R.id.boton1);
            final Button btnNumber = (Button) findViewById(idList[i]);

            final TextView resultado = (TextView) findViewById(R.id.resultado);
            final String resultadoFinal = (String) btnNumber.getText();

           btnNumber.setOnClickListener(new OnClickListener() {

               @Override
               public void onClick(View v) {

                   if (resultado.length() > 0) {
                       valorFinal[0] += resultadoFinal;
                   } else  {
                       valorFinal[0] = resultadoFinal;
                   }

                  resultado.setText(valorFinal[0]);
               }
           });


          }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
