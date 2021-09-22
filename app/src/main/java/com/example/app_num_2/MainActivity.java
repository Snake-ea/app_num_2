package com.example.app_num_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] imageId = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d,
                R.drawable.e,R.drawable.f, R.drawable.g, R.drawable.i, R.drawable.h};

        String [] name = {"Ярослав", "Александр", "Анастасия", "Григорий", "Вячеслав",
        "Савелий", "Валерий", "Дмитрий", "Злата"};

        String [] lastMessage = {"Привет", "До свидания", "Как дела?", "Пожалуйста",
        "Я тоже так считаю", "Неверно", "Я лучше промолчу...", "Здрасьте", "Давай гуляй"};

        String [] lastMessageTime = {"16:35", "0:00", "3:06", "15:45", "18:19", "21:49",
                "11:00", "13:13", "6:50"};

        String [] number = {"81337148822", "89998887766", "89164342354", "89063537594",
        "89034349360","89538597035", "89564693063", "89009335052", "890123567890"};

        String [] country = {"Россия", "Беларусь", "Казахстан", "Таджикистан",
        "Кыргызстан", "Украина", "Армения", "Молдова", "Узбекистан"};

        ArrayList<User> usersArray = new ArrayList();

        for (int i = 0; i < imageId.length; i++){
            User user = new User(name[i], lastMessage[i], lastMessageTime[i], number[i],
                    country[i], imageId[i]);
            usersArray.add(user);
        }

    }

    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
 /*       Intent i = new Intent(MainActivity.this, UserActivity.class);
        i.putExtra("name", name(position));
        i.putExtra("country", country(position));
        i.putExtra("number", number(position));
        i.putExtra("imageId", imageId(position));
        StartActivity(i)*/

    }
}