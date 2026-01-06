package com.example.myapplication01.presentation.navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication01.presentation.callscreen.CallScreen
import com.example.myapplication01.presentation.communitiesscreen.CommunitiesScreen
import com.example.myapplication01.presentation.homescreen.HomeScreen
import com.example.myapplication01.presentation.splashscreen.SplashScreen
import com.example.myapplication01.presentation.updatestatusscreen.UpdateScreen
import com.example.myapplication01.presentation.userregistrationscreen.UserRegesScreen
import com.example.myapplication01.presentation.welcomescreen.WelcomeScreen

@Composable
fun WhatsAppNavSys(){
    val navController = rememberNavController()

    NavHost(startDestination = Routes.SplashScreen, navController=navController){

        composable<Routes.SplashScreen>{
            SplashScreen(navController)
        }
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }

        composable<Routes.UserRegesScreen>{
            UserRegesScreen(navController)
        }

        composable<Routes.HomeScreen>{
            HomeScreen()
        }
        composable<Routes.UpdateStatusScreen> {
            UpdateScreen()
        }
        composable<Routes.CommunitiesScreen>{
            CommunitiesScreen()
        }
       composable <Routes.CallsScreen>{
           CallScreen()
       }
    }
}


