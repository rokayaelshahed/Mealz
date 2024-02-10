package com.rokaya.mealz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.rokaya.mealz.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private  lateinit var  viewModel :MealsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("mmm","test")
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val rv = binding.categoryRv
        viewModel.getMeals()
        val mealsAdapter = MealsAdapter()
        lifecycleScope.launch {
            viewModel.categoties.collect(){
                mealsAdapter.submitList(it?.categories)
                rv.adapter=mealsAdapter
            }
        }
    }
}
