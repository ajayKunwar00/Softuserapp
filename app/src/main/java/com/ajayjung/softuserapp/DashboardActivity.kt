package com.ajayjung.softuserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ajayjung.softuserapp.fragments.AboutFragment
import com.ajayjung.softuserapp.fragments.AddFragment
import com.ajayjung.softuserapp.fragments.HomeFragment

class DashboardActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        bottomNav = findViewById(R.id.bottomNav)

        currentFragment(HomeFragment())

        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home -> currentFragment(HomeFragment())
                R.id.add -> currentFragment(AddFragment())
                R.id.about -> currentFragment(AboutFragment())
            }
            true
        }
    }

    private fun currentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            addToBackStack(null)
            commit()
        }
    }
}