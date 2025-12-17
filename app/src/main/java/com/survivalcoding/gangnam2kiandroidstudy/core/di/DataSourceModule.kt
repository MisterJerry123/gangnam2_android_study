package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.procedure.ProcedureDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.procedure.ProcedureDataSourceImpl
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.savedRecipes.SavedRecipesDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.savedRecipes.SavedRecipesDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    fun provideProcedureDataSource(): ProcedureDataSource {
        return ProcedureDataSourceImpl()
    }

    @Provides
    fun provideSavedRecipesDataSource(): SavedRecipesDataSource {
        return SavedRecipesDataSourceImpl()
    }
}