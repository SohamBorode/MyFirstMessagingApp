package com.example.myapplication01.presentation.callscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R
import com.example.myapplication01.presentation.bottomnavigation.BottomNavigationB

@Composable
@Preview(showSystemUi = true)
fun CallScreen() {
    val callList = listOf(
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday,8:30 PM",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),
        CallItemModel(
            callImg = R.drawable.rashmika,
            callTimeline = "Yesterday",
            callName = "Rashmika"
        ),


        )
    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {}, containerColor = colorResource(
                id = R.color.light_green
            ), modifier = Modifier.size(65.dp), contentColor = Color.White
        ) {
            Icon(
                painter = painterResource(id = R.drawable.add_call),
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
        }
    }, topBar = {
        TopBarCall()
    }, bottomBar = { BottomNavigationB() }) {
        Column(modifier = Modifier.padding(it)) {
            Spacer(modifier = Modifier.height(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,

                ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp)
                            .background(color = Color.Gray)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.outline_phone_24),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Call",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp)
                            .background(color = Color.Gray)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.schedule),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)

                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Schedule",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp)
                            .background(color = Color.Gray)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.dial_pad),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)

                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Keypad",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )
                }
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier.align(Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    IconButton(
                        onClick = {},
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(50.dp)
                            .background(color = Color.Gray)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.heart),
                            contentDescription = null,
                            modifier = Modifier.size(26.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Favorite",
                        fontSize = 12.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Gray
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Recent Calls",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                modifier = Modifier.padding(horizontal = 12.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            LazyColumn {
                items(items = callList) { it ->
                    CallItemDesign(callItemModel = it)
                }
            }
        }
    }
}