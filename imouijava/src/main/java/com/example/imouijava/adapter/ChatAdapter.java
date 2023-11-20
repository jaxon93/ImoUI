package com.example.imouijava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.imouijava.R;
import com.example.imouijava.model.Chat;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;


public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<Chat> items;

    public ChatAdapter(Context context, ArrayList<Chat> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_view, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Chat chat = items.get(position);

        if (holder instanceof MessageViewHolder) {
            MessageViewHolder messageViewHolder = (MessageViewHolder) holder;
            ShapeableImageView ivProfile = messageViewHolder.ivProfile;
            TextView tvFullname = messageViewHolder.tvFullname;
            TextView tvCount = messageViewHolder.tvCount;

            ivProfile.setImageResource(chat.getProfile());
            tvFullname.setText(chat.getFullname());
            tvCount.setText(String.valueOf(chat.getCount()));

            if (chat.getCount() > 0) {
                tvCount.setVisibility(View.VISIBLE);
                if (chat.getCount() > 9) {
                    tvCount.setText("+9");
                }
            } else {
                tvCount.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {
        ShapeableImageView ivProfile;
        TextView tvFullname;
        TextView tvCount;

        public MessageViewHolder(View view) {
            super(view);
            ivProfile = view.findViewById(R.id.iv_profile);
            tvFullname = view.findViewById(R.id.tv_fullname);
            tvCount = view.findViewById(R.id.tv_count);
        }
    }
}
