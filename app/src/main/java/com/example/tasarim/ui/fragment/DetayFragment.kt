package com.example.tasarim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.tasarim.R
import com.example.tasarim.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle : DetayFragmentArgs by navArgs()
        val gelenMekan = bundle.MekanlarArguments

        binding.imageViewAnaResim.setImageResource(resources.getIdentifier(gelenMekan.resim,"drawable",requireContext().packageName))
        binding.textViewMekanismi.text = "${gelenMekan.isim}"
        binding.textViewArdess.text ="${gelenMekan.adres}"
        binding.textViewHakkNdaMetni.text ="${gelenMekan.metin}"




        return binding.root
    }


}