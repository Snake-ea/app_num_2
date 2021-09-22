package com.example.app_num_2;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class User extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

        String name, country, number, lastMessage, lastMessageTime;
        int imageId;

        public User (String name, String lastMessage, String lastMessageTime,
                      String country, String number, int imageId) {
            this.name = name;
            this.country = country;
            this.lastMessage = lastMessage;
            this.lastMessageTime = lastMessageTime;
            this.number = number;
            this.imageId = imageId;
        }




}
