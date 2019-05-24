package com.example.hero_archive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        EditText editTextUser;
        EditText editTextPass;
        Button  buttonLogin;
        TextView textViewRegister;
        Database_Archive db;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new Database_Archive( this);
        editTextUser = (EditText)findViewById(R.id.editUser);
        editTextPass = (EditText)findViewById(R.id.editPass);
        buttonLogin = (Button)findViewById(R.id.buttonLogin);
        textViewRegister = (TextView) findViewById(R.id.textViewRegister);
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = editTextUser.getText().toString().trim();
                String password = editTextPass.getText().toString().trim();
                boolean res = db.checkUser(user, password);
                if (res == true){
                    Intent perfil  = new Intent(MainActivity.this, PerfilActivity.class );
                    startActivity(perfil);
                    finish();
                    //Toast.makeText(MainActivity.this, "Usuário logou com sucesso!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Usuário ou Senha incorretos!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
