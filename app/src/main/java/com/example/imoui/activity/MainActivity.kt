package com.example.imoui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imoui.R
import com.example.imoui.adapter.ChatAdapter
import com.example.imoui.model.Chat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        refreshAdapter(recyclerView, getAllChats())
    }

    fun refreshAdapter(recyclerView: RecyclerView, chats: ArrayList<Chat>) {
        val adapter = ChatAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllChats(): ArrayList<Chat> {
        val chats: ArrayList<Chat> = ArrayList()
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 3))
        chats.add(Chat(R.drawable.profile_img1, "Gaffarov Jakhongir", 1))
        chats.add(Chat(R.drawable.profile_img2, "Gaffarov Jakhongir2", 0))
        chats.add(Chat(R.drawable.profile_img3, "Gaffarov Jakhongir3", 20))
        return chats
    }
}