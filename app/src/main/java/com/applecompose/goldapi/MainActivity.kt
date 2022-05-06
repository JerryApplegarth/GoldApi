package com.applecompose.goldapi

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.applecompose.goldapi.model.Rates
import com.applecompose.goldapi.screens.GoldViewModel
import com.applecompose.goldapi.ui.theme.GoldApiTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			GoldApiTheme {
				// A surface container using the 'background' color from the theme
				Surface(
					modifier = Modifier.fillMaxSize(),
					color = MaterialTheme.colors.background
				) {
					GoldPriceHome()

				}
			}
		}
	}
}

@Composable
fun GoldPriceHome(viewModel: GoldViewModel = hiltViewModel()) {
	Questions(viewModel)

}

@Composable
fun Questions(viewModel: GoldViewModel) {

	val silver = viewModel.data.value.data?.XAG
	val gold = viewModel.data.value.data?.XAU
	val currency = viewModel.data.value.data?.USD

	Log.d("SILVER", "Questions: $silver")

	Column(
		modifier = Modifier
			.fillMaxSize()
			.padding(6.dp),
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center

	) {
		Text(text = "Silver Prices: ${silver.toString()}")
		Text(text = "GoldPrices: ${gold.toString()}")
		Text(text = "Currency: ${currency.toString()}")

	}




}


//
//https://www.metals-api.com/api/latest?access_key=s3w2n0421covvfl23goz8t5xn796qpia6aulihmt8661g5wnjru8hfkzzwp5&base=USD&symbols=XAU,XAG

// ?access_key=s3w2n0421covvfl23goz8t5xn796qpia6aulihmt8661g5wnjru8hfkzzwp5&base=USD&symbols=XAU,XAG

// https://www.metals-api.com/api/latest/



