package eu.rtakacs.block2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<CharSequence> adapterAnimals = ArrayAdapter.createFromResource(this, R.array.animalsArray, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapterAnimals);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSelected = getString(R.string.selected) + adapterAnimals.getItem(position).toString();
                Toast.makeText(getBaseContext(), itemSelected, Toast.LENGTH_SHORT).show();
            }
        });
    }
}