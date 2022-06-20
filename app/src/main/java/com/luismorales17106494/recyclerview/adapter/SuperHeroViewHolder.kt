package com.luismorales17106494.recyclerview.adapter

import android.view.TextureView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.luismorales17106494.recyclerview.R
import com.luismorales17106494.recyclerview.SuperHero
import com.luismorales17106494.recyclerview.databinding.ItemSuperheroBinding

class SuperHeroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val _binding = ItemSuperheroBinding.bind(view)


    fun render(superHeroModel: SuperHero, onClickListener: (SuperHero) -> Unit) {
        _binding.tvSuperHeroName.text = superHeroModel.superHero
        _binding.tvRealName.text = superHeroModel.realName
        _binding.tvPublisher.text = superHeroModel.publisher
        Glide.with(_binding.ivSuperHero).load(superHeroModel.photo).into(_binding.ivSuperHero)

        itemView.setOnClickListener{onClickListener(superHeroModel)}//Manda




        /*
        _binding.ivSuperHero.setOnClickListener {

            Toast.makeText(
                _binding.ivSuperHero.context, superHeroModel.realName,
                Toast.LENGTH_SHORT
            ).show()
        }



        forma de agregar un click al elemento desde el ViewHolder
        itemView.setOnClickListener(){
            Toast.makeText(
                _binding.ivSuperHero.context, superHeroModel.superHero,
                Toast.LENGTH_SHORT
            ).show()
        }

         */
    }

}