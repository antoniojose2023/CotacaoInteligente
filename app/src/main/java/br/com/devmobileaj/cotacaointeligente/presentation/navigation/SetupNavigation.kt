package br.com.devmobileaj.cotacaointeligente.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.devmobileaj.cotacaointeligente.presentation.view.Analise
import br.com.devmobileaj.cotacaointeligente.presentation.view.Home
import br.com.devmobileaj.cotacaointeligente.presentation.view.SplashScreen
import br.com.devmobileaj.cotacaointeligente.presentation.viewmodel.RateViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun SetupNavigation(rateViewModel: RateViewModel) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = StateScreen.SPLASH_SCREEN){
         composable(StateScreen.SPLASH_SCREEN) {
             SplashScreen(navController)
         }
         composable(StateScreen.HOME) {
             Home(navController, rateViewModel)
         }
         composable(StateScreen.ANALISE) {
             Analise(navController)
         }
    }
}