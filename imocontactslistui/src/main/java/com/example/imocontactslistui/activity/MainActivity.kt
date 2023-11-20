package com.example.imocontactslistui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imocontactslistui.R
import com.example.imocontactslistui.adapter.ContactAdapter
import com.example.imocontactslistui.model.Contact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        refreshAdapter(recyclerView, getAllContacts())
    }

    fun refreshAdapter(recyclerView: RecyclerView, chats: ArrayList<Contact>) {
        val adapter = ContactAdapter(this, chats)
        recyclerView.adapter = adapter
    }

    fun getAllContacts(): ArrayList<Contact> {
        val contacts: ArrayList<Contact> = ArrayList()
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Online"))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"))
        contacts.add(Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"))
        contacts.add(Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"))
        contacts.add(Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"))
        return contacts
    }
}