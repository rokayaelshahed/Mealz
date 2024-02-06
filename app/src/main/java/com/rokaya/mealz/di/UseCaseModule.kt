package com.rokaya.mealz.di

import com.rokaya.domain.repo.MealsRepo
import com.rokaya.domain.usecase.GetMealz
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    //provide the use case here
    @Provides
    fun provideUseCase(repo: MealsRepo): GetMealz {
        return GetMealz(repo)
    }
}