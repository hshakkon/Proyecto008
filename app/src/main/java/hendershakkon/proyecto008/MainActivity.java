package hendershakkon.proyecto008;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.et1) ;
    }

    // Método ejecutado al presionar el botón generar
    public void generar(View view){
        et1.setText("");
        et1.requestFocus();
        num=(int)(Math.random()*100001);
        String cadena = String.valueOf(num);
        Toast notificacion=Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();
    }

    // Método ejecutado al presionar el botòn verificar
    public void verificar(View view){
        String valorIngresado = et1.getText().toString();
        int valor=Integer.parseInt(valorIngresado);
        if (valor==num){
            Toast notificacion=Toast.makeText(this,"Muy bien, recordaste el número mostrado.",Toast.LENGTH_LONG);
            notificacion.show();
        }
        else {
            Toast notificacion=Toast.makeText(this,"Lo siento, pero ese no es el número.",Toast.LENGTH_LONG);
            notificacion.show();
        }
    }
}
