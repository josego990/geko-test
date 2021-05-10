package com.josegonzalez.test.geko;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class RegisterActivity extends AppCompatActivity {

    Context ctx;

    EditText et_name = null;
    EditText et_email = null;
    EditText et_password = null;
    EditText et_contact_number = null;

    FloatingActionButton fab_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        getSupportActionBar().setTitle("REGISTER");

        ctx = this;

        FindViews();


    }

    private void FindViews(){

        et_name = findViewById(R.id.et_name);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        et_contact_number = findViewById(R.id.et_contact_number);

        fab_save = findViewById(R.id.fab_save);

        fab_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(FormIsValid()){
                    Toast.makeText(ctx,"Data is valid.", Toast.LENGTH_LONG).show();
                    SaveUser();
                }
                else{
                    Toast.makeText(ctx,"No valid data.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean FormIsValid(){

        boolean isValid = true;

        String name = et_name.getText().toString();
        String email = et_email.getText().toString();
        String password = et_password.getText().toString();
        String contact_number = et_contact_number.getText().toString();

        if(!(name.length() > 0)){
            isValid = false;
            Toast.makeText(ctx,"Name is required.", Toast.LENGTH_LONG).show();
        }

        if(!(email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"))){
            isValid = false;
            Toast.makeText(ctx,"Valid email is required.", Toast.LENGTH_LONG).show();
        }

        if(!(password.matches("(?=.{6,})(?=.*?[^\\w\\s])(?=.*?[0-9])(?=.*?[A-Z]).*?[a-z].*"))){
            isValid = false;
            Toast.makeText(ctx,"No valid password.", Toast.LENGTH_LONG).show();
        }

        if(!(contact_number.length() == 10)){
            isValid = false;
            Toast.makeText(ctx,"Contact number should be a 10 digits.", Toast.LENGTH_LONG).show();
        }


        return isValid;

    }


    private void SaveUser(){

        //SAVE USER WITH SHARED PREFERENCES
        SharedPreferences sharedPref = RegisterActivity.this.getSharedPreferences("user_pref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("name",et_name.getText().toString());
        editor.putString("email",et_email.getText().toString());
        editor.putString("password",et_password.getText().toString());
        editor.putString("contact_number",et_contact_number.getText().toString());

        editor.commit();

        finish();

    }





}
