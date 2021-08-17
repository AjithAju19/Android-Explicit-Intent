package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        receiver_msg = (TextView) findViewById(R.id.edit);
        Intent intent = getIntent();
        String str = intent.getStringExtra("Value");
        receiver_msg.setText(" Hi ! "+str);

    }

    public void callFirstActivity(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}