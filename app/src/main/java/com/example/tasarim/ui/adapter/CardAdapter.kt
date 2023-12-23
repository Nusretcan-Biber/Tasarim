package com.example.tasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.tasarim.data.entity.Mekanlar
import com.example.tasarim.databinding.ListedCardsBinding
import com.example.tasarim.ui.fragment.ListelemeFragmentDirections

class CardAdapter(var mContext: Context, var mekanListesi : List<Mekanlar>)
    : RecyclerView.Adapter<CardAdapter.ListedCardHolder>(){

        inner class  ListedCardHolder(var tasarim : ListedCardsBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListedCardHolder {
        var binding = ListedCardsBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return ListedCardHolder(binding)
    }

    override fun onBindViewHolder(holder: ListedCardHolder, position: Int) {
        val mekan = mekanListesi.get(position)
        val t = holder.tasarim

        t.cardMekanResmi.setImageResource(mContext.resources.getIdentifier(mekan.resim,"drawable",mContext.packageName))
        t.cardMekanAdi.text = "${mekan.isim}"

        t.card.setOnClickListener {
            Navigation.findNavController(it).navigate(ListelemeFragmentDirections.actionListelemeFragmentToDetayFragment(MekanlarArguments = mekan))
        }

    }
    override fun getItemCount(): Int {
        return  mekanListesi.size
    }
}