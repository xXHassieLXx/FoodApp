package com.example.foodapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.foodapp.Models.MMejoresComidas
import com.example.foodapp.Models.newsListMejoresComidas
import com.example.foodapp.Models.newsListRestaurantes
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.utils.Logout
import com.example.foodapp.utils.StarFilled

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun MejoresComidas(MMejoresComidas: MMejoresComidas) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(8.dp) // Espacio alrededor
    ) {

        Box(
            modifier = Modifier
                .size(20.dp)
                .clip(CircleShape)
                .background(Color.Red),
            contentAlignment = Alignment.Center
        ) {
            GlideImage(
                model = MMejoresComidas.image,
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = androidx.compose.ui.layout.ContentScale.Crop
            )

            Box(){
                Text(
                    text = ""
                )
            }
        }

        Spacer(modifier = Modifier.height(4.dp))

        Image(
            imageVector = StarFilled,
            contentDescription = null
        )


        Text(
            text = MMejoresComidas.title,
            color = Color.Black, // Mejor contraste con el fondo
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}




@Preview
@Composable
fun MejoresComidasPreview(){
    FoodAppTheme {
        MejoresComidas(
            MMejoresComidas = newsListMejoresComidas[0]
        )
    }
}