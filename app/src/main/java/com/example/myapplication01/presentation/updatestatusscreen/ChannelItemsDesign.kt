package com.example.myapplication01.presentation.updatestatusscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R

data class ChannelDesignModel(
    val ChaImage: Int, val ChaName: String, val ChaMessage: String, val ChaTime: String
)

@Composable
//@Preview(showSystemUi = true)

fun ChannelItemDesign(
    channelDesignModel: ChannelDesignModel
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp, 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = channelDesignModel.ChaImage),
            contentDescription = null,
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(60.dp)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = channelDesignModel.ChaName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(
                        Alignment.Top
                    ),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(text = channelDesignModel.ChaTime, color = Color.Gray)
            }
            Spacer(modifier = Modifier.height(4.dp))
            Box(modifier = Modifier.width(250.dp)) {
                Text(
                    text = channelDesignModel.ChaMessage,
                    color = Color.Gray,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    /*To get '....' when content is too long.
            .Clip: cut the text but internally it is still complete
            */
                )
            }
        }
    }
}