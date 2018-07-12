package com.roger.medicineDatabase.users;

import java.util.ArrayList;

public abstract class UserHandler {

    private static User user;
    private static ArrayList<User> users = new ArrayList<>();


    public static void addUser(String name, String password, String userStatus){
        user = new User(name, password, userStatus);
        users.add(user);
    }

    public static boolean verifyUser(String name, String password){
        for (User user : users){
            if (user.getName().equals(name) && user.getPassword().equals(password))
                return true;
        }
        return false;
    }
}
