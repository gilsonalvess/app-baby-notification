package com.example.baby_notification.service;

import androidx.annotation.NonNull;

import com.example.baby_notification.model.Settings;
import com.example.baby_notification.repository.FirebaseConnection;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.io.Serializable;

public class SettingsService implements Serializable {

    private static DatabaseReference databaseReference = FirebaseConnection.databaseReference();
    private static Settings settings;

    public static Settings getSettings() {
        databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                settings = dataSnapshot.child("settings").getValue(Settings.class);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        return settings;
    }

    public static void save(Settings settings) {
        databaseReference.child("settings").setValue(settings);
    }
}
