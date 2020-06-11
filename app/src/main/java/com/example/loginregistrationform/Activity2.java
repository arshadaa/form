package com.example.loginregistrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView name , gender, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

          Intent i = getIntent();
        String s1name = i.getStringExtra("sname");
        String s1gender = i.getStringExtra("sgender");
        String s1email = i.getStringExtra("semail");
        String s1pass = i.getStringExtra("spass");

        name = (TextView) findViewById(R.id.txtName);
        gender = (TextView) findViewById(R.id.txtGender);
        email = (TextView) findViewById(R.id.txtEmail);
        password = (TextView) findViewById(R.id.txtPassword);

        name.setText(s1name);
        gender.setText(s1gender);
        email.setText(s1email);
        password.setText(s1pass);
    }
}
