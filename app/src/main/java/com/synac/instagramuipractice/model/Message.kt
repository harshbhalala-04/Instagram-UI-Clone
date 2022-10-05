package com.synac.instagramuipractice.model

import androidx.compose.ui.graphics.painter.Painter

data class Message(
    val profilePic: Painter,
    val username: String,
    val subtitle: String,
    val time: String,
)