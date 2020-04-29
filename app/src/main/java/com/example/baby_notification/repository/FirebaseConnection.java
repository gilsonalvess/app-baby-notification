package com.example.baby_notification.repository;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class FirebaseConnection {
    public static DatabaseReference databaseReference() {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference dbReference = database.getReference();
        return dbReference;
    }
}

