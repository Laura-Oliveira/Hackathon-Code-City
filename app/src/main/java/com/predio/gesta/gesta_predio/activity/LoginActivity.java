package com.predio.gesta.gesta_predio.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.predio.gesta.gesta_predio.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText emailInput = findViewById(R.id.edit_login_emailID);
        final EditText senhaInput = findViewById(R.id.edit_login_senhaID);

        Button botaoLogar = findViewById(R.id.botao_logarID);

        botaoLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(emailInput.getText().toString().equals("user@gmail.com") && senhaInput.getText().toString().equals("123456")) {

                    Intent principalIntent = new Intent(LoginActivity.this, PrincipalActivity.class);
                    startActivity(principalIntent);
                }

            }
        });

    }
}
