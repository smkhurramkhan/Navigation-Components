package com.example.navigationcomponents.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationcomponents.R
import com.example.navigationcomponents.databinding.ThirdFragmentBinding

class ThirdFragment : Fragment() {
    private var _binding: ThirdFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ThirdFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnThirdFragment.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.third_to_first)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}