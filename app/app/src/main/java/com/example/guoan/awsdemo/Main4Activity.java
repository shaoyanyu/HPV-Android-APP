package com.example.guoan.awsdemo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by liuqianyu on 11/30/17.
 */

public class Main4Activity extends AppCompatActivity {


    EditText text1, text2, text3, text4,text5, text6;
    ImageButton button1, button2;
    MediaPlayer mp1, mp2;

    ImageButton home, visit, contact, more, resource;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        text1=(EditText)findViewById(R.id.editText4);
        text2=(EditText)findViewById(R.id.editText5);
        text3=(EditText)findViewById(R.id.editText6);
        text4=(EditText)findViewById(R.id.editText7);
        text5=(EditText)findViewById(R.id.editText8);
        text6=(EditText)findViewById(R.id.editText9);
        button1=(ImageButton)findViewById(R.id.imageButton2);
        button2=(ImageButton)findViewById(R.id.imageButton3);

        mp1=MediaPlayer.create(this,R.raw.a);
        mp2=MediaPlayer.create(this,R.raw.b);

        home=(ImageButton)findViewById(R.id.buttonBook);
        visit=(ImageButton)findViewById(R.id.buttonVisit);
        contact=(ImageButton)findViewById(R.id.buttonContact);
        more=(ImageButton)findViewById(R.id.buttonMore);
        resource=(ImageButton)findViewById(R.id.buttonResource);

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                mp1.start();
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                mp2.start();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main2Activity.class);
                startActivity(k);
            }
        });
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main4Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}

