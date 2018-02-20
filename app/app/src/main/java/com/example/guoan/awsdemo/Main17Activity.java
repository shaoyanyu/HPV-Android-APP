package com.example.guoan.awsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by liuqianyu on 12/2/17.
 */

public class Main17Activity extends AppCompatActivity {

     TextView textview, textview2,textview4;
     ImageView image1, image2, image3;
     EditText edittext;
     Button button1, button2;
     ImageButton home, visit, contact, more, resource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);

        textview=(TextView)findViewById(R.id.textView2);
        textview2=(TextView)findViewById(R.id.textView6);

        textview4=(TextView)findViewById(R.id.textView9);
        image1=(ImageView)findViewById(R.id.imageView5);
        image2=(ImageView)findViewById(R.id.imageView20);
        image3=(ImageView)findViewById(R.id.imageView21);
        edittext=(EditText)findViewById(R.id.editText10);
        button2=(Button)findViewById(R.id.button41);
        button1=(Button)findViewById(R.id.button40);

        home=(ImageButton)findViewById(R.id.buttonBook);
        visit=(ImageButton)findViewById(R.id.buttonVisit);
        contact=(ImageButton)findViewById(R.id.buttonContact);
        more=(ImageButton)findViewById(R.id.buttonMore);
        resource=(ImageButton)findViewById(R.id.buttonResource);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main18Activity.class);
                startActivity(k);
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main2Activity.class);
                startActivity(k);
            }
        });

        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main17Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });


    }
}
