package com.luismorales17106494.recyclerview.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.luismorales17106494.recyclerview.SuperHero

class SuperHeroAdapter(val superheroList: List<SuperHero>) :
    RecyclerView.Adapter<SuperHeroAdapter>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroAdapter {

    }

    override fun onBindViewHolder(holder: SuperHeroAdapter, position: Int) {

    }

    override fun getItemCount(): Int = superheroList.size
}