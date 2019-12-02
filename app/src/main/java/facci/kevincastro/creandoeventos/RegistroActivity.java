package facci.kevincastro.creandoeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.google.android.material.textfield.TextInputLayout;

public class RegistroActivity extends AppCompatActivity {

    EditText nombre,apellido,usuario,contraseña,edad;
    RadioButton masc, fem;
    Button btn_guardar;
    TextInputLayout nombrein,apellidoin,usuarioin,contraseñain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (EditText) findViewById(R.id.editText_nombre_r);
        nombrein = (TextInputLayout) findViewById(R.id.input_nombre);
        apellido = (EditText) findViewById(R.id.editText_apellidos_r);
        apellidoin = (TextInputLayout) findViewById(R.id.input_apellido);
        usuario = (EditText) findViewById(R.id.editText_usuario_r);
        usuarioin = (TextInputLayout) findViewById(R.id.input_usuario);
        edad = (EditText) findViewById(R.id.editText_edad);
        contraseña = (EditText) findViewById(R.id.editText_contraseña_r);
        contraseñain = (TextInputLayout) findViewById(R.id.input_contraseña);
        masc = (RadioButton) findViewById(R.id.radio_masc);
        fem = (RadioButton) findViewById(R.id.radio_fem);

    }

    public boolean validar() {
        boolean retorno;
        String nombre_reg = nombre.getText().toString();
        String apellido_reg = apellido.getText().toString();
        String usuario_reg = usuario.getText().toString();
        String edad_reg = edad.getText().toString();
        String contraseña_reg = contraseña.getText().toString();
        //String contraseña_conf = conf_contraseña.getText().toString();
        if (nombre_reg.isEmpty()) {
            nombrein.setError("Ingrese su nombre");
            return false;
        }
        if (apellido_reg.isEmpty()) {
            apellidoin.setError("Ingrese sus apellidos");
            return false;
        }
        if (usuario_reg.isEmpty()) {
            usuarioin.setError("Ingrese un nombre de usuario");
            return false;
        }
        if (edad_reg.isEmpty()) {
            edad.setError("Ingrese su Edad");
            return false;
        }
        if (contraseña_reg.isEmpty()) {
            contraseñain.setError("Ingrese una contraseña");
            return false;
        }
        if (masc.isChecked()==false){
            masc.setError("");
            if (fem.isChecked()==false){
                fem.setError("");
                return false;
            }
        }
        return true;
    }
    public void iniciarSesionRegistro (View view){
        if (validar()==true) {
            Intent i = new Intent(this, PrincipalActivity.class);
            startActivity(i);
        }
    }

}
