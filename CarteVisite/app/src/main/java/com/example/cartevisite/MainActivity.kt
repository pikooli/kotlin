package com.example.cartevisite

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cartevisite.ui.theme.CarteVisiteTheme
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteVisiteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun IconText(modifier: Modifier = Modifier, text: String, logo: Painter) {
    Row(modifier = modifier) {
        Icon(
            painter = logo, contentDescription = null, modifier = Modifier.padding(end = 16.dp),
            tint = Color(0xFFFFFFFF)
        )
        Text(
            text = text,
            modifier = modifier
        )
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFEADDFF))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(150.dp),
            )
            Text(
                text = "Hello",
                modifier = Modifier
            )
        }
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Bottom,
        ) {
            IconText(
                modifier = modifier, text =
                stringResource(R.string._0000000000), logo = painterResource(R.drawable.call_icon)
            )
            IconText(
                modifier = modifier,
                text =
                stringResource(R.string.xadresse),
                logo = painterResource(R.drawable.material_close_icon)
            )
            IconText(
                modifier,
                stringResource(R.string.email_email_com), painterResource(R.drawable.email_icon)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteVisiteTheme {
        Greeting()
    }
}