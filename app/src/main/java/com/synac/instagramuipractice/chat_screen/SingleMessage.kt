package com.synac.instagramuipractice.chat_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.synac.instagramuipractice.R
import com.synac.instagramuipractice.model.Message

@Composable
fun SingleMessage(message: Message) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 5.dp)) {
        Image(
            painter = message.profilePic,
            contentDescription = "profile pic",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
        Spacer(Modifier.width(10.dp))
        Column(Modifier.weight(1f)) {
            Text(message.username, fontSize = 18.sp)
            Text(message.subtitle)
        }
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_camera_alt_24),
            contentDescription = "Camera icon"
        )
    }
}