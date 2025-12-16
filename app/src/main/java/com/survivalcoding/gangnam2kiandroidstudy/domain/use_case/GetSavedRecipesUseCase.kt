package com.survivalcoding.gangnam2kiandroidstudy.domain.use_case

import com.survivalcoding.gangnam2kiandroidstudy.domain.model.Recipe
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.SavedRecipesRepository

class GetSavedRecipesUseCase(
    private val repository: SavedRecipesRepository
) {
    suspend fun execute(): List<Recipe> {//나중에 Dto를 Recipe으로
        return repository.getSavedRecipes()
    }
}