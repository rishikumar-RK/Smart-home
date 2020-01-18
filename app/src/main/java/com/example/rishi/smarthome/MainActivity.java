package com.example.rishi.smarthome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.ToggleButton;


import com.firebase.client.Firebase;



public class MainActivity extends AppCompatActivity {
    private Firebase iot;
    ToggleButton toggle1,toggle2,toggle3,toggle4;
    ImageButton img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);
        iot=new Firebase(" Enter url of your firebase database");
        toggle1=findViewById(R.id.toggle1);
        toggle2=findViewById(R.id.toggle2);
        toggle3=findViewById(R.id.toggle3);
        toggle4=findViewById(R.id.toggle4);
        img=findViewById(R.id.imageButton);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Developed by Rishi",Toast.LENGTH_LONG).show();
            }
        });



        toggle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle1.isChecked()) {
                    Firebase home = iot.child("light1");
                    home.setValue("1");
                }
                else{
                    Firebase home=iot.child("light1");
                    home.setValue("0");
                }
            }
        });
        toggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle2.isChecked()) {
                    Firebase home = iot.child("light2");
                    home.setValue("1");
                }
                else{
                    Firebase home=iot.child("light2");
                    home.setValue("0");
                }
            }
        });
        toggle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle3.isChecked()) {
                    Firebase home = iot.child("light3");
                    home.setValue("1");
                }
                else{
                    Firebase home=iot.child("light3");
                    home.setValue("0");
                }
            }
        });
        toggle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toggle4.isChecked()) {
                    Firebase home = iot.child("light4");
                    home.setValue("1");
                }
                else{
                    Firebase home=iot.child("light4");
                    home.setValue("0");
                }
            }
        });





    }
}
