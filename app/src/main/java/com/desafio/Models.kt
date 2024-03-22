package com.desafio

// Arquivo: Models.kt

// Importações podem variar dependendo das necessidades do projeto

// Importação necessária para utilizar a anotação @SerializedName

// Definição do modelo de dados para os posts
data class Post(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)

// Definição do modelo de dados para os álbuns
data class Album(
    val userId: Int,
    val id: Int,
    val title: String
)
