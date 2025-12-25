package com.survivalcoding.gangnam2kiandroidstudy.data.repository

import com.survivalcoding.gangnam2kiandroidstudy.data.data_source.savedRecipes.RecipesDataSource
import com.survivalcoding.gangnam2kiandroidstudy.domain.model.Recipe
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.RecipesRepository

class RecipesRepositoryImpl(
    private val savedRecipesDataSource: RecipesDataSource
) : RecipesRepository {
    override suspend fun getAllRecipes(): List<Recipe> {
        return savedRecipesDataSource.getAllRecipes().recipes
    }

    override suspend fun getSavedRecipes(): List<Recipe> {
        return savedRecipesDataSource.getAllRecipes().recipes.filter { it.isSaved }
    }

    override suspend fun deleteSavedRecipe(id: Int) {
        savedRecipesDataSource.deleteSavedRecipe(id)
    }
}