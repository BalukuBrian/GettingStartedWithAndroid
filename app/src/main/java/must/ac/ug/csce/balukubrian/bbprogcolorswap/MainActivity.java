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

        final Button tapMebutton = findViewById(R.id.tap_me_button);
        final TextView tvChangeColor = findViewById(R.id.tvChangeColor);

        tapMebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int r = random.nextInt(255);
                int g = random.nextInt(255);
                int b = random.nextInt(255);

                int textfinalColor = Color.rgb(r, g, b);

                tvChangeColor.setTextColor(textfinalColor);
                tvChangeColor.setText("COLOR: "+ Integer.toString(r)+ "r, "+ Integer.toString(g)+ "g, " + Integer.toString(b)+ "b, ");
            }
        });
    }
}