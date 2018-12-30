package com.acosta.ricardo.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Werkgever extends AppCompatActivity {

    //DATABASE
    private DatabaseReference mDatabase;

    //BUTTON
    private Button btnSendFirebase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_werkgever);

        //DATABASE
        mDatabase = FirebaseDatabase.getInstance().getReference();

        btnSendFirebase = (Button) findViewById(R.id.btnSend);

        btnSendFirebase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1 CREATE CHILD IN ROOT OBJECT
                // 2 ASSIGN SOME VALUE TO THE CHILD OBJECT

                mDatabase.child("namen").child("nameID").setValue("Ricardo");

            }
        });
    }
}
