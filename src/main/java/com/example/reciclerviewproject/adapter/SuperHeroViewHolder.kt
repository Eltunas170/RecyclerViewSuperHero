package com.example.reciclerviewproject.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.reciclerviewproject.SuperHero
import com.example.reciclerviewproject.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val binding = ItemSuperheroBinding.bind(view)

    fun render(superHeroModel: SuperHero) {

        binding.tvSuperHeroName.text = superHeroModel.superhero
        binding.tvRealName.text = superHeroModel.realname
        binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(superHeroModel.photo).into(binding.ivSuperHero)
    }
}