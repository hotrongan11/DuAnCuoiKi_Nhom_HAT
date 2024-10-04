package com.example.duan_android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button signUpButton;
    private Button loginButton;
    private Button payButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        signUpButton = findViewById(R.id.button_change);
        signUpButton.setOnClickListener(v -> {
            Intent signUpIntent = new Intent(this, SignUpActivity.class);
            startActivity(signUpIntent);
        });

        loginButton = findViewById(R.id.button_login);
        loginButton.setOnClickListener(v -> {
            Intent loginIntent = new Intent(this, LoginActivity.class);
            startActivity(loginIntent);
        });
        payButton = findViewById(R.id.btn_Pay);
        payButton.setOnClickListener(v -> {
            Intent payIntent = new Intent(this, PayActivity.class);
            startActivity(payIntent);
        });
    }
}