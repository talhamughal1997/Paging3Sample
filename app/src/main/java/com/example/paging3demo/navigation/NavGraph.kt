package com.example.paging3demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.example.paging3demo.ui.screens.SearchScreen
import com.example.paging3demo.ui.screens.home.HomeScreen


@ExperimentalCoilApi
@ExperimentalPagingApi
@Composable
fun SetupNavGraph(navController:NavHostController)
{
    NavHost(navController = navController, startDestination = Screen.Home.route)
    {
        composable(Screen.Home.route)
        {
            HomeScreen(navController)
        }
        composable(Screen.Search.route)
        {
            SearchScreen(navController)
        }
    }
}