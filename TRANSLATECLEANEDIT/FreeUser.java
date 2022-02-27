package com.company;

public class FreeUser extends User {
    public FreeUser() {
    }

    public FreeUser(String username, String password, PersoInfo persoInfo, Address address, ProgLangs progLangs, Gender gender, Pref pref) {
        super(username, password, persoInfo, address, progLangs, gender, pref);
    }

    @Override
    public String toString() {
        return "FreeUser{" +
                "username='" + getUsername() + '\'' +
                ", persoInfo=" + getPersoInfo() +
                ", address=" + getAddress() +
                ", progLangs=" + getProgLangs() +
                ", gender=" + getGender() +
                ", pref=" + getPref() +
                '}';
    }
}
