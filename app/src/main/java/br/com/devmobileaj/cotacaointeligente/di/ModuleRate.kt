package br.com.devmobileaj.cotacaointeligente.di

import br.com.devmobileaj.cotacaointeligente.data.remote.ServiceApiFrankfurter
import br.com.devmobileaj.cotacaointeligente.data.repository.RateRepositoryImpl
import br.com.devmobileaj.cotacaointeligente.domain.usecase.RateUseCase
import br.com.devmobileaj.util.Constante
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object ModuleRate {

    @Provides
    fun provideRetrofit() = Retrofit.Builder()
        .baseUrl(Constante.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideServiceApi(retrofit: Retrofit) = retrofit.create(ServiceApiFrankfurter::class.java)

    @Provides
    fun provideRepositoryRate(service: ServiceApiFrankfurter) = RateRepositoryImpl(service)

    @Provides
    fun provideUseCaseRate(repository: RateRepositoryImpl) = RateUseCase(repository)


}