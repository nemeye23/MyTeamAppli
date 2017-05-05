package com.example.user.myteamappli;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

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
    }
}
