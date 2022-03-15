package com.example.reciclerviewproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewproject.adapter.SuperHeroAdapter
import com.example.reciclerviewproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerSuperHero)
        binding.recyclerSuperHero.layoutManager = LinearLayoutManager(this)
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
    }
}