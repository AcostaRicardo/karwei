package com.acosta.ricardo.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Werkgever extends AppCompatActivity {





    //BUTTON
    private Button btnSendFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_werkgever);


        btnSendFirebase = (Button) findViewById(R.id.btnSend);

        btnSendFirebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}
