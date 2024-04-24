package com.example.dessertclicker.ui.theme

import com.example.dessertclicker.data.Datasource
import com.example.dessertclicker.model.Dessert

data class DessertClickerUiState (
    val revenue: Int = 0,
    val currentDessert: Dessert = Datasource.dessertList[0],
    val dessertSold: Int = 0,
    val dessertsList:  List<Dessert> = Datasource.dessertList
)