package eu.rtakacs.block7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.NumberPicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    NumberPicker numberPicker;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.numberPicker = (NumberPicker)findViewById(R.id.numberPicker);
        this.webView = (WebView)findViewById(R.id.webView);
        String[] possibilities = {"Android", "dennikN", "Coursera", "Supelec", "local HTML"};
        this.numberPicker.setDisplayedValues(possibilities);
        this.numberPicker.setMinValue(0);
        this.numberPicker.setMaxValue(possibilities.length-1);
        this.numberPicker.computeScroll();
    }

    public void navigate(View view){
        int choice = this.numberPicker.getValue();
        Toast.makeText(getBaseContext(), String.valueOf(choice), Toast.LENGTH_SHORT).show();
        this.webView.setWebViewClient(new WebViewClient());
        switch (choice){
            case 0:
                this.webView.loadUrl("https://www.android.com");
                break;
            case 1:
                this.webView.loadUrl("https://www.dennikn.sk");
                break;
            case 2:
                this.webView.loadUrl("https://www.coursera.org");
                break;
            case 3:
                this.webView.loadUrl("https://en.wikipedia.org/wiki/Sup%C3%A9lec");
                break;
            case 4:
                this.webView.loadUrl("file:///android_asset/local.html");
                break;
        }

    }
}