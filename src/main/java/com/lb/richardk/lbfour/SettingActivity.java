package com.lb.richardk.lbfour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

    Button accountbutton = (Button)findViewById(R.id.Accountbtn);
        accountbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), AccountActivity.class);
                startActivity(startIntent);
            }
        });

        Button tutorialbutton = (Button)findViewById(R.id.Tutorialbutton);
        tutorialbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), TutorialActivity.class);
                startActivity(startIntent);
            }
        });

        Button aboutbtn = (Button)findViewById(R.id.aboutbtn);
        aboutbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(startIntent);
            }
        });

        Button contactusbtn = (Button)findViewById(R.id.contactUsButton);
        contactusbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), HelpEnquireActivity.class);
                startActivity(startIntent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent startIntent = new Intent(getApplicationContext(), HomeActivity.class);
        startActivity(startIntent);
    }
}
