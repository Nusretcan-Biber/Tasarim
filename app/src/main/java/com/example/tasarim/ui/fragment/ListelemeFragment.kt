package com.example.tasarim.ui.fragment

import android.graphics.PorterDuff
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.tasarim.R
import com.example.tasarim.data.entity.Mekanlar
import com.example.tasarim.databinding.FragmentListelemeBinding
import com.example.tasarim.ui.adapter.AnotherCardAdapter
import com.example.tasarim.ui.adapter.CardAdapter


class ListelemeFragment : Fragment() {

    private lateinit var binding: FragmentListelemeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding =  FragmentListelemeBinding.inflate(inflater, container, false)
        binding.imageHeader1.setColorFilter(99000000,PorterDuff.Mode.SRC_OVER)

        binding.kaydirmaliii.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        val mekanlistesi = ArrayList<Mekanlar>()
        val m1 = Mekanlar(1,"Gökpınar Gölü"
            ,"Gökpınar Gölü, Sıvas'ın Gürün ilçe merkezine 10 kilometre mesafede bulunan, alüvyon birikimi sonucu uzun yıllar içerisinde oluşmuş bir göldür. Gölünün alanı 3000 metrekare olup, 1500 ile 2000 rakım arasında bulunmaktadır. Derinliği ise 15 metredir."
            ,38.656265,37.3022848,"denem","Sivas")
        val m2 = Mekanlar(2,"Çifte Minareli Medrese"
            ,"Çifte Minareli Medrese, Türkiye'nin Sivas ilinin merkezinde yer alan medrese. Taç kapı üzerinde yer alan kitabesine göre 1271 yılında İlhanlılar Veziri Şemseddin Cüveyni tarafından yaptırılmıştır.[1] Medrese, süslemeli taç kapısı ve tuğla-çini örgülü iki minaresi ile dikkati çekmektedir. Medresenin kapalı mekânı yok olmuş, sadece doğu yönündeki minarelerin bulunduğu asıl cephe yüzeyi ayakta kalmıştır. Şifaiye Medresesi'nin tam karşısında yer almaktadır."
            ,39.7483734,37.0117298,"cifte","Sivas")
        val m3 = Mekanlar(3,"Sivas Ulu Camii"
            ,"Sivas Ulu Cami, Anadolu Selçuklu Devleti sultanı II. Kılıç Arslan'ın ülkeyi 11 oğlu arasında paylaştırmasıyla Sivas-Aksaray arasındaki bölgeye hükümdar olan Kutbeddin Melikşah saltanatı zamanında Kızılarslan bin İbrahim tarafından 1196-1197 yıllarında Kul Ahi'ye yaptırılmış, Sivas ilinin merkez ilçesinde yer alan cami.\n" +
                    "\n" +
                    "Caminin I. İzzeddin Keykavus tarafından 1212 yılında onarıldığı, 1213'de de minaresinin yapıldığı bilinmektedir. Sivas Valiliği tarafından 1955 yılındaki onarımı sırasında, hem yapım hem de onarım yazıtı bulunmuştur."
            ,39.7471445,37.0177211,"ulu_camii","Sivas")
        val m4 = Mekanlar(4,"Atatürk Kongre Müzesi"
            ,"Sivas Lisesi, Türkiye'de cumhuriyeti tarihinde de önemli bir yere sahiptir. 4 Eylül 1919'da Türkiye Cumhuriyeti'nin kuruluş kararlarının alındığı Sivas Kongresi'ne ev sahipliği yapmıştır.[2] Mustafa Kemal Atatürk ve Heyet-i Temsiliye'nin bir süre karargâh olarak kullandıkları ve o tarihlerde Sultani (lise) olan bina; Sivas Kongresi'nin 4-12 Eylül tarihleri arasında burada toplanması ile tarihsel bir kimlik kazanmıştır."
            ,39.7496027,37.0041959,"sivas_lisesi","Sivas")


        mekanlistesi.add(m1)
        mekanlistesi.add(m2)
        mekanlistesi.add(m3)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)
        mekanlistesi.add(m4)

/*

val cardAdapter = AnotherCardAdapter(requireContext(),mekanlistesi)
        binding.kaydirmaliii.adapter = cardAdapter

 */

        val cardAdapter = CardAdapter(requireContext(),mekanlistesi)
        binding.kaydirmaliii.adapter = cardAdapter











        return binding.root
    }


}