package com.example.tasarim.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tasarim.data.entity.Mekanlar
import com.example.tasarim.databinding.CardsBinding
import com.example.tasarim.databinding.ListedCardsBinding

class AnotherCardAdapter(var mContext: Context, var mekanListesi : List<Mekanlar>) :
RecyclerView.Adapter<AnotherCardAdapter.CardsHolder>(){

    inner class CardsHolder(var tassarim : CardsBinding): RecyclerView.ViewHolder(tassarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardsHolder {
      var binding = CardsBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return CardsHolder(binding)
    }


    override fun onBindViewHolder(holder: CardsHolder, position: Int) {
        val mekan = mekanListesi.get(position)
        val t = holder.tassarim

        t.pic.setImageResource(mContext.resources.getIdentifier(mekan.resim,"drawable",mContext.packageName))
        t.Title.text ="${mekan.adres}"
        t.textViewAdress.text =  "${mekan.isim}"
    }
    override fun getItemCount(): Int {
       return mekanListesi.size
    }

}