package com.example.imouijava.model;

public class Chat {
    private int profile;
    private String fullname;
    private int count;

    public Chat(int profile, String fullname, int count) {
        this.profile = profile;
        this.fullname = fullname;
        this.count = count;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullname() {
        return fullname;
    }

    public int getCount() {
        return count;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
