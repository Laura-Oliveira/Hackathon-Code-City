package com.predio.gesta.gesta_predio.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.predio.gesta.gesta_predio.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button botaoLogar = findViewById(R.id.botao_logarID);

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {/* Criando o evento para esperar o clique no botão
                                             , caso clicado ele entra e executa o conteúdo*/
                //usuario = new Usuario();
                //usuario.setEmail(email.getText().toString());
                //usuario.setSenha(senha.getText().toString());

                //validarLogin();

                Intent it = new Intent(LoginActivity.this, PrincipalActivity.class);
                startActivity(it);
            }
        });

    }



}
