package com.example.foodapp.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewsCard(newss: Newss){
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(16.dp))
            .background(primaryColor)
            .width(200.dp)
            .height(200.dp)
            .padding(16.dp)
    ){
        Text(text = newss.title,
            modifier = Modifier.align(Alignment.Center),
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = formatDate(newss.date),
            modifier = Modifier.align(Alignment.BottomStart),
            color = Color.White,
            fontSize = 8.sp,
            fontWeight = FontWeight.Bold
        )
    }

}



@Preview
@Composable
fun NewsCardPreview(){
    NewsAppTheme{
        NewsCard(
            newss = newsList[0]
        )
    }
}