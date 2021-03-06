package com.example.menu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menu.adapters.EmployeeAdapter
import com.example.menu.databinding.ActivityHorizontalListBinding
import com.example.menu.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityVerticalListBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.verticalRecyclerView.adapter = EmployeeAdapter(applicationContext)

        // Specify fixed size to improve performance
        binding.verticalRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

}