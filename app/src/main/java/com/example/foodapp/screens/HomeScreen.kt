package com.example.foodapp.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.foodapp.ui.theme.FoodAppTheme
import com.example.foodapp.utils.Logout


@Composable
fun HomeScreen(innerPadding: PaddingValues) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(5.dp)
    ){

        Row() {
            Image(
                imageVector = Logout,
                contentDescription = null
            )


        }

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Text(
            text = "Nuestras Categorias",
            fontSize = 24.sp,
            modifier = Modifier.padding(10.dp)
        )

        LazyRow (){  }

        Text(
            text = "Busca los mejores restaurantes",
            fontSize = 24.sp,
            modifier = Modifier.padding(10.dp)
        )

        LazyRow {  }

        Text(
            text = "Nuestras Mejores Comidas",
            fontSize = 24.sp,
            modifier = Modifier.padding(10.dp)
        )

        LazyVerticalGrid(
            columns = GridCells.Fixed(2)
        ) { }

    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(
    showBackground = true

)
@Composable
fun HomeScreenPreview() {
    FoodAppTheme {
        Greeting("Android")
    }
}