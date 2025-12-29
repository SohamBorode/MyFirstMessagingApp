package com.example.myapplication01.presentation.homescreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R
import com.example.myapplication01.presentation.bottomnavigation.BottomNavigation

@Composable
@Preview(showSystemUi = true)
fun HomeScreen() {

    val chatData = listOf(
        ChatDesignModel(
            image = R.drawable.sharadha_kapoor, time = "7:00 AM",
            message = "Good Morning Soham", name = "Sharadha Baby",
        ),
        ChatDesignModel(
            image = R.drawable.rashmika, time = "9: 00 PM",
            message = "Hello Soham, coffee pene chale", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.rajkummar_rao, time = "9: 00 PM",
            message = "plesse ek film dela de", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.salman_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.whatsapp_icon, time = "3: 00 PM",
            message = "Hello Soham! Welcome to whatsApp", name = "WhataApp Office"
        ),
        ChatDesignModel(
            image = R.drawable.rajkummar_rao, time = "9: 00 PM",
            message = "Hello Soham", name = "Raju"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "King Khan"
        ),
        ChatDesignModel(
            image = R.drawable.salman_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Sallu Bhai"
        ),
        ChatDesignModel(
            image = R.drawable.whatsapp_icon, time = "3: 00 PM",
            message = "Hello Soham!Welcome to whatsApp", name = "WhataApp Office"
        ),
        ChatDesignModel(
            image = R.drawable.rajkummar_rao, time = "9: 00 PM",
            message = "Hello Soham", name = "Rajkumar Rao"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan, time = "9: 00 PM",
            message = "Bhai 500 Rs. Udhar chahiye the", name = "Sharukh"
        ),
        ChatDesignModel(
            image = R.drawable.salman_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Dear Hunter"
        ),
        ChatDesignModel(
            image = R.drawable.meta, time = "3: 00 PM",
            message = "Hello Soham!Welcome to whatsApp", name = "Meta Office"
        ),
        ChatDesignModel(
            image = R.drawable.rajkummar_rao, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.salman_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.whatsapp_icon, time = "3: 00 PM",
            message = "Hello Soham!Welcome to whatsApp", name = "WhataApp Office"
        ),
        ChatDesignModel(
            image = R.drawable.rajkummar_rao, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.salman_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.whatsapp_icon, time = "3: 00 PM",
            message = "Hello Soham!Welcome to whatsApp", name = "WhataApp Office"
        ),
        ChatDesignModel(
            image = R.drawable.rajkummar_rao, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.salman_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.whatsapp_icon, time = "3: 00 PM",
            message = "Hello Soham!Welcome to whatsApp", name = "WhataApp Office"
        ),
        ChatDesignModel(
            image = R.drawable.rajkummar_rao, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.sharukh_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.salman_khan, time = "9: 00 PM",
            message = "Hello Soham", name = "Rashmika"
        ),
        ChatDesignModel(
            image = R.drawable.whatsapp_icon, time = "3: 00 PM",
            message = "Hello Soham!Welcome to whatsApp", name = "WhataApp Office"
        )
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(id = R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.chat_icon),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp)
                )

            }
        },
        bottomBar = { BottomNavigation() }
    ) {

        Column(modifier = Modifier.padding(it)) {
//            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "WhatsApp",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.light_green),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(10.dp, 2.dp)
                )

                Row(
                    modifier = Modifier.align(Alignment.CenterEnd)
                ) {
//                    Spacer(modifier = Modifier.height(10.dp))

                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
//                    Spacer(modifier = Modifier.height(10.dp))
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
//                    Spacer(modifier = Modifier.width(10.dp))
                    IconButton(onClick = {}) {
                        Icon(
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier
                                .size(24.dp)
                        )
                    }
                }
            }
            HorizontalDivider(
                modifier = Modifier.padding(3.dp),
                color = Color.LightGray,
                thickness = 2.dp
            )

            LazyColumn {
                items(chatData){ it1 ->
                    ChatDesign(chatDesignModel = it1)
                }
            }


        }
    }
}