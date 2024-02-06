package com.rokaya.domain.usecase

import com.rokaya.domain.repo.MealsRepo

class GetMealz(private val mealsRepo: MealsRepo) {
    suspend operator fun invoke()= mealsRepo.getMealsFromRemote()
}