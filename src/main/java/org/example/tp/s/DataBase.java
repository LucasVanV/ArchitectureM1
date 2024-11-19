package org.example.tp.s;

import java.util.ArrayList;

public class DataBase {
    private ArrayList<User> data;

    DataBase(){
        this.data = new ArrayList<User>();
    }

    public void addUser(User user){
        data.add(user);
    }

    public boolean isUserRegistred(User user){
        for (User u : data) {
            if (u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
