package eu.rtakacs.block1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        Button button3 = new Button(getApplicationContext());
        button3.setTextColor(Color.BLACK);
        button3.setBackgroundColor(Color.parseColor("#FD9BF3"));
        button3.setText("The Pink Panther's To Do List");
        button3.setOnClickListener(this);

        RelativeLayout rl = (RelativeLayout) findViewById(R.id.relativeLayoutMainScreen);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.BELOW, button2.getId());
        rl.addView(button3, params);
    }

    public void button1OnClick(View view){
        Toast.makeText(getBaseContext(),"Invisible Man's ToDo List....", Toast.LENGTH_SHORT).show();
        button1.setVisibility(View.INVISIBLE);
    }
    public void button2OnClick(View view){
        Toast.makeText(getBaseContext(),"Pink Panther's ToDo List....", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getBaseContext(), "Programmatically added Button3 clicked", Toast.LENGTH_SHORT).show();
    }
}