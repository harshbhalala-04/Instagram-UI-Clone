package com.synac.instagramuipractice.reels_screen

import android.net.Uri

object DummyData {
    val reels = listOf<Reel>(
        Reel(
            id = 1,
            video = "lake.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/4.png",
            userName = "Sleepy Joe",
            isLiked = true,
            likesCount = 778,
            commentsCount = 156,
            comment = "Wkwkwk..."
        ),
        Reel(
            id = 2,
            video = "food.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/7.png",
            userName = "Trump",
            isLiked = true,
            likesCount = 5923,
            commentsCount = 11,
            comment = "Awas kamu ya klo pergi"
        ),
        Reel(
            id = 3,
            video = "icecream.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/3.png",
            userName = "Johnson",
            isLiked = true,
            likesCount = 2314,
            comment = "Es krim dingin sedapp",
            commentsCount = 200
        ),
        Reel(
            id = 4,
            video = "soap-bubbles.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/6.png",
            userName = "Macron",
            isLiked = true,
            likesCount = 786,
            comment = "Ados slurr",
            commentsCount = 700
        ),
        Reel(
            id = 5,
            video = "castle.mp4",
            userImage = "https://generated.photos/vue-static/home/hero/2.png",
            userName = "Kim Jong Un",
            isLiked = true,
            likesCount = 1890,
            comment = "Kerjaan di tengah hutan",
            commentsCount = 232
        )

    )
}

data class Reel(
    val id: Int,
    private val video: String,
    val userImage: String,
    val userName: String,
    val isLiked: Boolean = false,
    val likesCount: Int,
    val comment: String,
    val commentsCount: Int
) {

    fun getVideoUrl(): Uri {
        return Uri.parse("asset:///${video}")
    }

}