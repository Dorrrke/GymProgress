package com.dorrrke.gymprogress.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.dorrrke.gymprogress.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainFragment : Fragment(R.layout.fragment_main) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val   bottomNavigationView = view.findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = (childFragmentManager.findFragmentById(R.id.mainContainerView) as NavHostFragment).navController
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}