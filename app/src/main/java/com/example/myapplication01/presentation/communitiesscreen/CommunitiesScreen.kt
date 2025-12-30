package com.example.myapplication01.presentation.communitiesscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication01.R

@Composable
@Preview(showSystemUi = true)
fun CommunityPage(){
    Row{
        Text(text ="Community")
        Box(){
            IconButton(onClick = {}) {
                Icon(painter = painterResource(id = R.drawable.more), contentDescription = null)
            }
        }
    }
}