package facci.kevincastro.creandoeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button btn_registro;
    private EditText usuario;
    private EditText contraseña;
    private TextInputLayout usuarioin, contraseñain;
    private Button botonIniciar;

    boolean usu=false;
    boolean pass=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.editText_usuario);
        usuarioin = (TextInputLayout) findViewById(R.id.input_login_usuario);
        contraseña = (EditText) findViewById(R.id.editText_contraseña);
        contraseñain = (TextInputLayout) findViewById(R.id.input_login_contraseña);
        botonIniciar = (Button) findViewById(R.id.boton_iniciar);


        btn_registro=(Button) findViewById(R.id.btn_registro);
        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegistroActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
    public void iniciarSesion (View view){
        String usuario_login = usuario.getText().toString();
        if (usuario_login.isEmpty()) {
            usuarioin.setError("Ingrese un nombre de usuario");
            usu = false;
        } else {
            usu = true;
            usuarioin.setError(null);
        }
        String contrasena_login = contraseña.getText().toString();
        if (contrasena_login.isEmpty()) {
            contraseñain.setError("Ingrese una contraseña");
            pass = false;
        } else {
            pass = true;
            contraseñain.setError(null);
        }
        if (pass==true&&usu==true){
            if (usuario_login.equals("kevin") && contrasena_login.equals("movil")) {
                Intent i = new Intent(this, PrincipalActivity.class);
                startActivity(i);
            }else {
                usuarioin.setError("");
                contraseñain.setError("");
                Toast.makeText(this,"Usuario o Contraseña incorrecta",Toast.LENGTH_LONG).show();
            }
        }
    }
}
