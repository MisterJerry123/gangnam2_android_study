package com.misterjerry.gangnam2kiandroidstudy.presentation.screen.saved_recipes.legacy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.misterjerry.gangnam2kiandroidstudy.databinding.ActivitySavedRecipeBinding


class SavedRecipesActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySavedRecipeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavedRecipeBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

    }
}