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
import com.balbrilabs.roomreservation.database.Database;

public class RegistrationActivity extends AppCompatActivity {

    Database db;
    private EditText username_signup;
    private EditText password_signup;
    private Button btnsignin_signup;
    private Button btnsignup_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        /* variables */
        username_signup = findViewById(R.id.username_signup);
        password_signup = findViewById(R.id.password_signup);

        btnsignin_signup = findViewById(R.id.btnsignin_signup);
        btnsignup_signup = findViewById(R.id.btnsignup_signup);

        db = new Database(this);

        /* for Sign Up */
        btnsignup_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String formUsername = username_signup.getText().toString().trim();
                String formPassword = password_signup.getText().toString().trim();

                if (TextUtils.isEmpty(formUsername)) {
                    username_signup.setError("Username Field Required.");
                    return;
                }

                if (TextUtils.isEmpty(formPassword)) {
                    password_signup.setError("Password Field Required.");
                    return;
                }

                Boolean checkUserDataUpdate = db.insertUserData(formUsername, formPassword);
                if (checkUserDataUpdate == true) {
                    Toast.makeText(RegistrationActivity.this, "Data has been Inserted", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(RegistrationActivity.this, "Data not inserted", Toast.LENGTH_SHORT).show();
                }

            }
        });


        /*sign in */
        btnsignin_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegistrationActivity.this, "Sign In was clicked", Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
//                startActivity(intent);
            }
        });


    }
}