package br.com.devmobileaj.cotacaointeligente.data.remote

import br.com.devmobileaj.cotacaointeligente.data.model.Rate
import retrofit2.Response
import retrofit2.http.GET

interface ServiceApiFrankfurter {

   @GET("rates")
   suspend fun getRates(): Response<List<Rate>>

}