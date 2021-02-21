package com.elviva.currencyconvertermvvm.data.models

data class CurrencyResponse(
    val base: String,
    val date: String,
    val rates: Rates
)