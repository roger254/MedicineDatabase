package com.roger.medicineDatabase.users;

public class User {

    //user details
    private String name;
    private String password; //check for a better password input
    private String userStatus;

    public User(String name, String password, String userStatus) {
        this.name = name;
        this.password = password;
        this.userStatus = userStatus;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
