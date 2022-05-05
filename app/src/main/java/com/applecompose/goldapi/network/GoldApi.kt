package com.applecompose.goldapi.network

import com.applecompose.goldapi.model.Rates
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface GoldApi {

	@GET("?access_key=s3w2n0421covvfl23goz8t5xn796qpia6aulihmt8661g5wnjru8hfkzzwp5&base=USD&symbols=XAU%2CXAG%2CXPD%2CXPT%2CXRH/")
	suspend fun getAllPrices(): Rates

}
