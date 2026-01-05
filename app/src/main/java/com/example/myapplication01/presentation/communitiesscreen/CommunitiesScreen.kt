package com.example.myapplication01.presentation.communitiesscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R
import com.example.myapplication01.presentation.bottomnavigation.BottomNavigationB
import com.example.myapplication01.presentation.updatestatusscreen.TopBarC

@Composable
@Preview(showSystemUi = true)
fun CommunitiesScreen() {
    val scrollState = rememberScrollState()
    val communityItems = listOf(
        CommunityItemModel(
            communityImg = R.drawable.boy,
            communityName = "Bollywood Style",
            announcementMsg = "New movies are coming soon",
            announcementTime = "2/2/2026",
            communityGrp1Img = R.drawable.rashmika,
            communityGrp1Name = "Rashmika's Madness",
            communityGrp1Time = "10:52 PM",
            communityGrp1Msg = "djfhjdfjhjfjddjvjdjfdjfndv",
            communityGrp2Img = R.drawable.sharadha_kapoor,
            communityGrp2Name = "Sharadha's fans",
            communityGrp2Time = "9:52 PM",
            communityGrp2Msg = "djfhjdfjhjfjddjvjdjfdjfndv"
        ),
        CommunityItemModel(
            communityImg = R.drawable.boy,
            communityName = "Bollywood Style",
            announcementMsg = "New movies are coming soon",
            announcementTime = "2/2/2026",
            communityGrp1Img = R.drawable.rashmika,
            communityGrp1Name = "Rashmika's Madness",
            communityGrp1Time = "10:52 PM",
            communityGrp1Msg = "djfhjdfjhjfjddjvjdjfdjfndv",
            communityGrp2Img = R.drawable.sharadha_kapoor,
            communityGrp2Name = "Sharadha's fans",
            communityGrp2Time = "9:52 PM",
            communityGrp2Msg = "djfhjdfjhjfjddjvjdjfdjfndv"
        ),
        CommunityItemModel(
            communityImg = R.drawable.boy,
            communityName = "Bollywood Style",
            announcementMsg = "New movies are coming soon",
            announcementTime = "2/2/2026",
            communityGrp1Img = R.drawable.rashmika,
            communityGrp1Name = "Rashmika's Madness",
            communityGrp1Time = "10:52 PM",
            communityGrp1Msg = "djfhjdfjhjfjddjvjdjfdjfndv",
            communityGrp2Img = R.drawable.sharadha_kapoor,
            communityGrp2Name = "Sharadha's fans",
            communityGrp2Time = "9:52 PM",
            communityGrp2Msg = "djfhjdfjhjfjddjvjdjfdjfndv"
        ),
        CommunityItemModel(
            communityImg = R.drawable.boy,
            communityName = "Bollywood Style",
            announcementMsg = "New movies are coming soon",
            announcementTime = "2/2/2026",
            communityGrp1Img = R.drawable.rashmika,
            communityGrp1Name = "Rashmika's Madness",
            communityGrp1Time = "10:52 PM",
            communityGrp1Msg = "djfhjdfjhjfjddjvjdjfdjfndv",
            communityGrp2Img = R.drawable.sharadha_kapoor,
            communityGrp2Name = "Sharadha's fans",
            communityGrp2Time = "9:52 PM",
            communityGrp2Msg = "djfhjdfjhjfjddjvjdjfdjfndv"
        )
    )

    Scaffold(
        topBar = { TopBarC() },
        bottomBar = { BottomNavigationB() }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxWidth()

        ) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.teal_200)),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),

                ) {
                Text(
                    text = "Start a new community",
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Your Communities",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            LazyColumn() {
                items(items = communityItems) { it ->
                    CommunityItemDesign(it)
                }
            }
        }
    }
}