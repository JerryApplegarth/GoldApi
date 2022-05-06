package com.applecompose.goldapi.screens

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.applecompose.goldapi.data.DataOrException
import com.applecompose.goldapi.model.Rates
import com.applecompose.goldapi.repository.GoldRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GoldViewModel @Inject constructor(
	private val repository: GoldRepository
): ViewModel(){
	val data: MutableState<DataOrException<Rates, Boolean, Exception>> =
		mutableStateOf(DataOrException(null, true, Exception("")))

	init {
		getAllPrices()
	}

	private fun getAllPrices() {
		viewModelScope.launch {
			data.value.loading = true
			data.value = repository.getAllPrices()
			if (data.value.data.toString().isNotEmpty()) {
				data.value.loading = false
			}
		}

	}
}