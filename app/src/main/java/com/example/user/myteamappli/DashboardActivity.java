package com.example.user.myteamappli;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
/**
 * Created by micka on 5/5/2017.
 */

public class DashboardActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        Bundle extra = getIntent().getExtras();
        //Get the user name
        String msg = "";
        if(extra != null)
            msg = getIntent().getStringExtra(MainActivity.ID_USER);
        else
            msg = "error";


       TextView textview = (TextView) findViewById(R.id.msg);
        textview.setText(msg);

        final Button bselect = (Button) findViewById(R.id.id_bselection);
        bselect.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent selectionActivity = new Intent(DashboardActivity.this, SelectionActivity.class);
                startActivity(selectionActivity);
            }

        });


    }
}
