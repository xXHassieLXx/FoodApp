package com.example.foodapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.foodapp.utils.Logout
import com.example.foodapp.utils.PersonCircle

@Composable
fun TabBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Image(
            imageVector = Logout,
            contentDescription = null
        )

        Text(
            text = "Hola, Hassiel",
            fontSize = 20.sp,
            modifier = Modifier.weight(1f) // Ocupa el espacio disponible y empuja el icono a la derecha
        )

        Image(
            imageVector = PersonCircle,
            contentDescription = null
        )
    }
}
