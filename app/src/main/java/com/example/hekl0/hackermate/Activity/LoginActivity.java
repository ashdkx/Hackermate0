package com.example.hekl0.hackermate.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.hekl0.hackermate.R;
import info.hoang8f.widget.FButton;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FButton loginButton = (FButton) findViewById(R.id.login_button);
        loginButton.setCornerRadius(60);
        loginButton.setOnClickListener(this);

        TextView signupButton = findViewById(R.id.signup_button);
        signupButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.login_button) {
            Log.d(TAG, "onClick: login button");
        }
        if (v.getId() == R.id.signup_button) {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}
