package com.balbrilabs.roomreservation.activities;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

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

                Boolean checkUserDataInserted = db.insertUserData(formUsername, formPassword);

                if (checkUserDataInserted == true) {
                    Toast.makeText(RegistrationActivity.this, "Data has been Inserted", Toast.LENGTH_SHORT).show();
                    addNotification();

                } else {
                    Toast.makeText(RegistrationActivity.this, "Data not inserted", Toast.LENGTH_SHORT).show();
                    dataNotInsertedNotification();
                }

                Intent intent = new Intent(getApplicationContext(), OrderService.class);
                startActivity(intent);
                finish();

            }
        });


        /*sign in */
        btnsignin_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    /*notification*/
    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                        .setContentTitle(getString(R.string.notification_title))
                        .setContentText(getString(R.string.notification_message));

        Intent notificationIntent = new Intent(this, RegistrationActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }

    private void dataNotInsertedNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.ic_baseline_notifications_24)
                        .setContentTitle(getString(R.string.notification_title))
                        .setContentText(getString(R.string.data_not_inserted));

        Intent notificationIntent = new Intent(this, RegistrationActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
}