package com.example.hero_archive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    Database_Archive db;
    EditText editTextUser;
    EditText editTextPass;
    EditText editTextPassCnf;
    Button buttonRegister;
    TextView textViewLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new Database_Archive( this);
        editTextUser = (EditText)findViewById(R.id.editUser);
        editTextPass = (EditText)findViewById(R.id.editPass);
        editTextPassCnf = (EditText)findViewById(R.id.editPassCnf);
        buttonRegister = (Button)findViewById(R.id.buttonRegister);
        textViewLogin = (TextView) findViewById(R.id.textViewLogin);
        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Loginintent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(Loginintent);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userR = editTextUser.getText().toString().trim();
                String passwordR = editTextPass.getText().toString().trim();
                String passwordRCnf = editTextPassCnf.getText().toString().trim();

                if (passwordR.equals(passwordRCnf)){
                    long val = db.addUser(userR, passwordR);
                    if (val > 0){
                        Toast.makeText(RegisterActivity.this, "Usuário registrado com sucesso!", Toast.LENGTH_SHORT).show();
                        Intent moveToMainActivity = new Intent(RegisterActivity.this, MainActivity.class);
                        startActivity(moveToMainActivity);
                        finish();
                    } else {
                        Toast.makeText(RegisterActivity.this, "Erro ao se registrar!", Toast.LENGTH_SHORT).show();
                    }

                    } else {
                        Toast.makeText(RegisterActivity.this, "Senha não confirma!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
