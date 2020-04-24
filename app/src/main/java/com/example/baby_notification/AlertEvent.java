package com.example.baby_notification;

import com.google.firebase.database.DatabaseReference;

public class AlertEvent {

    public Boolean getAlertEvent(){

        final DatabaseReference databaseReference = FirebaseConnection.databaseReference("noise_event");

        return false;
    }


    static class Alert{
        private Boolean isAlert = false;

        public Boolean getAlert() {
            return isAlert;
        }
    }

}
