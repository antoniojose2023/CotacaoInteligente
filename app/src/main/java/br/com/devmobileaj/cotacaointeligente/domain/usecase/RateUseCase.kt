package br.com.devmobileaj.cotacaointeligente.domain.usecase

import br.com.devmobileaj.cotacaointeligente.domain.repository.RateRepository
import javax.inject.Inject


class RateUseCase @Inject constructor(val repository: RateRepository) {
     suspend operator fun invoke() = repository.getRates()
}