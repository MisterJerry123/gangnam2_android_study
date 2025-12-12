package com.survivalcoding.gangnam2kiandroidstudy.core.rounting

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface Route : NavKey {
    @Serializable
    data object Main : Route

    @Serializable
    data object Splash : Route

    @Serializable
    data object SignUp : Route

    @Serializable
    data object SignIn : Route


}