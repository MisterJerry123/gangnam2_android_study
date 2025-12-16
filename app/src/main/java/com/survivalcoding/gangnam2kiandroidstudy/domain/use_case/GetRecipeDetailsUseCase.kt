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

        return Pair(
            savedRecipesRepository.getSavedRecipes().filter { it.id == id }[0].ingredients,
            proceduresRepository.getProcedureByRecipeId(id)
        )


    }
}