package com.synac.instagramuipractice

sealed class Screen(val route: String) {
    object ChatScreen: Screen("chat_screen")
    object MainFeedScreen: Screen("main_feed_screen")
    object ProfileScreen: Screen("profile_screen")
    object ReelsView: Screen("reels_view")
}