package com.poklad.androidtestprojectny.utils

object ApiConstants {
    const val BASE_URL = "https://api.nytimes.com/svc/books/v3/"
    const val API_KEY = "xcO7wwd01AQwi4uzMXH1YUAZ9oraClkY"
    const val GET_ALL_CATEGORIES = "lists/names.json"
    private const val GET_BOOKS_BY_SPECIFIC_CATEGORY = "lists/current"
    const val GET_BOOKS_BY_CATEGORY = "$GET_BOOKS_BY_SPECIFIC_CATEGORY/{category}.json"
}
