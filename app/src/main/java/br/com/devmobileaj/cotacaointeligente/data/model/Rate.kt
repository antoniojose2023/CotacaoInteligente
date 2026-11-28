package br.com.devmobileaj.cotacaointeligente.data.model

import br.com.devmobileaj.cotacaointeligente.domain.Moeda

data class Rate(
    val date: String,
    val base: String,
    val quote: String,
    val rate: Double
)

fun Rate.toMoeda(): Moeda {
    return Moeda(
          data = this.date,
          simbolo = this.base,
          cotacao = this.quote,
          valor = this.rate
    )
}
