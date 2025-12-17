package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.ProcedureRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.SavedRecipesRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.GetRecipeDetailsUseCase
import com.survivalcoding.gangnam2kiandroidstudy.domain.use_case.GetSavedRecipesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideGetRecipeDetailsUseCase(
        savedRecipesRepository: SavedRecipesRepository,
        proceduresRepository: ProcedureRepository
    ): GetRecipeDetailsUseCase {
        return GetRecipeDetailsUseCase(savedRecipesRepository, proceduresRepository)
    }

    @Provides
    fun provideGetSavedRecipesUseCase(
        repository: SavedRecipesRepository
    ): GetSavedRecipesUseCase {
        return GetSavedRecipesUseCase(repository)
    }

}