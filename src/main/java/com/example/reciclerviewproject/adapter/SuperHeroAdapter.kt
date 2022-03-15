package com.example.reciclerviewproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerviewproject.R
import com.example.reciclerviewproject.SuperHero


class SuperHeroAdapter(private val superHeroList: List<SuperHero>): RecyclerView.Adapter<SuperHeroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperHeroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
//        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
//        return layoutInflater
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val item = superHeroList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superHeroList.size
}