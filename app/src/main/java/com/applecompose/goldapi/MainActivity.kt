package com.applecompose.goldapi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.applecompose.goldapi.ui.theme.GoldApiTheme

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

				}
			}
		}
	}
}


//
//https://www.metals-api.com/api/latest?access_key=s3w2n0421covvfl23goz8t5xn796qpia6aulihmt8661g5wnjru8hfkzzwp5&base=USD&symbols=XAU,XAG

// ?access_key=s3w2n0421covvfl23goz8t5xn796qpia6aulihmt8661g5wnjru8hfkzzwp5&base=USD&symbols=XAU,XAG

// https://www.metals-api.com/api/latest/



