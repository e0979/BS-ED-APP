import android.view.View;
import android.widget.TextView;

import com.example.Besign.calculadoraedil.R;

/**
 * Created by yesenia on 9/16/14.
 */
public abstract class ButtonClickListener implements View.OnClickListener {

    private TextView Scr; //Pantalla de Texto

    public void OnClick (View v) {
        switch (v.getId()){
            case R.id.botonC: //limpiar pantalla
                Scr.setText ("0");

        }
    }
}
