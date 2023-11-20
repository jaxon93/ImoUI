package com.example.imocontactslistuijava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imocontactslistuijava.R;
import com.example.imocontactslistuijava.model.Contact;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;


public class ContactAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Contact> items;

    public ContactAdapter(Context context, ArrayList<Contact> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact_view, parent, false);
        return new MassageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Contact contact = items.get(position);

        if (holder instanceof MassageViewHolder) {
            MassageViewHolder viewHolder = (MassageViewHolder) holder;
            viewHolder.iv_profile.setImageResource(contact.getProfile());
            viewHolder.tv_fullname.setText(contact.getFullname());
            viewHolder.tv_lastOnline.setText(contact.getLastOnline());

            if ("Online".equals(contact.getLastOnline())) {
                viewHolder.iv_online.setVisibility(View.VISIBLE);
            } else {
                viewHolder.iv_online.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MassageViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView iv_profile;
        TextView tv_fullname;
        TextView tv_lastOnline;
        ImageView iv_online;

        MassageViewHolder(View view) {
            super(view);
            iv_profile = view.findViewById(R.id.iv_profile);
            tv_fullname = view.findViewById(R.id.tv_fullname);
            tv_lastOnline = view.findViewById(R.id.tv_lastOnline);
            iv_online = view.findViewById(R.id.iv_online);
        }
    }
}
