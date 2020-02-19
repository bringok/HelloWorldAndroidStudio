package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv = findViewById(R.id.uname);

        st = getIntent().getExtras().getString("Value");
        tv.setText(st);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(Main2Activity.this, MainActivity.class));
    }
}
