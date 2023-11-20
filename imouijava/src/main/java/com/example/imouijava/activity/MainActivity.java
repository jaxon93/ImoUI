package com.example.imouijava.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.imouijava.R;
import com.example.imouijava.adapter.ChatAdapter;
import com.example.imouijava.model.Chat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        refreshAdapter(recyclerView, getAllChats());
    }

    private void refreshAdapter(RecyclerView recyclerView, ArrayList<Chat> chats) {
        ChatAdapter adapter = new ChatAdapter(this, chats);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Chat> getAllChats() {
        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3));
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3));
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3));
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3));
        chats.add(new Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1));
        chats.add(new Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0));
        chats.add(new Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 20));
        return chats;
    }
}
