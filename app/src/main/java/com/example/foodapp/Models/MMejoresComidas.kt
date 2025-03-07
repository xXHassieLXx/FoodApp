package com.example.foodapp.Models

import java.util.Date

data class MMejoresComidas (
    val id : Int,
    val title : String,
    val image : String,
)

val newsListMejoresComidas = listOf(
    MMejoresComidas(
        id = 1,
        title = "Nuggets",
        image = "https://w7.pngwing.com/pngs/16/429/png-transparent-chicken-nugget-mcdonald-s-chicken-mcnuggets-fast-food-hamburger-chicken-nuggets-food-animals-chicken-meat-thumbnail.png",
    ),
    MMejoresComidas(
        id = 2,
        title = "Whopper",
        image = "https://w7.pngwing.com/pngs/520/119/png-transparent-french-fries-cheeseburger-breakfast-sandwich-whopper-hamburger-junk-food-food-recipe-cheese-sandwich-thumbnail.png",
    ),
    MMejoresComidas(
        id = 3,
        title = "Papas",
        image = "https://png.pngtree.com/png-clipart/20210523/original/pngtree-italian-delicious-slice-pizza-vector-png-image_6327853.jpg",
    ),
    MMejoresComidas(
        id = 4,
        title = "Big Mac",
        image = "https://w7.pngwing.com/pngs/75/843/png-transparent-mcdonald-s-big-mac-fast-food-hamburger-eating-big-mac-food-cheeseburger-american-food-thumbnail.png",
    ),
    MMejoresComidas(
        id = 5,
        title = "McFlurry",
        image = "https://w7.pngwing.com/pngs/763/175/png-transparent-ice-cream-matcha-mcdonalds-mcflurry-with-oreo-cookies-tiramisu-jimmy-tornado-cream-frutti-di-bosco-food-thumbnail.png",
    ),
)