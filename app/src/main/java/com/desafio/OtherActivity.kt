package com.desafio// Arquivo: com.desafio.OtherActivity.kt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.desafio.ui.theme.DesafioTheme

class OtherActivity : ComponentActivity() {
    private val viewModel: OtherViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DesafioTheme {
                OtherScreen(viewModel)
            }
        }

        // Inicia a busca dos dados da API
        viewModel.fetchData()
    }
}
