package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frag1, Fragment())
            commit()
        }
        binding.btnFrag1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frag1, firstFragment)
                addToBackStack(null)
                commit()
            }

        }
        binding.btnFrag2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frag1, secondFragment)
                addToBackStack(null)
                commit()
            }
        }

    }
}