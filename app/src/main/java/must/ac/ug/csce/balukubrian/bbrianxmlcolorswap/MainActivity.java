package must.ac.ug.csce.balukubrian.bbrianxmlcolorswap;

import androidx.appcompat.app.AppCompatActivity;

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

            }
    });
}
}