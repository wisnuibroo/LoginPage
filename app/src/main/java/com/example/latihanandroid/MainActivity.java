package com.example.latihanandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    // variabel komponen dibuat global
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constaint);

        // konek var komponen ke layoutnya
        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // ini action kliknya button login
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                Toast.makeText(MainActivity.this, txtUsername.getText().toString(), Toast.LENGTH_SHORT).show();

                if (username.equals("admin") && password.equals("admin")){
                    // menuju ke activity kalkulator
                    Intent intent = new Intent(MainActivity.this, Kalkulator.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Gagal login", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}