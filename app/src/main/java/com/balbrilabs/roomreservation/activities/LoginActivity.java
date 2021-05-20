package com.balbrilabs.roomreservation.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.balbrilabs.roomreservation.R;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameLogin;
    private EditText passwordLogin;
    private Button loginButtonLogin;
    private Button signupButtonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButtonLogin = findViewById(R.id.login_button_login);
        signupButtonLogin = findViewById(R.id.signup_button_login);
        usernameLogin = findViewById(R.id.username_login);
        passwordLogin = findViewById(R.id.password_login);


        //notification


        loginButtonLogin.setOnClickListener(v -> {

            String usernameLogin = this.usernameLogin.getText().toString().trim();
            String passwordLogin = this.passwordLogin.getText().toString().trim();

            if(TextUtils.isEmpty(usernameLogin)){
                this.usernameLogin.setError("Username Field Required..");
                return;
            }
//
            if(TextUtils.isEmpty(passwordLogin)){
                this.passwordLogin.setError("Password Field Required..");
                return;
            }

            Toast.makeText(LoginActivity.this, "Log In Button clicked", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(getApplicationContext(), OrderService.class);
            startActivity(intent);
            finish();



        });


        signupButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

}
