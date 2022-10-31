package com.android.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.android.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

//    private var count  = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModelFactory = MainActivityViewModelFactory(0)

        viewModel = ViewModelProvider(this, viewModelFactory)[MainActivityViewModel::class.java]

        binding.countText.text = viewModel.getCurrentCount().toString()
//        binding.countText.text = count.toString()

        binding.button.setOnClickListener {
            binding.countText.text = viewModel.getUpdatedCount().toString()
//            binding.countText.text = count++.toString()
        }

    }
}