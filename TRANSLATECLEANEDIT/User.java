package com.company;

public abstract class User{
    private String username;
    private String password;
    private PersoInfo persoInfo;
    private Address address;
    private ProgLangs progLangs;
    private Gender gender;
    private Pref pref;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public PersoInfo getPersoInfo() {
        return persoInfo;
    }
    public void setPersoInfo(PersoInfo persoInfo) {
        this.persoInfo = persoInfo;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public ProgLangs getProgLangs() {
        return progLangs;
    }
    public void setProgLangs(ProgLangs progLangs) {
        this.progLangs = progLangs;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Pref getPref() {
        return pref;
    }
    public void setPref(Pref pref) {
        this.pref = pref;
    }

    public User() {
    }

    public User(String username, String password, PersoInfo persoInfo, Address address, ProgLangs progLangs, Gender gender, Pref pref) {
        this.username = username;
        this.password = password;
        this.persoInfo = persoInfo;
        this.address = address;
        this.progLangs = progLangs;
        this.gender = gender;
        this.pref = pref;
    }

    public void printMyInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + username + '\'' +
                ", persoInfo=" + persoInfo +
                ", address=" + address +
                ", progLangs=" + progLangs +
                ", gender=" + gender +
                ", pref=" + pref +
                '}';
    }
}
