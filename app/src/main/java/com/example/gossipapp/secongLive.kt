package com.example.gossipapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.gossipapp.core.modele.User

class secongLive : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secong_live)
        val textView = findViewById<TextView>(R.id.textView)
        val user = intent.getParcelableExtra<User>("User")
        textView.text = user?.name
    }
}