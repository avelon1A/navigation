package com.example.newnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.navigation.NavController

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController


import androidx.navigation.ui.setupWithNavController
import com.example.newnav.databinding.ActivityMainBinding

import com.google.android.material.bottomnavigation.BottomNavigationView
import io.ak1.OnBubbleClickListener

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigationView.setupWithNavController(navController)


        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.login_fragment) {
                bottomNavigationView.visibility = BottomNavigationView.GONE
            } else {
                bottomNavigationView.visibility = BottomNavigationView.VISIBLE
            }
        }
    }
}

