package com.example.guoan.awsdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by liuqianyu on 12/3/17.
 */

public class Main33Activity extends AppCompatActivity {

    EditText text1, text2, text3, text4, text5, text6;
    TextView view1, view2;
    ImageButton home, visit, contact, more, resource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);

        text1=(EditText)findViewById(R.id.editText19);
        text2=(EditText)findViewById(R.id.editText20);
        text3=(EditText)findViewById(R.id.editText21);
        text4=(EditText)findViewById(R.id.editText22);
        text5=(EditText)findViewById(R.id.editText23);
        text6=(EditText)findViewById(R.id.editText25);
        view1=(TextView)findViewById(R.id.textView8);
        view2=(TextView)findViewById(R.id.textView12);

        home=(ImageButton)findViewById(R.id.buttonBook);
        visit=(ImageButton)findViewById(R.id.buttonVisit);
        contact=(ImageButton)findViewById(R.id.buttonContact);
        more=(ImageButton)findViewById(R.id.buttonMore);
        resource=(ImageButton)findViewById(R.id.buttonResource);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main33Activity.this,Main2Activity.class);
                startActivity(k);
            }
        });

        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main33Activity.this,Main17Activity.class);
                startActivity(k);
            }
        });
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main33Activity.this,Main25Activity.class);
                startActivity(k);
            }
        });
        resource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main33Activity.this,Main19Activity.class);
                startActivity(k);
            }
        });
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(Main33Activity.this,Main24Activity.class);
                startActivity(k);
            }
        });

    }
}
