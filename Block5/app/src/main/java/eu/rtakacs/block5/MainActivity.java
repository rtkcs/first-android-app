package eu.rtakacs.block5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("COLOR_PREFERENCES", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.mainLayout);

        if(preferences.contains("colorId")){
            int bgColor = preferences.getInt("colorId", 0);
            layout.setBackgroundColor(bgColor);
        }


        RadioGroup radioGroupColors = (RadioGroup) findViewById(R.id.radioGroupColors);
        radioGroupColors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int colorCode = 0;
                switch (checkedId){
                    case R.id.red:
                        colorCode = Color.RED;
                        break;
                    case R.id.yellow:
                        colorCode = Color.YELLOW;
                        break;
                    case R.id.green:
                        colorCode = Color.GREEN;
                        break;
                }
                layout.setBackgroundColor(colorCode);
                editor.putInt("colorId", colorCode);
                editor.commit();
            }
        });
    }

}