package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUser, edPass;
    Button btnOK;
    String usr, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK=findViewById(R.id.button);
        edUser=findViewById(R.id.editUser);
        edPass=findViewById(R.id.editPassword);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usr = edUser.getText().toString();
                password = edPass.getText().toString();

                if(edUser.getText().toString().equals("Annisa")&&edPass.getText().toString().equals("annisa16")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUKSES || email : " + usr + " password : " + password + "", Toast.LENGTH_LONG);
                    t.show();
                }
                else{
                    Toast.makeText((getApplicationContext()), "Username atau Password Anda salah",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}