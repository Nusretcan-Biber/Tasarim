package com.example.tasarim.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.tasarim.R
import com.example.tasarim.databinding.FragmentEnteryBinding

class EnteryFragment : Fragment() {
    private lateinit var binding: FragmentEnteryBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentEnteryBinding.inflate(inflater, container, false)

        binding.cardListeleme1.setOnClickListener {
            findNavController().navigate(R.id.action_enteryFragment_to_listelemeFragment)
        }






        return binding.root
    }


}