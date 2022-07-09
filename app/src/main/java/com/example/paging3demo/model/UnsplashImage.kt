package com.example.paging3demo.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.paging3demo.util.Constant
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = Constant.UNSPLASH_IMAGE_TABLE)
data class UnsplashImage(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    @Embedded
    val urls: Urls,
    val likes: Int,
    @Embedded
    val user: User
) {
    @Serializable
    data class Urls(
        val regular: String
    )

    @Serializable
    data class User(
        @SerialName("links")
        @Embedded
        val userLinks: UserLinks,
        @SerialName("username")
        val username: String
    ) {
        @Serializable
        data class UserLinks(
            @SerialName("html")
            val html: String
        )
    }
}