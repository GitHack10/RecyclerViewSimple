package com.example.administrator.recyclerviewsimpe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // Создаем объект RecyclerView
    private RecyclerView userRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        for (int i = 0; i < User.usersName.length; i++) {
            User.users.add(new User(User.usersName[i], User.usersEmail[i]));
        }

        // Создаем объект класса UserItemAdapter и задаем нашему списку адаптер
        // Передаем наш список в конструктор адаптера
        userRecyclerView.setAdapter(new UserItemAdapter(User.users));
    }

    // Метод для передачи в него список определенный в activity_main
    private void initViews() {
        userRecyclerView = findViewById(R.id.RecyclerView_main_user);
    }
}