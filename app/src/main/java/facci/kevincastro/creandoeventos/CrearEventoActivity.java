package facci.kevincastro.creandoeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.textfield.TextInputLayout;

public class CrearEventoActivity extends AppCompatActivity {

    EditText name_event, org_event, lugar_event, hora_event, fecha_event, contact_event;
    Button btn_guardar;
    TextInputLayout namein, orgin, lugarin, horain, fechain, contactin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_evento);

        name_event = (EditText) findViewById(R.id.crear_nombre);
        namein = (TextInputLayout) findViewById(R.id.input_evento);
        org_event = (EditText) findViewById(R.id.crear_organizador);
        orgin = (TextInputLayout) findViewById(R.id.input_evento2);
        lugar_event = (EditText) findViewById(R.id.crear_lugar);
        lugarin = (TextInputLayout) findViewById(R.id.input_evento3);
        hora_event = (EditText) findViewById(R.id.crear_hora);
        horain = (TextInputLayout) findViewById(R.id.input_evento4);
        fecha_event = (EditText) findViewById(R.id.crear_fecha);
        fechain = (TextInputLayout) findViewById(R.id.input_evento5);
        contact_event = (EditText) findViewById(R.id.crear_contacto);
        contactin = (TextInputLayout) findViewById(R.id.input_evento6);

    }

    public boolean validar() {
        boolean retorno;
        String name_reg = name_event.getText().toString();
        String org_reg = org_event.getText().toString();
        String lugar_reg = lugar_event.getText().toString();
        String hora_reg = hora_event.getText().toString();
        String fecha_reg = fecha_event.getText().toString();
        String contact_reg = contact_event.getText().toString();
        if (name_reg.isEmpty()) {
            namein.setError("Ingrese un nombre al Evento");
            return false;
        }
        if (org_reg.isEmpty()) {
            orgin.setError("Nombre a un Organizador");
            return false;
        }
        if (lugar_reg.isEmpty()) {
            lugarin.setError("Ingrese el lugar del Evento");
            return false;
        }
        if (hora_reg.isEmpty()) {
            horain.setError("Ingrese la hora del Evento");
            return false;
        }
        if (fecha_reg.isEmpty()) {
            fechain.setError("Ingrese la fecha del Evento");
            return false;
        }
        if (contact_reg.isEmpty()) {
            fechain.setError("Ingrese un # de teléfono");
            return false;
        }
        return true;
    }

    public void iniciarCrearEvento (View view){
        if (validar()==true) {
            Intent i = new Intent(this, PrincipalActivity.class);
            startActivity(i);
        }
    }

}