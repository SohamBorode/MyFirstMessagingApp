package com.example.myapplication01.presentation.updatestatusscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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


data class SuggChaDesignModel(
    val sugChaImg: Int,
    val SugChaName: String,
    val SugChaFollCount: String,
)

@Composable
//@Preview(showSystemUi = true)
fun SuggestedChaDesign(
    suggChaDesignModel: SuggChaDesignModel
) {
    var isFollowing = false
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, 8.dp),
        verticalAlignment = Alignment.CenterVertically,

        ) {
        Image(
            painter = painterResource(id = suggChaDesignModel.sugChaImg),
            modifier = Modifier
                .clip(shape = CircleShape)
                .size(60.dp),
            contentDescription = null
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Column() {
                Text(
                    text = suggChaDesignModel.SugChaName,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = suggChaDesignModel.SugChaFollCount,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    maxLines = 1,
                    color = Color.Gray
                )
            }

            Button(
                onClick = { isFollowing = !isFollowing },
                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isFollowing) {
                        Color.Gray
                    } else {
                        colorResource(id = R.color.dark_green)
                    },
                    contentColor = colorResource(id = R.color.white),
                ),
                modifier = Modifier
                    .width(100.dp)
                    .height(40.dp)

            ) {
                if (isFollowing) {
                    Text(
                        text = "Following",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                } else {
                    Text(
                        text = "Follow",
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}
