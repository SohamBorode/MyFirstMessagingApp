package com.example.myapplication01.presentation.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R


data class CallItemModel(
    val callImg: Int,
    val callName: String,
    val callTimeline: String,
)

@Composable
//@Preview(showSystemUi = true)
fun CallItemDesign(
    callItemModel: CallItemModel
) {
    var isMissed by remember {
        mutableStateOf(true)
    }


    Row(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.rashmika), contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(60.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = callItemModel.callName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.height(4.dp))
                Row() {
                    Icon(
                        painter = painterResource(R.drawable.baseline_call_missed_24),
                        contentDescription = null,
                        tint = if (isMissed) Color.Red else Color.Green,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = callItemModel.callTimeline,
                        color = Color.Gray,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
            IconButton(onClick = {isMissed = !isMissed}) {
                Icon(
                    painter = painterResource(R.drawable.telephone),
                    contentDescription = null,
                    modifier = Modifier.size(26.dp)
                )
            }
        }
    }
}