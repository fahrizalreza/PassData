package com.example.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView helloTxt, welcomeTxt, descriptionTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        helloTxt = (TextView) findViewById(R.id.helloTxt);
        welcomeTxt = (TextView) findViewById(R.id.welcomeTxt);
        descriptionTxt = (TextView) findViewById(R.id.decriptionTxt);

        helloTxt.setText("Hello " + getIntent().getStringExtra("NAME"));
        welcomeTxt.setText("Welcome to community");
        descriptionTxt.setText(getIntent().getStringExtra("DESCRIPTION"));

    }
}
