package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewexample.Adapter.DemoListAdapter
import com.example.recyclerviewexample.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var array: ArrayList<String> = arrayListOf()
        array.add("Iron Man")
        array.add("Superman")
        array.add("Captain America")
        array.add("Thor")
        array.add("Flash")
        array.add("Wolverine")
        array.add("The Green Lantern")
        array.add("Dr. Manhattan")
        binding.superKahramanlarimiz.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        binding.superKahramanlarimiz.adapter = DemoListAdapter(array)
    }
}