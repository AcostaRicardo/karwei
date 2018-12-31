package com.acosta.ricardo.logindemo;

import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FirebaseDatabaseHelper {

    private FirebaseDatabase mDatabase;
    private DatabaseReference mReferenceKarweis;
    private List<Karwei> karweis = new ArrayList<>();

    public interface DataStatus{
        void DataIsLoaded(List<Karwei> karweis, List<String> keys);
        void DataIsInserted();
        void DataIsUpdated();
        void DataIsDeleted();
    }

    public FirebaseDatabaseHelper(){
        mDatabase = FirebaseDatabase.getInstance();
        mReferenceKarweis = mDatabase.getReference("karweis");
    }

    public void readKarweis(final DataStatus dataStatus){
        mReferenceKarweis.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //BIJ EEN VERANDERING IN DE DB ZAL DE KLASSE LEEG GEMAAKT WORDEN EN TERUG INGEVULD WORDEN
                karweis.clear();
                List<String> keys = new ArrayList<>();

                for(DataSnapshot keyNode : dataSnapshot.getChildren()){
                    keys.add(keyNode.getKey());
                    Karwei karwei = keyNode.getValue(Karwei.class);
                    karweis.add(karwei);
                }
                dataStatus.DataIsLoaded(karweis,keys);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
