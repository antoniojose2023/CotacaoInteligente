package br.com.devmobileaj.cotacaointeligente.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.devmobileaj.cotacaointeligente.domain.Moeda
import br.com.devmobileaj.cotacaointeligente.domain.usecase.RateUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import java.util.Collections.emptyList
import javax.inject.Inject

@HiltViewModel
class RateViewModel @Inject constructor(val useCase: RateUseCase) : ViewModel(){

       private val _state = MutableStateFlow(emptyList<Moeda>())
       var state : StateFlow<List<Moeda>> = _state

       init {
           getRates()
       }

      fun getRates(){
          viewModelScope.launch {
               _state.value = useCase.invoke()
          }
      }
}



