package com.example.alc4phase1;

public class UserProfile {

    private String name;
    private String track;
    private String country;
    private String email;
    private String phoneNumber;
    private String slackUserName;

    public UserProfile(String name, String track, String country, String email, String phoneNumber, String slackUserName) {
        this.name = name;
        this.track = track;
        this.country = country;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.slackUserName = slackUserName;
    }

    public String getName() {
        return name;
    }

    public String getTrack() {
        return track;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSlackUserName() {
        return slackUserName;
    }
}
