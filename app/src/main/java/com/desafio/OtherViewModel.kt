package com.desafio// Arquivo: com.desafio.OtherViewModel.kt

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class OtherViewModel : ViewModel() {
    private val repository = OtherRepository()

    // State para armazenar os posts e álbuns
    var posts: List<Post> by mutableStateOf(emptyList())
        private set

    var albums: List<Album> by mutableStateOf(emptyList())
        private set

    // Função para buscar os dados da API
    fun fetchData() {
        viewModelScope.launch {
            posts = repository.getPosts()
            albums = repository.getAlbums()
        }
    }
}
