package com.rokaya.data.remote

import com.rokaya.domain.entity.CategoryResponse
import retrofit2.http.GET

interface AbiService {
    @GET("categories.php")
    suspend fun getMeals(): CategoryResponse
}