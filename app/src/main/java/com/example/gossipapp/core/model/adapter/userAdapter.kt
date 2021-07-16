package com.example.gossipapp.core.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gossipapp.R
import com.example.gossipapp.core.modele.User

class userAdapter(val users: ArrayList<User>): RecyclerView.Adapter<userAdapter.ViewHolder>() {
    var onItemClick: ((User) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_user_layout_item,parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: userAdapter.ViewHolder, position: Int) {
        holder.bindItems(users[position])
    }
    //this methos is returning th size of the list
    override fun getItemCount(): Int {
        return users.size
    }
    //The class is holding the list view
    inner class ViewHolder(itemView : View) :RecyclerView.ViewHolder(itemView){

        //execute
        init{
            itemView.setOnClickListener{
                onItemClick?.invoke(users[adapterPosition])
            }
        }

        fun bindItems(user: User){
            val textViewName = itemView.findViewById(R.id.userName) as TextView
            val textViewRole =itemView.findViewById(R.id.userRole) as TextView
            textViewName.text = user.name
            textViewRole.text = user.roleName

        }
    }
}