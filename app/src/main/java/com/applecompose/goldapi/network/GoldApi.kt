package com.applecompose.goldapi.network

import com.applecompose.goldapi.model.Rates
import com.applecompose.goldapi.utils.Constants
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface GoldApi {

	@GET(Constants.END_POINTS)
	suspend fun getAllPrices(): Rates
}
