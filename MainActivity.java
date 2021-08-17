package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnlogin;
    EditText send_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send_text = (EditText)findViewById(R.id.editText1);
        btnlogin = (Button) findViewById(R.id.button);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str = send_text.getText().toString();
                Intent intent = new Intent(getApplicationContext(),secondactivity.class);
                intent.putExtra("Value",str);
                startActivity(intent);

            }
        });


    }
}