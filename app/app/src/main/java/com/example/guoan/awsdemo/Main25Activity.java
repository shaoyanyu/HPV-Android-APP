package com.example.guoan.awsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Main25Activity extends AppCompatActivity {
   Button button,button2;
    ImageButton home, visit, contact, more, resource;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
        button=(Button)findViewById(R.id.button27);
        button2=(Button)findViewById(R.id.button26);
        home=(ImageButton)findViewById(R.id.buttonBook);
        visit=(ImageButton)findViewById(R.id.buttonVisit);
        contact=(ImageButton)findViewById(R.id.buttonContact);
        more=(ImageButton)findViewById(R.id.buttonMore);
        resource=(ImageButton)findViewById(R.id.buttonResource);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main25Activity.this,Main26Activity.class);
                startActivity(k);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main25Activity.this,Main27Activity.class);
                startActivity(k);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main25Activity.this,Main2Activity.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main25Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });

        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main25Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main25Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });
    }
}
