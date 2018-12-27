package com.acosta.ricardo.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Werknemer extends AppCompatActivity {
    ListView mListView;
    String[] karweitjes = {"Auto wassen","Babysitten","Gras maaien","Hond uitlaten","Kast monteren",
            "Computer Repareren","Photoshoot","De afwas doen", "Kamer schilderen","Stopcontact vervangen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_werknemer);
        mListView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        mListView.setAdapter(mAdapter);
    }
}
