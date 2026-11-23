package br.com.devmobileaj.cotacaointeligente.presentation.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.devmobileaj.cotacaointeligente.R
import br.com.devmobileaj.cotacaointeligente.presentation.navigation.StateScreen
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.milliseconds

@Composable
fun SplashScreen(navController: NavController) {

    val timeLoad = 2500L

    LaunchedEffect(Unit) {
         delay( timeLoad.milliseconds )
         navController.navigate(StateScreen.HOME)
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.ic_currency_exchange),
            contentDescription = "Logo do app",
            modifier = Modifier.size(120.dp)
        )

        Text(
            "Cotação Inteligente",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 32.dp)
        )
        Text(
            "Faça suas cotações com ajuda de IA",
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 8.dp)
        )

        LinearProgressIndicator(
            modifier = Modifier.padding(start = 32.dp, end = 32.dp, top = 8.dp),
        )

    }

}