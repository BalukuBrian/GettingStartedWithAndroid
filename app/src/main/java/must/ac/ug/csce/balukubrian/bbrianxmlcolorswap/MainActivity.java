package must.ac.ug.csce.balukubrian.bbrianxmlcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

   /* int  isZero = 0, isOne = 1, isTwo = 2, isThree = 4, isFour = 4, isFive = 5;
    int click = 0;
*/



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button tapMebutton = findViewById(R.id.tap_me_button);
        final TextView tvChangeColor = findViewById(R.id.tvChangeColor);

        List<Integer> colors = new ArrayList<>();
        colors.add(getResources().getColor(R.color.red));
        colors.add(getResources().getColor(R.color.darkorange));
        colors.add(getResources().getColor(R.color.green));
        colors.add(getResources().getColor(R.color.purple));
        colors.add(getResources().getColor(R.color.blue));
        colors.add(getResources().getColor(R.color.black));
        colors.add(getResources().getColor(R.color.teal_700));
        colors.add(getResources().getColor(R.color.teal_200));
        colors.add(getResources().getColor(R.color.purple_700));
        colors.add(getResources().getColor(R.color.purple_500));
        colors.add(getResources().getColor(R.color.purple_200));
        colors.add(getResources().getColor(R.color.yellow));
        colors.add(getResources().getColor(R.color.pink));



        tapMebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tapMebutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int color = randomColor();
                        if(tvChangeColor.getCurrentTextColor() != color){
                            tvChangeColor.setTextColor(color);
                        }else{
                            tvChangeColor.setTextColor(randomColor());
                        }
                    }
                });


            }

            private int randomColor(){
                Random rand = new Random();
                return colors.get(rand.nextInt(colors.size()));

            }
});
}}