package com.survivalcoding.gangnam2kiandroidstudy.core.di

import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home.HomeViewModel
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.saved_recipe_detail.SavedRecipeDetailsViewModel
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.saved_recipes.SavedRecipesViewModel
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.search_recipes.SearchRecipesViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(repository = get()) }
    viewModel { SavedRecipeDetailsViewModel(get()) }
    viewModel { SavedRecipesViewModel(get()) }
    viewModel { SearchRecipesViewModel(get()) }
}