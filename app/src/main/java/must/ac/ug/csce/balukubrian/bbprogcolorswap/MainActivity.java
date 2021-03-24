package must.ac.ug.csce.balukubrian.bbprogcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] colorForRandom;

        //in the onCreate
        colorForRandom = new int[] {
                (R.color.black),
                (R.color.red),
                (R.color.yellow),
                (R.color.green),
                (R.color.purple_700),
                (R.color.teal_200),
                (R.color.teal_700),
        };

        final Button tapMebutton = findViewById(R.id.tap_me_button);
        final TextView textview_Tap_to_Change_Color = findViewById(R.id.textview_Tap_to_Change_Color);

        tapMebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                textview_Tap_to_Change_Color.setBackgroundColor(getResources().getColor(R.color.black));
//                textview_Tap_to_Change_Color.setBackgroundColor(getResources().getColor(R.color.yellow));
//                textview_Tap_to_Change_Color.setBackgroundColor(getResources().getColor(R.color.red));
//                textview_Tap_to_Change_Color.setBackgroundColor(getResources().getColor(R.color.green));
//                textview_Tap_to_Change_Color.setBackgroundColor(getResources().getColor(R.color.teal_200));
//                textview_Tap_to_Change_Color.setBackgroundColor(getResources().getColor(R.color.purple_700));

                int arrayLength;
                arrayLength = colorForRandom.length;

                Random randomColor = new Random();
                int rNum = randomColor.nextInt(arrayLength);

                textview_Tap_to_Change_Color.setTextColor(colorForRandom[rNum]);



            }
        });


    }
}