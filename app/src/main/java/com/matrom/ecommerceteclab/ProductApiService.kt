package com.matrom.ecommerceteclab

import retrofit2.http.GET

interface ProductApiService {
    @GET("b/MX0A")
    suspend fun getProducts(): ProductsResponse
}