package com.survivalcoding.gangnam2kiandroidstudy

import android.app.Application
import com.survivalcoding.gangnam2kiandroidstudy.repository.SavedRecipesRepositoryImpl

class Application : Application() {
    val savedRecipesRepository by lazy { SavedRecipesRepositoryImpl() }

}