package com.predio.gesta.gesta_predio.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String emailInput = findViewById(R.id.edit_login_emailID);
        String senhaInput = findViewById(R.id.edit_login_senhaID);

        Button botaoLogar = findViewById(R.id.botao_logarID);

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {/* Criando o evento para esperar o clique no botão
                                             , caso clicado ele entra e executa o conteúdo*/
                //usuario = new Usuario();
                //usuario.setEmail(email.getText().toString());
                //usuario.setSenha(senha.getText().toString());

                //validarLogin();

                logar();

            }
        });

    }

    public void logar()
    {
        String email = emailInput.getText().toString();
        String senha = senhaInput.getText().toString();

        if(email == "user" && senha == "123456")
        {
            Intent principalIntent = new Intent(LoginActivity.this, PrincipalActivity.class);
            startActivity(principalIntent);
        }

    }

}
