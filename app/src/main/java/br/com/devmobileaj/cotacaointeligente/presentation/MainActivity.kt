package br.com.devmobileaj.cotacaointeligente.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.devmobileaj.cotacaointeligente.presentation.navigation.SetupNavigation
import br.com.devmobileaj.cotacaointeligente.presentation.ui.theme.CotacaoInteligenteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CotacaoInteligenteTheme {
                   SetupNavigation()
            }
        }
    }
}

