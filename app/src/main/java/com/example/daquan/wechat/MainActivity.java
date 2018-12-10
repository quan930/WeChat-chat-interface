package com.example.daquan.wechat;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.FrameLayout;

import com.example.daquan.wechat.adapter.ChatAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Message> list = new ArrayList<>();
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.fuck);
        init();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        ChatAdapter chatAdapter = new ChatAdapter(list);
        recyclerView.setAdapter(chatAdapter);



    }
    private void init(){
        list.add(new Message(1,"你好"));
        list.add(new Message(2,"你好"));
        list.add(new Message(2,"《飞鸟集》是印度诗人泰戈尔创作的诗集，它包括325首清丽的无标题小诗，首次出版于1916年。这些诗的基本题材多为极其常见事物，不外乎小草、落叶、飞鸟、星辰、河流等等"));
        list.add(new Message(1,"接着说"));
        list.add(new Message(2,"我说完了。。。"));
        list.add(new Message(2,"0.0"));
    }
}
