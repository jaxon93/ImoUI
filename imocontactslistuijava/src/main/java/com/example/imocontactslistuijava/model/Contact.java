package com.example.imocontactslistuijava.model;

public class Contact {
    private int profile;
    private String fullname;
    private String lastOnline;

    public Contact(int profile, String fullname, String lastOnline) {
        this.profile = profile;
        this.fullname = fullname;
        this.lastOnline = lastOnline;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullname() {
        return fullname;
    }

    public String getLastOnline() {
        return lastOnline;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setLastOnline(String lastOnline) {
        this.lastOnline = lastOnline;
    }
}
