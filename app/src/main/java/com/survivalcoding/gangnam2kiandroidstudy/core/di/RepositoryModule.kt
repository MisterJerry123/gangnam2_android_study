package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.procedure.ProcedureDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.savedRecipes.SavedRecipesDataSource
import com.survivalcoding.gangnam2kiandroidstudy.data.repository.ProcedureRepositoryImpl
import com.survivalcoding.gangnam2kiandroidstudy.data.repository.SavedRecipesRepositoryImpl
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.ProcedureRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.SavedRecipesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideProcedureRepository(
        procedureDataSource: ProcedureDataSource
    ): ProcedureRepository {
        return ProcedureRepositoryImpl(procedureDataSource)
    }

    @Provides
    fun provideSavedRecipesRepository(
        savedRecipesDataSource: SavedRecipesDataSource
    ): SavedRecipesRepository {
        return SavedRecipesRepositoryImpl(savedRecipesDataSource)
    }

}