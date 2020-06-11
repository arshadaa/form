package com.example.loginregistrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etMail;
    EditText etPass;

    RadioButton r1;
    RadioButton r2;
    RadioGroup r;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      etName = (EditText) findViewById(R.id.input_name);
      etMail = (EditText) findViewById(R.id.input_email);
      etPass = (EditText) findViewById(R.id.input_password);

      r = (RadioGroup) findViewById(R.id.input_radiogrp);
      r1 = (RadioButton) findViewById(R.id.f);
      r2 = (RadioButton) findViewById(R.id.m);

     b = ( Button )findViewById(R.id.button);



     b.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             String Gender = "";


             if(r1.isChecked())
             {
                 Gender = "Female";
             }
             else
             {
                 Gender = "Male";
             }
             // best way when we have lots of radio buttons.

             int k = r.getCheckedRadioButtonId();
             RadioButton rb = (RadioButton) r.findViewById(k);



             final String name = etName.getText().toString();
             final String email = etMail.getText().toString();
             final String pass = etPass.getText().toString();

             Toast.makeText(MainActivity.this,"Name :" + name + "\n Email : "+ email + "\n Password : "+ pass + " \n Gender :"+ rb.getText().toString(), Toast.LENGTH_LONG).show();
             // Toast.makeText("Screen where you want to show this text", "String", "Duration");
                 System.out.println("Name :" + name + "\n Email : "+ email + "\n Password : "+ pass + " \n Gender :"+ Gender);
                 //Whenever we want to access the variable from anonymous class make variable final.

          Intent intent = new Intent(MainActivity.this, Activity2.class);
            intent.putExtra("sname", name);
             intent.putExtra("sgender", rb.getText().toString());
             intent.putExtra("semail", email);
             intent.putExtra("spass", pass);
             startActivity(intent);
         }
     });
    }
}
