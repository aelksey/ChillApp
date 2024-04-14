package com.example.chillapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(HomeFragment())
        val bottomNavigator = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNavigator.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> {loadFragment(HomeFragment())
                    true}
                R.id.comments ->{loadFragment(CommentFragment())
                true}
                R.id.profile -> {loadFragment(ProfileFragment())
                true}

                else -> {true}
            }

        }
    }
    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView,fragment)
        transaction.commit()
    }
}