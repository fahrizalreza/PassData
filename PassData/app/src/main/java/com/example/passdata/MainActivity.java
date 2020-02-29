package com.example.passdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    String description = "Android Tutorial";
    String nameValue;
    Button submitBtn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        submitBtn = (Button) findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameValue = editText.getText().toString();
                intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("NAME", nameValue);
                intent.putExtra("DESCRIPTION", description);
                startActivity(intent);
            }
        });
    }
}
