package com.rokaya.mealz.di

import com.rokaya.data.remote.AbiService
import com.rokaya.data.repo.MealsRepoImp
import com.rokaya.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    //provide the repo here
    @Provides
    fun provideRepo(apiService: AbiService): MealsRepo {
        return MealsRepoImp(apiService)
    }

}