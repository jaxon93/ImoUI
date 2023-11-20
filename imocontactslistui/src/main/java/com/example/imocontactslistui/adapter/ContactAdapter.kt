package com.example.imocontactslistui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imocontactslistui.R
import com.example.imocontactslistui.model.Contact
import com.google.android.material.imageview.ShapeableImageView

class ContactAdapter(var context: Context, var items: ArrayList<Contact>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact_view, parent, false)
        return MassageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val contact = items[position]

        if(holder is MassageViewHolder) {
            var iv_profile = holder.iv_profile
            var tv_fullname = holder.tv_fullname
            var tv_lastOnline = holder.tv_lastOnline
            var iv_online = holder.iv_online

            iv_profile.setImageResource(contact.profile)
            tv_fullname.text = contact.fullname
            tv_lastOnline.text = contact.lastOnline

            if(contact.lastOnline == "Online") {
                iv_online.visibility = View.VISIBLE
            }else {
                iv_online.visibility = View.GONE
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
        lateinit var tv_lastOnline: TextView
        lateinit var iv_online: ImageView

        init {
            if (view != null) {
                iv_profile = view.findViewById(R.id.iv_profile)
            }
            if (view != null) {
                tv_fullname = view.findViewById(R.id.tv_fullname)
            }
            if (view != null) {
                tv_lastOnline = view.findViewById(R.id.tv_lastOnline)
            }
            if (view != null) {
                iv_online = view.findViewById(R.id.iv_online)
            }
        }
    }
}