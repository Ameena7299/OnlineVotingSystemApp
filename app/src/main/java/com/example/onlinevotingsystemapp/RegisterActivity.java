package com.example.onlinevotingsystemapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText Name,Password,Phone;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        Name=(EditText)findViewById(R.id.nameentry);
        Password=(EditText)findViewById(R.id.passwordentry);
        Phone=(EditText)findViewById(R.id.phoneentry);
        Register=(Button)findViewById(R.id.registerbutton);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(Name.getText().toString()))
                {
                    Toast.makeText(RegisterActivity.this, "Please enter your name first..", Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(Phone.getText().toString()))
                {
                    Toast.makeText(RegisterActivity.this, "Please enter your Phone Number first..", Toast.LENGTH_SHORT).show();
                }
                else if(TextUtils.isEmpty(Password.getText().toString()))
                {
                    Toast.makeText(RegisterActivity.this, "Please enter your password first..", Toast.LENGTH_SHORT).show();
                }
                else if(Phone.getText().toString().length()<10)
                {
                    Toast.makeText(RegisterActivity.this, "Please enter correct Phone Number..", Toast.LENGTH_SHORT).show();
                }

                else
                {

                }
            }
        });
    }
}