package br.com.devmobileaj.cotacaointeligente.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.devmobileaj.cotacaointeligente.presentation.view.Analise
import br.com.devmobileaj.cotacaointeligente.presentation.view.Home
import br.com.devmobileaj.cotacaointeligente.presentation.view.SplashScreen

@Composable
fun SetupNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = StateScreen.SPLASH_SCREEN){
         composable(StateScreen.SPLASH_SCREEN) {
             SplashScreen(navController)
         }
         composable(StateScreen.HOME) {
             Home(navController)
         }
         composable(StateScreen.ANALISE) {
             Analise(navController,)
         }
    }
}