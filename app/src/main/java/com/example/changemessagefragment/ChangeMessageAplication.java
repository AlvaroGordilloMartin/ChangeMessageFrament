package com.example.changemessagefragment;

import android.app.Application;

import com.example.changemessagefragment.model.User;

public class ChangeMessageAplication extends Application {
    private User user;

    public User getUser() {
        return user;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        user = new User("Alvaro", "alvarogm0403@gmail.com");
    }
}
