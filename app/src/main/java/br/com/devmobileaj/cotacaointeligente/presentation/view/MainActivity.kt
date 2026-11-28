package br.com.devmobileaj.cotacaointeligente.presentation.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import br.com.devmobileaj.cotacaointeligente.presentation.navigation.SetupNavigation
import br.com.devmobileaj.cotacaointeligente.presentation.ui.theme.CotacaoInteligenteTheme
import br.com.devmobileaj.cotacaointeligente.presentation.viewmodel.RateViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val rateViewModel: RateViewModel = hiltViewModel()

            CotacaoInteligenteTheme {
                   SetupNavigation(rateViewModel)
            }
        }
    }
}

