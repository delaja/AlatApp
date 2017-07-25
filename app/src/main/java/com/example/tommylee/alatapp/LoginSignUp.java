package com.example.tommylee.alatapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginSignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_up);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
    public void toLogin(View view) {
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }
    public void toSignup(View view) {
        Intent i = new Intent(getApplicationContext(), Signup.class);
        startActivity(i);
    }
}
