package br.com.devmobileaj.cotacaointeligente.presentation.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.GraphicEq
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.devmobileaj.cotacaointeligente.domain.Moeda
import br.com.devmobileaj.cotacaointeligente.presentation.components.ItemCurrency
import br.com.devmobileaj.cotacaointeligente.presentation.navigation.StateScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home(navController: NavController){

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Cotação Inteligente",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {navController.navigate(StateScreen.ANALISE)}
            ) {
                Row(
                    modifier = Modifier.padding(16.dp)

                ) {
                    Icon(imageVector = Icons.Filled.GraphicEq, contentDescription = "")
                    Text(
                        "Analisar",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 10.0.dp, end = 10.dp)
                    )
                }
            }
        }
    ) { innerPadding ->



        val currency = listOf(
            Moeda("USD", 1.40, "2026-11-22"),
            Moeda("USD", 1.40, "2026-11-22"),
            Moeda("USD", 1.40, "2026-11-22"),
            Moeda("USD", 1.40, "2026-11-22"),
            Moeda("USD", 1.40, "2026-11-22"),
        )

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {

            LazyColumn(
                 modifier = Modifier.fillMaxSize()
            ) {

                items(currency){ item->
                     ItemCurrency(modifier = Modifier.padding(8.dp), item = item)
                }

            }


        }

    }

}