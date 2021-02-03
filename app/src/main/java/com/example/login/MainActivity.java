package com.example.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // username and password
    private final String username = "admin";
    private final String password = "admin";

    // storing input field values
    private String enteredUsername;
    private String enteredPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // getting login button
        final Button loginButton = findViewById(R.id.login_button);

        // onClick listener on login Button
        loginButton.setOnClickListener(v -> {
            // storing the inputted values
            enteredUsername = ((EditText)(findViewById(R.id.username))).getText().toString();
            enteredPassword = ((EditText)(findViewById(R.id.password))).getText().toString();

            // validating credentials
            if(enteredUsername.equals(username) && enteredPassword.equals(password)) {
                Intent intent = new Intent(this, LoggedIn.class);
                startActivity(intent);
            }
        });
    }
}