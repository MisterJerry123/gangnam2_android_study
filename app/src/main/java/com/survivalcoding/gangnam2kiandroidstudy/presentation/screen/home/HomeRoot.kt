package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeRoot(viewModel: HomeViewModel = koinViewModel(), onAction: (HomeAction) -> Unit) {
    val homeState by viewModel.state.collectAsState()
    HomeScreen(
        homeState,
        onAction = { action ->
            when (action) {
                HomeAction.OnSearchClicked -> onAction(HomeAction.OnSearchClicked)
                is HomeAction.OnViewmodelCalled -> viewModel.onAction(action)
                is HomeAction.OnRecipeItemClicked -> onAction(HomeAction.OnRecipeItemClicked(action.recipe))
            }
        }

    )
}