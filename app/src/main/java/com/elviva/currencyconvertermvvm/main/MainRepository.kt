package com.elviva.currencyconvertermvvm.main

import com.elviva.currencyconvertermvvm.data.models.CurrencyResponse
import com.elviva.currencyconvertermvvm.util.Resource

interface MainRepository {

    suspend fun getRates(base: String) : Resource<CurrencyResponse>
}