package com.desafio// Arquivo: com.desafio.OtherScreen.kt

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun OtherScreen(viewModel: OtherViewModel= viewModel()) {
    // Inicia a busca dos dados da API
    viewModel.fetchData()

    // Exibe os dados na interface do usuário
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Posts:")
        viewModel.posts.forEach { post ->
            Text(text = post.title)
        }

        Text(text = "Albums:")
        viewModel.albums.forEach { album ->
            Text(text = album.title)
        }
    }
}
