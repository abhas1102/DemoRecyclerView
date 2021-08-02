package com.example.demorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemAdapter = ItemAdapter(this,getItemsList())
        rvContainer.adapter = itemAdapter
    }

    private fun getItemsList():ArrayList<String>{
        val list = ArrayList<String>()
        list.add("Abhas Kumar")
        list.add("Abhishek Bundela")
        list.add("Adarsh Singh Chauhan")
        list.add("Akash singh")
        list.add("Anita Akhileshwar")
        list.add("Ariga simha Teja")
        list.add("Amit Kumar Yadav")
        list.add("Bablu kumar")
        list.add("Bhavishya Goel")
        list.add("Chirag Gupta")
        list.add("Dharmveer Sharma")
        list.add("Komuraveli Prasanth")
        list.add("Karan Sapolia")
        list.add("Khusboo Gutpta")

        return list
    }
}