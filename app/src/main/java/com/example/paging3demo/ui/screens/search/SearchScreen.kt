package com.example.paging3demo.ui.screens

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.paging.ExperimentalPagingApi
import androidx.paging.compose.collectAsLazyPagingItems
import coil.annotation.ExperimentalCoilApi
import com.example.paging3demo.ui.screens.common.ListContent
import com.example.paging3demo.ui.screens.home.SearchWidget
import com.example.paging3demo.ui.screens.search.SearchViewModel

@ExperimentalPagingApi
@ExperimentalCoilApi
@Composable
fun SearchScreen(
    navHostController: NavHostController,
    searchViewModel: SearchViewModel = hiltViewModel()
) {
    val searchQuery by searchViewModel.searchQuery
    val searchedImages = searchViewModel.searchedImages.collectAsLazyPagingItems()

    Scaffold(
        topBar = {
            SearchWidget(text = searchQuery, onTextChange = {
                searchViewModel.updateSearchQuery(query = it)
            }, onSearchClicked = { searchViewModel.searchHeroes(query = it) },
                onCloseClicked = {
                    navHostController.popBackStack()
                }
            )
        },
        content = {
            ListContent(items = searchedImages)
        }

    )


}