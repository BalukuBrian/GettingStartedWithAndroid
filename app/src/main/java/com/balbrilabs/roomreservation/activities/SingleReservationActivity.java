package com.balbrilabs.roomreservation.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.balbrilabs.roomreservation.R;


public class SingleReservationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_reservation);

    }


    public void cancelButtonClicked(View view) {
        Intent intent = new Intent(this, OrderService.class);
        startActivity(intent);
    }
}