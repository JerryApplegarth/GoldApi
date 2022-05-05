package com.applecompose.goldapi.network

import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface GoldApi {

	@GET("?access_key=s3w2n0421covvfl23goz8t5xn796qpia6aulihmt8661g5wnjru8hfkzzwp5&base=USD&symbols=XAU,XAG")
	suspend fun
}
