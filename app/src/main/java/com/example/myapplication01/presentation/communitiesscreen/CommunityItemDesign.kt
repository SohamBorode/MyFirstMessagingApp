package com.example.myapplication01.presentation.communitiesscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R

data class CommunityItemModel(
    val communityImg: Int,
    val communityName: String,

    val announcementMsg: String,
    val announcementTime: String,

    val communityGrp1Img: Int,
    val communityGrp1Name: String,
    val communityGrp1Time : String,
    val communityGrp1Msg: String,

    val communityGrp2Img: Int,
    val communityGrp2Name: String,
    val communityGrp2Time : String,
    val communityGrp2Msg: String
)

@Composable
//@Preview(showSystemUi = true)
fun CommunityItemDesign(
    communityItemModel: CommunityItemModel
) {
    Column() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Image(
                painter = painterResource(communityItemModel.communityImg),
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .clip(shape = CircleShape)
            )
            Text(
                text = communityItemModel.communityName, modifier = Modifier.padding(horizontal = 16.dp),
                fontWeight = FontWeight.Bold, fontSize = 20.sp
            )
        }
        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.outline_groups_24),
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .clip(shape = CircleShape)
                    .background(color = colorResource(R.color.teal_700)),
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Announcements",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(
                            Alignment.Top
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(text = communityItemModel.announcementTime, color = Color.Gray)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = communityItemModel.announcementMsg,
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Image(
                painter = painterResource(communityItemModel.communityGrp1Img),
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .clip(shape = CircleShape)
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = communityItemModel.communityGrp1Name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(
                            Alignment.Top
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(text = communityItemModel.communityGrp1Time, color = Color.Gray)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = communityItemModel.communityGrp1Msg,
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Image(
                painter = painterResource(communityItemModel.communityGrp2Img),
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
                    .clip(shape = CircleShape)
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = communityItemModel.communityGrp2Name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.align(
                            Alignment.Top
                        ),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(text = communityItemModel.communityGrp2Time, color = Color.Gray)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = communityItemModel.communityGrp2Msg,
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(65.dp)
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_visibility_24),
                contentDescription = null,
                modifier = Modifier.padding(start = 20.dp)
            )
            Text(text = "View all", fontSize = 20.sp, modifier = Modifier.padding(start = 20.dp))

        }
        HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))

    }
}