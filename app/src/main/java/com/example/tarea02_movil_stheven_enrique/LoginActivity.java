package com.example.tarea02_movil_stheven_enrique;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText usuarioEditText = findViewById(R.id.Usuario);
        final EditText contraseñaEditText = findViewById(R.id.Contraseña);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = usuarioEditText.getText().toString();
                String contraseña = contraseñaEditText.getText().toString();

                if (usuario.equals("stheven") && contraseña.equals("1234")) {
                    Intent intent = new Intent(LoginActivity.this,HomePruebaActivity.class);
                    intent.putExtra("usuario", "Stheven");
                    startActivity(intent);
                } else if (usuario.equals("Lucia") && contraseña.equals("12345")) {
                    Intent intent = new Intent(LoginActivity.this, HomePruebaActivity.class);
                    intent.putExtra("usuario", "Lucia");
                    startActivity(intent);
                }
            }
        });
    }
}