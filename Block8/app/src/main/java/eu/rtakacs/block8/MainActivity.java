package eu.rtakacs.block8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View view){
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        float rating = ratingBar.getRating();

        Toast.makeText(getApplicationContext(), String.valueOf(rating) + " stars", Toast.LENGTH_LONG).show();

        Intent intentGo2Second = new Intent();
        intentGo2Second.setClass(this, SecondActivity.class);
        intentGo2Second.putExtra("numberOfStart", rating);
        startActivity(intentGo2Second);
        finish();
    }
}