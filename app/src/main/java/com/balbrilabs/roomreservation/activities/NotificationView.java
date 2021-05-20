package com.balbrilabs.roomreservation.activities;

import android.app.Activity;
import android.os.Bundle;

import com.balbrilabs.roomreservation.R;

public class NotificationView extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
    }
}