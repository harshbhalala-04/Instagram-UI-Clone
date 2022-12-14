package com.synac.instagramuipractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.synac.instagramuipractice.chat_screen.ChatScreen
import com.synac.instagramuipractice.main_feed_screen.MainFeedScreen
import com.synac.instagramuipractice.ui.theme.InstagramUIPracticeTheme
import navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramUIPracticeTheme {
                navigation()
            }
        }
    }
}
