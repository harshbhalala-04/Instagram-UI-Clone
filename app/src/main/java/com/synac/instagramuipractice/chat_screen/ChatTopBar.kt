package com.synac.instagramuipractice.chat_screen

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.synac.instagramuipractice.R

@Composable
fun ChatTopBar(navController: NavController) {

    TopAppBar(
        backgroundColor = Color.White,
        navigationIcon = {
             IconButton(onClick = {
                 navController.navigateUp()
             }) {
                 Icon(
                     painter = painterResource(id = R.drawable.ic_baseline_arrow_back_24),
                     contentDescription = "Back Button"
                 )
             }
        },
        title = {
          Text("harsh_bhalala04", fontSize = 20.sp)
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    tint = Color.Black,
                    painter = painterResource(id = R.drawable.ic_baseline_video_call_24),
                    contentDescription = "video call",
                    modifier = Modifier.size(30.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    tint = Color.Black,
                    painter = painterResource(id = R.drawable.ic_baseline_add),
                    contentDescription = "Add to chat",
                    modifier = Modifier.size(30.dp)
                )
            }
        }
    )
}

