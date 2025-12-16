package com.survivalcoding.gangnam2kiandroidstudy.domain.use_case

import com.survivalcoding.gangnam2kiandroidstudy.domain.model.Ingredients
import com.survivalcoding.gangnam2kiandroidstudy.domain.model.Procedure
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.ProcedureRepository
import com.survivalcoding.gangnam2kiandroidstudy.domain.repository.SavedRecipesRepository


class GetRecipeDetailsUseCase(
    private val savedRecipesRepository: SavedRecipesRepository,
    private val proceduresRepository: ProcedureRepository
) {
    suspend fun execute(id: Int): Pair<List<Ingredients>, List<Procedure>> {

        val recipe = savedRecipesRepository.getSavedRecipes().find { it.id == id }
        if (recipe != null) {
            return Pair(
                recipe.ingredients,
                proceduresRepository.getProcedureByRecipeId(id)
            )
        } else {
            return Pair(
                emptyList(),
                proceduresRepository.getProcedureByRecipeId(id)
            )
        }

    }
}