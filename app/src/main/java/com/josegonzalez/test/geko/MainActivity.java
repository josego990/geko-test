package com.josegonzalez.test.geko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Context ctx = null;

    TextView tv_name = null;
    TextView tv_email = null;
    TextView tv_contact_number = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("WELCOME");

        ctx = this;

        FindViews();
        GetSharedPreferences();

    }

    private void FindViews(){

        tv_name = findViewById(R.id.tv_name);
        tv_email = findViewById(R.id.tv_email);
        tv_contact_number = findViewById(R.id.tv_contact_number);

    }


    private void GetSharedPreferences(){

        SharedPreferences sp =  getSharedPreferences("user_pref",MODE_PRIVATE);

        String name = sp.getString("name", "none_name");
        String email = sp.getString("email", "none_email");
        String contact_number = sp.getString("contact_number", "none_contact");

        tv_name.setText(name);
        tv_email.setText(email);
        tv_contact_number.setText(contact_number);

        //Toast.makeText(ctx, name + " " + password, Toast.LENGTH_LONG).show();

    }

}