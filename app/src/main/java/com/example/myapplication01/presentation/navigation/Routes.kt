package com.example.myapplication01.presentation.navigation
import kotlinx.serialization.Serializable
sealed class Routes {
    @Serializable
    data object SplashScreen : Routes()
//Routes() helps to go from one to next detination by connecting them
    @Serializable
    data object WelcomeScreen : Routes()

    @Serializable
    data object UserRegesScreen : Routes()

    @Serializable
    data object HomeScreen : Routes()

    @Serializable
    data object UpdateStatusScreen : Routes()

    @Serializable
    data object CommunitiesScreen : Routes()

    @Serializable
    data object CallsScreen : Routes()

}