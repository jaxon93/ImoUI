package com.example.imoui.adapter

import android.content.Context
import android.graphics.drawable.shapes.Shape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imoui.R
import com.example.imoui.model.Chat
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var context: Context, var items: ArrayList<Chat>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
        return MassageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]

        if(holder is MassageViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_count = holder.tv_count

            iv_profile.setImageResource(chat.profile)
            tv_fullname.text = chat.fullname
            tv_count.text = chat.count.toString()

            if(chat.count > 0) {
                tv_count.visibility = View.VISIBLE
                if(chat.count > 9) {
                    tv_count.text = "+9"
                }
            }else {
                tv_count.visibility = View.GONE
            }
        }
        return
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MassageViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        lateinit var iv_profile: ShapeableImageView
        lateinit var tv_fullname: TextView
        lateinit var tv_count: TextView

        init {
            if (view != null) {
                iv_profile = view.findViewById(R.id.iv_profile)
            }
            if (view != null) {
                tv_fullname = view.findViewById(R.id.tv_fullname)
            }
            if (view != null) {
                tv_count = view.findViewById(R.id.tv_count)
            }
        }
    }
}


