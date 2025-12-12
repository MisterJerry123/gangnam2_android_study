package com.survivalcoding.gangnam2kiandroidstudy.core.rounting

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.sign_in.SignInScreen
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.sign_up.SignUpScreen
import com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.splash.SplashScreen

@Composable
fun NavigationRoot(modifier: Modifier = Modifier) {

    val topLevelBackStack = rememberNavBackStack(Route.Splash)

    NavDisplay(
        modifier = modifier,
        backStack = topLevelBackStack,
        entryDecorators = listOf(
            rememberSaveableStateHolderNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator()
        ),
        entryProvider = entryProvider {
            entry<Route.Splash> {
                SplashScreen(
                    onStartButtonClick = {
                        topLevelBackStack.clear()
                        topLevelBackStack.add(Route.SignIn)
                    }
                )
            }
            entry<Route.SignUp> {
                SignUpScreen(
                    onSignInButtonClick = {
                        topLevelBackStack.clear()
                        topLevelBackStack.add(Route.SignIn)
                    }
                )
            }
            entry<Route.SignIn> {
                SignInScreen(
                    onSignUpButtonClick = {
                        topLevelBackStack.clear()
                        topLevelBackStack.add(Route.SignUp)
                    }
                )
            }
        }
    )

}