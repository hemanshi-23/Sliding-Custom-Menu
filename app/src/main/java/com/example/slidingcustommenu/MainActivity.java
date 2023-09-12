package com.example.slidingcustommenu;

import static android.widget.Toast.LENGTH_SHORT;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView MenuIcon;
    DrawerLayout myDrawerLayout;
    LinearLayout myTripText,myTrainTxt,myBookingText,myRailwayTxt,myRailHelpTxt,myPrivacyPolicyTxt,myMoreAdsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MenuIcon = (ImageView) findViewById(R.id.MenuIcon);
        myDrawerLayout =(DrawerLayout)findViewById(R.id.drawerLayout);

        myTripText = (LinearLayout) findViewById(R.id.myTripText);
        myTrainTxt = (LinearLayout) findViewById(R.id.myTrainTxt);
        myBookingText = (LinearLayout) findViewById(R.id.myBookingText);
        myRailwayTxt = (LinearLayout) findViewById(R.id.myRailwayTxt);
        myRailHelpTxt = (LinearLayout) findViewById(R.id.myRailHelpTxt);
        myPrivacyPolicyTxt = (LinearLayout) findViewById(R.id.myPrivacyPolicyTxt);
        myMoreAdsTxt = (LinearLayout) findViewById(R.id.myMoreAdsTxt);


        MenuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                myDrawerLayout.openDrawer(GravityCompat.START);

            }
        });

        myTripText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You clicked on My Trip.", Toast.LENGTH_SHORT).show();
                myDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

        myTrainTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You Clicked on My Trains.", LENGTH_SHORT).show();
                myDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

        myBookingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You Clicked on My Bookings.", LENGTH_SHORT).show();
                myDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

        myRailwayTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You Clicked on My Railway Wifi.", LENGTH_SHORT).show();
                myDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

        myRailHelpTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You Clicked on My Railway HelpLine.", LENGTH_SHORT).show();
                myDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        });


        myPrivacyPolicyTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You Clicked on My Privacy Policy.", LENGTH_SHORT).show();
                myDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

        myMoreAdsTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"You Clicked on My More Ads.", LENGTH_SHORT).show();
                myDrawerLayout.closeDrawer(Gravity.LEFT);
            }
        });

    }
}