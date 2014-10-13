package com.example.Besign.calculadoraedil;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by yesenia on 9/16/14.
 */
public class ButtonClickListener implements View.OnClickListener {

    public void getKeyboard (String str) {
        String ScrCurrent = Scr.getText ().toString();
        ScrCurrent += str;
        Scr.setText(ScrCurrent);
    }

    private TextView Scr;
    private String Operation;

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.botonC: //limpiar pantalla
                Scr.setText ("0");
                Operation = "";
                break;
            default:
                String numb = ((Button) v).getText().toString();
                getKeyboard (numb);
                break;
        }
    }
}
