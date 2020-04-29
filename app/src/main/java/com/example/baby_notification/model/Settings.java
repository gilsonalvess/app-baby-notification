package com.example.baby_notification.model;

public class Settings {
    private Long id;
    private Boolean disable_alerts;

    public Settings(Boolean disable_alerts) {
        this.disable_alerts = disable_alerts;
    }

    public Boolean getDisable_alerts() {
        return disable_alerts;
    }
}
