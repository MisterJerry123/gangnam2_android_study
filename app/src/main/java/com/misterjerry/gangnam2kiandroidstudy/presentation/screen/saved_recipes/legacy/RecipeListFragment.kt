package com.misterjerry.gangnam2kiandroidstudy.presentation.screen.saved_recipes.legacy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.misterjerry.gangnam2kiandroidstudy.databinding.FragmentRecipeListBinding


class RecipeListFragment : Fragment() {

    private var _binding: FragmentRecipeListBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentRecipeListBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null

    }


}