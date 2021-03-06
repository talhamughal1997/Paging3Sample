package com.example.paging3demo.data.local.dao

import androidx.paging.PagingSource
import androidx.room.*
import com.example.paging3demo.model.UnsplashImage
import com.example.paging3demo.model.UnsplashRemoteKeys

@Dao
interface UnsplashRemoteKeysDao {

    @Query("SELECT * FROM unsplash_remote_keys_table WHERE id =:id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("DELETE FROM unsplash_remote_keys_table")
    suspend fun deleteAllRemoteKeys()

}