package com.example.user.myteamappli;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

import android.support.v7.widget.ButtonBarLayout;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String ID_USER = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the button
        final Button bLogin = (Button) findViewById(R.id.id_bLogin);
        bLogin.setOnClickListener( new View.OnClickListener(){
            public void onClick(View v){
                //Check if the pwd is correct
                Intent dashboardActivity = new Intent(MainActivity.this, DashboardActivity.class);

                EditText pwd = (EditText) findViewById(R.id.id_ePwd);
                EditText user = (EditText) findViewById(R.id.id_eLogin);

                //Get the value of the EditTexts
                String pwd_val = pwd.getText().toString();
                String user_val = user.getText().toString();

                CharSequence  msg_err = "Login and Pwd incorrect !" + pwd_val;
                Toast toast = Toast.makeText(getApplicationContext(), msg_err, Toast.LENGTH_SHORT);

                //Check authentication
                if(verification(user.toString(), pwd_val))
                    LaunchDashboard(dashboardActivity, user_val);
                else
                    toast.show();
            }
        });
    }

    private void LaunchDashboard(Intent intent, String user){
        intent.putExtra(ID_USER, user);
        startActivity(intent);
    }

    private boolean verification(String user, String pwd){
        if(pwd.equals("1234"))
            return true;
        else
            return false;
    }
}