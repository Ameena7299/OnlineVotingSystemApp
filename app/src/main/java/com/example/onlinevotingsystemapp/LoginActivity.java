package com.example.onlinevotingsystemapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText Phone,Password;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Phone=(EditText)findViewById(R.id.loginphone);
        Password=(EditText)findViewById(R.id.loginpassword);
        Login=(Button)findViewById(R.id.loginbutton);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(Phone.getText().toString()))
                {
                    Toast.makeText(LoginActivity.this, "Please enter your phone number..", Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(Password.getText().toString()))
                {
                    Toast.makeText(LoginActivity.this, "Please enter your password...", Toast.LENGTH_SHORT).show();
                }
                else if(Phone.getText().toString().length() <10)
                {
                    Toast.makeText(LoginActivity.this, "Please enter correct phone number..", Toast.LENGTH_SHORT).show();
                }
                else
                {

                }
            }
        });
    }
}