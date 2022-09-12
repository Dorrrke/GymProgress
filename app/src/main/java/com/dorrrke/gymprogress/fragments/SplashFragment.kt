package com.dorrrke.gymprogress.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.dorrrke.gymprogress.R

class SplashFragment : Fragment(R.layout.fragment_splash) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.postDelayed(
            {
                findNavController().navigate(R.id.action_splashFragment_to_mainFragment)
            }, 700
        )
    }

}