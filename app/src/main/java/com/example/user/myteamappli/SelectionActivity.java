package com.example.user.myteamappli;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

/**
 * Created by user on 8/05/2017.
 */

public class SelectionActivity extends Activity {
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection);
        ListView listView = (ListView) findViewById(R.id.list) ;


        // Defined Array values to show in ListView
        String[] values = new String[] {
                "Android List View",
                "Adapter implementation",
                "Simple List View In Android",
                "Create List View Android",
                "Android Example",
                "List View Source Code",
                "List View Array Adapter",
                "Android Example List View"
        };
        Boolean[] switchVal = new Boolean[] {
                true,
                false,
                true,
                true,
                true,
                false,
                false,
                true
        };

        Switch mySwitch = (Switch) findViewById(R.id.switch1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listselection, R.id.switch_text, values);
        listView.setAdapter(adapter);


        //mySwitch.setChecked(true);

    }
}
