package com.example.baby_notification;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirebaseConnection {

    public static DatabaseReference databaseReference(String path) {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference dbReference = database.getReference("noise_event");
        return dbReference;
    }
}
