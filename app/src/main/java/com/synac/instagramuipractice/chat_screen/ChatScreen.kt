package com.synac.instagramuipractice.chat_screen

import android.annotation.SuppressLint
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.synac.instagramuipractice.R
import com.synac.instagramuipractice.model.Message
import com.synac.instagramuipractice.model.User

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ChatScreen(navController: NavController) {
    val messages = listOf(
        Message(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "Harsh",
            subtitle = "sent 2m ago",
            time = ""
        ),
        Message(
            profilePic = painterResource(R.drawable.arya_stark),
            username = "Isabelle",
            subtitle = "Sent ddu's reel",
            time = "17 m"
        ),
        Message(
            profilePic = painterResource(R.drawable.jorah_mormont),
            username = "Uday_Bhai",
            subtitle = "bye",
            time = "1 h"
        ),
        Message(
            profilePic = painterResource(R.drawable.daenerys_targaryen),
            username = "queen_daenerys",
            subtitle = "Liked a message",
            time = "5 h"
        ),
        Message(
            profilePic = painterResource(R.drawable.bran_stark),
            username = "Tony_Stark",
            subtitle =  "Shared a post",
            time = "10 h"
        ),
        Message(
            profilePic = painterResource(R.drawable.jon_snow),
            username = "Harsh",
            subtitle = "sent 2m ago",
            time = ""
        ),
        Message(
            profilePic = painterResource(R.drawable.arya_stark),
            username = "Isabelle",
            subtitle = "Sent ddu's reel",
            time = "17 m"
        ),
        Message(
            profilePic = painterResource(R.drawable.jorah_mormont),
            username = "Uday_Bhai",
            subtitle = "bye",
            time = "1 h"
        ),
        Message(
            profilePic = painterResource(R.drawable.daenerys_targaryen),
            username = "queen_daenerys",
            subtitle = "Liked a message",
            time = "5 h"
        ),
        Message(
            profilePic = painterResource(R.drawable.bran_stark),
            username = "Tony_Stark",
            subtitle =  "Shared a post",
            time = "10 h"
        ),
    )
    Scaffold(
        topBar  = {
            ChatTopBar(navController = navController)
        },
        backgroundColor = Color.White
    ) {
        innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            SearchField()
            MessageRequestText()
            LazyColumn() {
                items(messages) {
                    message -> SingleMessage(message)
                }
            }
        }
    }
}

