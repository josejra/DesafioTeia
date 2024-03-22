package com.desafio// Arquivo: com.desafio.OtherRepository.kt

class OtherRepository {
    suspend fun getPosts(): List<Post> {
        return RetrofitClient.api.getPosts()
    }

    suspend fun getAlbums(): List<Album> {
        return RetrofitClient.api.getAlbums()
    }
}
