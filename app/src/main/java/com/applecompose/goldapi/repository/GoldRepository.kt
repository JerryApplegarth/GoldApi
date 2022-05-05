package com.applecompose.goldapi.repository

import android.util.Log
import com.applecompose.goldapi.data.DataOrException
import com.applecompose.goldapi.model.GoldList
import com.applecompose.goldapi.model.Rates
import com.applecompose.goldapi.network.GoldApi
import javax.inject.Inject

class GoldRepository @Inject constructor(
	private val api: GoldApi) {
	private val dataOrException =
		DataOrException<Rates,
				Boolean,
				Exception>()

	suspend fun getAllPrices(): DataOrException<Rates, Boolean, Exception> {
		try {
			dataOrException.loading = true
			dataOrException.data = api.getAllPrices()
			if (dataOrException.data    .toString().isNotEmpty()) dataOrException.loading = false

		}catch (exception: Exception) {
			dataOrException.e = exception
			Log.d("Exc", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")

		}
		return dataOrException
	}



}