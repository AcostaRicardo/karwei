package com.acosta.ricardo.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Werknemer extends AppCompatActivity {
    ListView mListView;

    Karwei[] job = new Karwei[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_werknemer);

        job[0] = new  Karwei("Auto wassen","auto is vies, was het voor 50 euro","lol@gmail.com");
        job[1] = new  Karwei("gras maaien","het gras staat hoog, maai dit af voor 50 euro","test@gmail.com");

        final String[] karweitjes = {job[0].getTitle(),job[1].getTitle()};

        mListView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,karweitjes);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                  //VERGELIJKT
                  for(int i = 0; i < job.length;i++){
                  if(karweitjes[position] == job[i].getTitle()){
                      Toast.makeText(Werknemer.this,job[i].getDescription(),Toast.LENGTH_LONG).show();
                  }
                  //NIEUWE INTENT



                }

            }
        });
    }
}
