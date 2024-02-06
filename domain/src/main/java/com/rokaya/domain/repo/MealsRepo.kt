package com.rokaya.domain.repo

import com.rokaya.domain.entity.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote(): CategoryResponse
}