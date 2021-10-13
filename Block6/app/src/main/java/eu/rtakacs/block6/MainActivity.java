package eu.rtakacs.block6;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewLarge = (ImageView) findViewById(R.id.imageViewLarge);
        ImageView imageViewSmall = (ImageView) findViewById(R.id.imageViewSmall);
        SeekBar seekBarTuner = (SeekBar) findViewById(R.id.seekBarTunner);
        seekBarTuner.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int lastProgress = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                lastProgress = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                imageViewLarge.setColorFilter(Color.argb(255-lastProgress, (int) 0, 0, 0));
            }
        });


    }
}