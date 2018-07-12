package com.roger.medicineDatabase.menu;

import com.roger.medicineDatabase.users.UserHandler;

import java.util.Scanner;

public class Menu {

    private final Scanner in = new Scanner(System.in);
    private boolean verified = false;
    private boolean loggedIn = false;

    public Menu() {
        openMenu();
    }

    private void openMenu() {
        System.out.println("Welcome, Please Enter 'l' to log in \nor 's' to sign up: ");
        String choice = in.next();
        switch (choice) {
            case "l":
                login();
                break;
            case "s":
                signUp();
                break;
            default: {
                System.out.println("Please enter a valid option: ");
                openMenu();
            }
        }
    }

    private void showMenuOptions() {
        if (!verified && !loggedIn)
            openMenu();

        System.out.println("Welcome to the menu: \nEnter 'a' to add items, \n'v' to view items, \n'r' to remove items: ");
        String menuChoice = in.next();
        switch (menuChoice) {
            case "a":
                addItems();
                break;
            case "v":
                viewItems();
                break;
            case "r":
                removeItems();
                break;
            default: {
                System.out.println("Wrong option:");
                showMenuOptions();
            }
        }

    }

    private void signUp() {

        System.out.println("Please enter your preferred userName: ");
        String name = in.next();
        System.out.println("Please enter your preferred password: ");
        String password = in.next();

        System.out.println("Please enter the admin code, if none enter '0': ");
        double adminCode = in.nextDouble();

        if (adminCode == 1234) {
            UserHandler.addUser(name, password, "admin");
            showMenuOptions();
        } else if (adminCode == 0) {
            UserHandler.addUser(name, password, "regularUser");
            showMenuOptions();
        } else if (Double.isNaN(adminCode)) {
            System.out.println("Wrong admin code: Try again!");
            signUp();
        }
    }

    private void login() {
        System.out.println("Please enter your userName ");
        String name = in.next();
        System.out.println("Please enter you password: ");
        String password = in.next();
        loggedIn = verified = UserHandler.verifyUser(name, password);
        if (loggedIn)
            showMenuOptions();
        else
            new Menu();
    }

    public void addItems() {
        System.out.println("Item added");
    }

    public void removeItems() {
        System.out.println("Item removed");
    }

    public void viewItems() {
        System.out.println("Items viewed");
    }
}