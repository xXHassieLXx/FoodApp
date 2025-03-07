package com.example.foodapp.Models

import java.util.Date

data class MRestaurantes (
    val id : Int,
    val title : String,
    val image : String,
)

val newsListRestaurantes = listOf(
    MRestaurantes(
        id = 1,
        title = "Macdonal's",
        image = "https://w7.pngwing.com/pngs/719/645/png-transparent-mcdonalds-round-logo-thumbnail.png"
    ),
    MRestaurantes(
        id = 2,
        title = "Subway",
        image = "https://w7.pngwing.com/pngs/980/981/png-transparent-united-states-newry-submarine-sandwich-subway-logo-subway-text-sign-signage-thumbnail.png",
    ),
    MRestaurantes(
        id = 3,
        title = "Burger King",
        image = "https://w7.pngwing.com/pngs/1002/138/png-transparent-burger-king-logo-hamburger-burger-king-logo-restaurant-burger-king-text-fast-food-restaurant-signage-thumbnail.png",
    ),
    MRestaurantes(
        id = 4,
        title = "KFC",
        image = "https://w7.pngwing.com/pngs/879/540/png-transparent-kfc-logo-illustration-hamburger-kfc-take-out-fast-food-fried-chicken-round-kfc-logo-free-logo-design-template-food-chicken-meat-thumbnail.png",
    ),
    MRestaurantes(
        id = 5,
        title = "Domino's Pizza",
        image = "https://w7.pngwing.com/pngs/883/393/png-transparent-dominos-pizza-take-out-restaurant-logo-pizza-logo-food-text-rectangle-thumbnail.png",
    ),
)