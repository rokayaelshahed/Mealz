package com.rokaya.data.repo

import com.rokaya.data.remote.AbiService
import com.rokaya.domain.entity.CategoryResponse
import com.rokaya.domain.repo.MealsRepo

class MealsRepoImp(private val apiService: AbiService): MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}