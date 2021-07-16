package com.example.gossipapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gossipapp.core.adapter.userAdapter
import com.example.gossipapp.core.modele.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleview)
        recyclerView.layoutManager= LinearLayoutManager(this)
        val users = ArrayList<User>()
        users.add(User(name="Simanga", roleName="Data Scientist", profileUrl="https://web.facebook.com/simanga.mchunu"))
        users.add(User(name="Phindile", roleName="Network Controller", profileUrl="https://web.facebook.com/simanga.mchunu"))
        users.add(User(name="Tumo", roleName="Software Deeloper", profileUrl="https://web.facebook.com/simanga.mchunu"))

        val adapter = userAdapter(users)

        recyclerView.adapter = adapter

        adapter.onItemClick = { user ->
        val intent = Intent(this, secongLive::class.java)
            intent.putExtra("User", user)
            startActivity(intent)

        }

    }
}