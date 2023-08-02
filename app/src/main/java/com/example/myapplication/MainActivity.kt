package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(
                        name = stringResource(R.string.android)
                    )
                    QAImage()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val greeting = stringResource(id = R.string.greeting)

    Text(
        text = "${stringResource(R.string.hello)} ${name}!",
        modifier = Modifier
            .testTag(MainActivitySemantics.greetingText)
            .semantics { contentDescription = greeting }
    )
}

@Composable
fun QAImage() {
    val image = painterResource(R.drawable.cry)

    Image(
        painter = image,
        contentDescription = "QA Image",
        modifier = Modifier.testTag(R.drawable.cry.toString())
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting(
                name = stringResource(R.string.android)
            )
            QAImage()
        }
    }
}