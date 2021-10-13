package eu.rtakacs.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intentCaller = getIntent();
        float stars = intentCaller.getFloatExtra("numberOfStart", 0);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("Welcome to second activity! You selected " + stars + " stars.");
    }
}