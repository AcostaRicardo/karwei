package com.acosta.ricardo.logindemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnWerknemer = (Button) findViewById(R.id.btnWerknemer);
        Button btnWerkgever = (Button) findViewById(R.id.btnWerkgever);
        btnWerkgever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, Werkgever.class);
                startActivity(intent);
            }
        });
        btnWerknemer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, Werknemer.class);
                startActivity(i);
            }
        });
    }
}
