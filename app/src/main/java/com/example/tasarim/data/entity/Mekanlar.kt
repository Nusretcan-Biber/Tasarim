package com.example.tasarim.data.entity

import java.io.Serializable

data class Mekanlar(val id : Int, val isim : String, val metin : String, val enlem : Double, val boylam : Double, val resim : String,val adres : String) : Serializable{
}