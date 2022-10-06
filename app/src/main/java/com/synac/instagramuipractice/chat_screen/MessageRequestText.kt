package com.synac.instagramuipractice.chat_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MessageRequestText() {
    Row(horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.fillMaxWidth().padding(20.dp)) {
        Text("Messages",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp)
        Text("Requests", color = Color.Blue,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp)
    }
}