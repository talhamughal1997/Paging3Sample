package com.example.paging3demo.data.local.dao

import androidx.paging.PagingSource
import androidx.room.*
import com.example.paging3demo.model.UnsplashImage

@Dao
interface UnsplashImageDao {


    @Query("SELECT * FROM unsplash_image_table")
    fun getAllImages(): PagingSource<Int, UnsplashImage>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images: List<UnsplashImage>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllImages()

}