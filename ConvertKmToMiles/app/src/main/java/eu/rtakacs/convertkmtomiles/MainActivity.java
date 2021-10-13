package eu.rtakacs.convertkmtomiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnConvertToMiles(View view){
        EditText editTxtKms = this.findViewById(R.id.editTxtKms);
        EditText editTxtMiles = this.findViewById(R.id.editTxtMiles);
        double kms = 0.0;
        if(!editTxtKms.getText().toString().isEmpty()){
            kms = Double.parseDouble(editTxtKms.getText().toString());
        }

        double miles = kms / 1.6;
        editTxtMiles.setText(Double.toString(miles));
    }

    public void btnConvertToKm(View view){
        EditText editTxtKms = this.findViewById(R.id.editTxtKms);
        EditText editTxtMiles = this.findViewById(R.id.editTxtMiles);

        double miles = 0.0;
        if(!editTxtMiles.getText().toString().isEmpty()){
            miles = Double.parseDouble(editTxtMiles.getText().toString());
        }

        double kms = miles * 1.6;
        editTxtKms.setText(Double.toString(kms));
    }
}