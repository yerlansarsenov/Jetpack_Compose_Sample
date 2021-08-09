package com.example.firstjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firstjc.ui.theme.FirstJCTheme
import com.example.firstjc.ui.theme.ImageCard
import com.example.firstjc.ui.theme.Purple200

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val painter = painterResource(id = R.drawable.img)
            val description = "best synyp"
            val title = "best synyp"
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(12.dp)
            ) {
                ImageCard(
                    painter = painter,
                    contentDescription = description,
                    title = title
                )
            }

        }
    }
}


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun DefaultPreview(
    content: @Composable () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Purple200)
    ) {
        Text("Hello")
        Text("World")
    }
    content()
//    Row {
//        Text("Hello")
//        Text("World")
//    }
}

@Preview
@Composable
fun SecondPreview() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .fillMaxHeight(0.5.toFloat())
            .fillMaxWidth()
            .border(5.dp, Color.Cyan)
            .padding(top = 16.dp, bottom = 16.dp, start = 8.dp, end = 8.dp)
    ) {
        Text("Hello", modifier = Modifier.clickable {  })
        Spacer(modifier = Modifier
            .height(20.dp))
        Text("World")
    }
}
