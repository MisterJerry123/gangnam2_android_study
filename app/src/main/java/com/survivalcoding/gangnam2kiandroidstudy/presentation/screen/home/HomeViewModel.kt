package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.home

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.survivalcoding.gangnam2kiandroidstudy.RecipeAppApplication
import com.survivalcoding.gangnam2kiandroidstudy.repository.SavedRecipesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel(
    private val savedRecipesRepository: SavedRecipesRepository

) : ViewModel() {

    private var _state = MutableStateFlow(HomeState("All"))
    val state = _state.asStateFlow()

//    init {
//        viewModelScope.launch {
//            //val currentValue = _state.value // 또는 _state.getValue()
//            _state.value = _state.value.copy(selectedCategory = "All")
//        }
//    }

    fun onSelectedCategory(it: String) {
        _state.value = _state.value.copy(selectedCategory = it)
        Log.d("HomeViewModel", "onSelectedCategory: ${_state.value}")
    }


    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val savedRecipesRepository =
                    (this[APPLICATION_KEY] as RecipeAppApplication).savedRecipesRepository
                HomeViewModel(
                    savedRecipesRepository = savedRecipesRepository,
                )
            }
        }
    }
}