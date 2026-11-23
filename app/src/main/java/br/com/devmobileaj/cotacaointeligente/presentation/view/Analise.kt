package br.com.devmobileaj.cotacaointeligente.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.devmobileaj.cotacaointeligente.presentation.ui.theme.CinzaClaro
import br.com.devmobileaj.cotacaointeligente.presentation.ui.theme.VerdeEscuro

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Analise(
    navController: NavController,
){

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Resultado da Análise",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = CinzaClaro,
                    titleContentColor = Color.Black,
                    navigationIconContentColor = Color.Black,
                    actionIconContentColor = Color.Black
                ),
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {

                        Icon(
                            Icons.Filled.ArrowCircleLeft, contentDescription = "Voltar",
                             modifier = Modifier.size(40.dp),
                            tint = VerdeEscuro
                        )
                    }
                }
            )
        },


    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(CinzaClaro)
                .fillMaxSize()
        ) {

            Text(
                "Verifique as analise e tire suas próprias conclusões.",
                 modifier = Modifier.padding(16.dp)
            )

            HorizontalDivider(
                 modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 16.dp)
            )

            Card(
                modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 1.dp
                )
            ) {

                Text(
                    "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout." +
                        " The point of using Lorem Ipsum is that it has a" +
                        " more-or-less normal distribution of letters, as opposed to using 'Content here, content here'",
                    modifier = Modifier.padding(8.dp)
                )

            }


        }

    }

}