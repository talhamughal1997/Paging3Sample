package com.example.paging3demo.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging3demo.util.Constant

@Entity(tableName = Constant.UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false) val id: String,
    val prevPage: Int?,
    val nextPage: Int?
)