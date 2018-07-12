package com.roger.medicineDatabase.handler;

import com.roger.medicineDatabase.users.User;
import com.roger.medicineDatabase.menu.Menu;

import java.util.ArrayList;

public class Handler {

    private ArrayList<User> userArrayList;
    private Menu menu;

    public Handler(ArrayList<User> userArrayList, Menu menu) {
        this.userArrayList = userArrayList;
        this.menu = menu;
    }

    public void addUser(User user){
        userArrayList.add(user);
    }

    public ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
