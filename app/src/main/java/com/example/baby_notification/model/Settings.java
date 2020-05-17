package com.example.baby_notification.model;

import java.io.Serializable;

public class Settings implements Serializable {
    //private Long id;
    private Boolean disable_alerts;
    private String sound_time;

    public Settings(Boolean disable_alerts, String sound_time) {
        this.disable_alerts = disable_alerts;
        this.sound_time = sound_time;
    }

    public Boolean getDisable_alerts() {
        return disable_alerts;
    }

    public String getSound_time() {
        return sound_time;
    }
}
