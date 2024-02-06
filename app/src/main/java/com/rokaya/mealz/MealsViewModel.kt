package com.rokaya.mealz

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rokaya.domain.entity.CategoryResponse
import com.rokaya.domain.usecase.GetMealz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MealsViewModel @Inject constructor(
    private val getMealz: GetMealz
    ):ViewModel(){

        private val _categoties :MutableStateFlow<CategoryResponse?> = MutableStateFlow(null)
        val categoties: StateFlow<CategoryResponse?> = _categoties

    fun getMeals() {
        viewModelScope.launch {
            try {
                _categoties.value=getMealz()
            } catch (e: Exception) {
                Log.e("MealsViewModel", "getMeals: ${e.message}")
            }
        }
    }
}