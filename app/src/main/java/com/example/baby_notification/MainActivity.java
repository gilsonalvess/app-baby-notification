package com.example.baby_notification;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final DatabaseReference databaseReference = FirebaseConnection.databaseReference("alert");

        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String prevChildKey) {
                Boolean alert = false;
                String keyAlert = dataSnapshot.getKey();
                if ("alert".equals(keyAlert)){
                    alert = dataSnapshot.getValue(Boolean.class);
                }
                Log.d("debug", "Alerta recebido: " + dataSnapshot);

                if (alert){
                    Toast.makeText(MainActivity.this, "Seu bebê pode está precisando de você!", Toast.LENGTH_SHORT ).show();
                }
            }

            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String prevChildKey) {}

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) { }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String prevChildKey) { }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) { }
        });
    }

}
