package com.example.user.myteamappli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.view.View;

import android.support.v7.widget.ButtonBarLayout;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the button
        Button bLogin = (Button) findViewById(R.id.id_bLogin);
        bLogin.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                LaunchDashboard();
            }
        });
    }

    private void LaunchDashboard(){
        Intent dashboardActivity = new Intent(this, DashboardActivity.class);
        EditText editext = new (EditText)findViewById(R.id.id_eLogin);

    }
}
