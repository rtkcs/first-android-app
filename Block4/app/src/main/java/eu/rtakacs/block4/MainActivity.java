package eu.rtakacs.block4;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Button buttonPlay;
    Button buttonPause;
    MediaPlayer mediaPlayer;
    Switch switchLooping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay = (Button)findViewById(R.id.buttonPlay);
        buttonPause = (Button) findViewById(R.id.buttonPause);
        mediaPlayer = MediaPlayer.create(this, R.raw.berliner_philharmoniker_the_nutcracker_suite_);
        switchLooping = (Switch) findViewById(R.id.switchLooping);
        switchLooping.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mediaPlayer.setLooping(isChecked);
            }
        });
    }

    public void play(View view){
        mediaPlayer.start();
        mediaPlayer.
    }

    public void pause(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }
}