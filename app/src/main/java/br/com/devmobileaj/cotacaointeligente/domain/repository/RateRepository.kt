package br.com.devmobileaj.cotacaointeligente.domain.repository

import br.com.devmobileaj.cotacaointeligente.data.model.Rate
import br.com.devmobileaj.cotacaointeligente.domain.Moeda

interface RateRepository {

   suspend fun getRates(): List<Moeda>

}