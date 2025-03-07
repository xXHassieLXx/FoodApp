package com.example.foodapp.Models

import java.util.Date

data class MCategorias (
    val id : Int,
    val title : String,
    val image : String,
)

val newsListCategorias = listOf(
    MCategorias(
        id = 1,
        title = "Fast Food",
        image = "https://png.pngtree.com/png-clipart/20190515/original/pngtree-vector-cartoon-illustration-of-a-traditional-set-of-fast-food-me-png-image_3565698.jpg",
    ),
    MCategorias(
        id = 2,
        title = "Mexican",
        image = "https://png.pngtree.com/png-clipart/20190705/original/pngtree-collection-of-characteristics-of-mexican-food-png-image_4366033.jpg",
    ),
    MCategorias(
        id = 3,
        title = "Italian",
        image = "https://png.pngtree.com/png-clipart/20210523/original/pngtree-italian-delicious-slice-pizza-vector-png-image_6327853.jpg",
    ),
    MCategorias(
        id = 4,
        title = "Japanese",
        image = "https://png.pngtree.com/png-clipart/20210309/original/pngtree-beautiful-japanese-food-sashimi-png-image_5903158.jpg",
    ),
    MCategorias(
        id = 5,
        title = "Chinese",
        image = "https://png.pngtree.com/png-clipart/20250118/original/pngtree-dining-gourmet-food-normally-vegetables-fruits-western-food-chinese-food-matching-png-image_5445537.png",
    ),
)