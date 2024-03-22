package com.desafio// Arquivo: com.desafio.RetrofitClient.kt

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitClient {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    // Configuração do Retrofit para criar instância da interface da API
    val api: JsonPlaceholderApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(JsonPlaceholderApi::class.java)
    }
}

interface JsonPlaceholderApi {
    @GET("/posts")
    suspend fun getPosts(): List<Post>

    @GET("/albums")
    suspend fun getAlbums(): List<Album>
}
