package com.example.myrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrecyclerview.adapters.EmailAdapter
import com.example.myrecyclerview.models.Email

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fakeEmails = generateFakeEmails()
        setUpEmailRecyclerView(fakeEmails)
    }

    private fun setUpEmailRecyclerView(emails: List<Email>) {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val emailRecyclerView = findViewById<RecyclerView>(R.id.email_recycler_view)
        val recyclerAdapter = EmailAdapter(emails, this)
        emailRecyclerView.layoutManager = layoutManager
        emailRecyclerView.adapter = recyclerAdapter
    }

    private fun generateFakeEmails(): List<Email> {
        val titles = listOf(
            "Hot dogs $1 only!",
            "Dev.to beats Medium.",
            "We have updated our privacy :/",
            "Nick moves to New Zealand",
            "Hot dogs $1 only!",
            "Dev.to beats Medium.",
            "We have updated our privacy :/",
            "Nick moves to New Zealand","Hot dogs $1 only!",
            "Dev.to beats Medium.",
            "We have updated our privacy :/",
            "Nick moves to New Zealand",
            "Nick moves to New Zealand")
        val descriptions = listOf(
            "This is truly amazing, unexpected...",
            "Yes, yes, yes! It is happening!",
            "Follow our blog to learn more...",
            "Well, it supposed to happen...",
            "This is truly amazing, unexpected...",
            "Yes, yes, yes! It is happening!",
            "Follow our blog to learn more...",
            "Well, it supposed to happen...",
            "This is truly amazing, unexpected...",
            "Yes, yes, yes! It is happening!")
        val times = listOf(
            "13:42",
            "16:16",
            "12:34",
            "20:20",
            "13:42",
            "16:16",
            "12:34",
            "20:20",
            "13:42",
            "16:16",
            "12:34",
            "20:20")
        val emailList = mutableListOf<Email>()
        for (i in 0..10) {
            emailList.add(
                Email(titles.random(), descriptions.random(), times.random())
            )
        }
        return emailList
    }
}
