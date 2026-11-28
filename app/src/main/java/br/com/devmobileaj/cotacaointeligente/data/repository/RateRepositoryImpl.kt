package br.com.devmobileaj.cotacaointeligente.data.repository

import android.util.Log
import br.com.devmobileaj.cotacaointeligente.data.model.Rate
import br.com.devmobileaj.cotacaointeligente.data.model.toMoeda
import br.com.devmobileaj.cotacaointeligente.data.remote.ServiceApiFrankfurter
import br.com.devmobileaj.cotacaointeligente.domain.Moeda
import br.com.devmobileaj.cotacaointeligente.domain.repository.RateRepository
import jakarta.inject.Inject
import kotlin.math.log

class RateRepositoryImpl @Inject constructor(val service: ServiceApiFrankfurter): RateRepository {
    override suspend fun getRates(): List<Moeda> {
         val response = service.getRates()
         try {

             if(response.isSuccessful && response.body() != null){
                    val rates = response.body()!!
                    return rates.map{it.toMoeda()}
             }

         }catch (ex: Exception){
             Log.i("TAG", "getRates: "+ex.message.toString())
         }

        return emptyList()
    }
}