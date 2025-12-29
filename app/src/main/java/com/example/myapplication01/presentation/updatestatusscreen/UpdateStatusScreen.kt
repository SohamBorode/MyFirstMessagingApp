package com.example.myapplication01.presentation.updatestatusscreen

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
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
fun UpdateScreen() {

    val statusData = listOf(
        StatusDesignModel(StatusImage = R.drawable.boy1, name = "Radhe Sham", time = "Just now"),
        StatusDesignModel(StatusImage = R.drawable.boy, name = "Khatu Sham", time = "Just now"),
        StatusDesignModel(
            StatusImage = R.drawable.boy3, name = "Raju Gentelman", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharadha_kapoor, name = "Sharadha", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharukh_khan, name = "King Khan", time = "1:30 PM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rajkummar_rao, name = "Rajkumar Rao", time = "7:00 AM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rashmika, name = "Ramika Mandana", time = "10:00 AM"
        ),
        StatusDesignModel(StatusImage = R.drawable.boy, name = "Khatu Sham", time = "Just now"),
        StatusDesignModel(
            StatusImage = R.drawable.boy3, name = "Raju Gentelman", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharadha_kapoor, name = "Sharadha", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharukh_khan, name = "King Khan", time = "1:30 PM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rajkummar_rao, name = "Rajkumar Rao", time = "7:00 AM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rashmika, name = "Ramika Mandana", time = "10:00 AM"
        ),
        StatusDesignModel(StatusImage = R.drawable.boy, name = "Khatu Sham", time = "Just now"),
        StatusDesignModel(
            StatusImage = R.drawable.boy3, name = "Raju Gentelman", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharadha_kapoor, name = "Sharadha", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharukh_khan, name = "King Khan", time = "1:30 PM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rajkummar_rao, name = "Rajkumar Rao", time = "7:00 AM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rashmika, name = "Ramika Mandana", time = "10:00 AM"
        ),
        StatusDesignModel(StatusImage = R.drawable.boy, name = "Khatu Sham", time = "Just now"),
        StatusDesignModel(
            StatusImage = R.drawable.boy3, name = "Raju Gentelman", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharadha_kapoor, name = "Sharadha", time = "Just now"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.sharukh_khan, name = "King Khan", time = "1:30 PM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rajkummar_rao, name = "Rajkumar Rao", time = "7:00 AM"
        ),
        StatusDesignModel(
            StatusImage = R.drawable.rashmika, name = "Ramika Mandana", time = "10:00 AM"
        )
    )
    val channelsList = listOf(
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        ),
        ChannelDesignModel(
            ChaImage = R.drawable.rashmika,
            ChaName = "Rashmikas's Beauty",
            ChaMessage = "Here you can chat and see the national crush beauty",
            ChaTime = "7:00 AM",
        )
    )
    val suggChaList = listOf(
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),
        SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        ),SuggChaDesignModel(
            sugChaImg = R.drawable.ajay_devgn,
            SugChaName = "Bolo Juba Kesari",
            SugChaFollCount = "10.6 M folowers"
        )

        )

    val scrollState = rememberScrollState()

    Scaffold(floatingActionButton = {
        FloatingActionButton(
            onClick = {}, containerColor = colorResource(
                id = R.color.light_green
            ), modifier = Modifier.size(65.dp), contentColor = Color.White
        ) {
            Icon(
                painter = painterResource(id = R.drawable.baseline_photo_camera_24),
                contentDescription = null,
                modifier = Modifier.size(32.dp)
            )
        }
    }, bottomBar = {
        BottomNavigation()
    }, topBar = {
        TopBarB()
    }) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Status",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )
            MyStatus()

            HorizontalDivider()
            LazyColumn(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
            ) {
                items(items = statusData) { it2 ->
                    StatusItem(statusDesignModel = it2)
                }
            }

            HorizontalDivider()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Channels",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
//                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
                )
                Button(
                    onClick = {},
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.LightGray, contentColor = Color.Black
                    )
                ) {
                    Text(text = "Explore", fontWeight = FontWeight.SemiBold, fontSize = 15.sp)
                }
            }

            Spacer(modifier = Modifier.height(8.dp))

            Column(modifier = Modifier.padding(horizontal = 12.dp)) {
                Text(
                    text = "Stay connected to world, favraits topics thast matters you. Find channels to follow below!",
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(26.dp))
                Text(
                    text = "Channels you followed: ",
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.height(32.dp))

            LazyColumn(modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)) {
                items(items = channelsList) { it3 ->
                    ChannelItemDesign(it3)
                }
            }
            HorizontalDivider()
            Spacer(modifier = Modifier.height(25.dp))
            Text(text = "Suggested channels:", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
            // the sussegted channels lasybox
            Spacer(modifier = Modifier.height(20.dp))
            LazyColumn(
                modifier = Modifier.fillMaxWidth().height(300.dp),
            ) {
                items(items = suggChaList){
                    it3 -> SuggestedChaDesign(it3)
                }
            }

        }
    }
}
