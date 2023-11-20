package com.example.imocontactslistuijava.activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.imocontactslistuijava.R;
import com.example.imocontactslistuijava.adapter.ContactAdapter;
import com.example.imocontactslistuijava.model.Contact;

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
        refreshAdapter(recyclerView, getAllContacts());
    }

    private void refreshAdapter(RecyclerView recyclerView, ArrayList<Contact> contacts) {
        ContactAdapter adapter = new ContactAdapter(this, contacts);
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Contact> getAllContacts() {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Online"));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"));
        contacts.add(new Contact(R.drawable.profile_img1, "Gaffarov Jakhongir", "Last seen Aug 5, 2:45 PM"));
        contacts.add(new Contact(R.drawable.profile_img2, "Gaffarov Jakhongir2", "Last seen 12:58 AM"));
        contacts.add(new Contact(R.drawable.profile_img3, "Gaffarov Jakhongir3", "Online"));
        return contacts;
    }
}