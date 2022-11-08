package ine.joyun.mybusinesscard

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.android.style.LineHeightSpan
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ine.joyun.mybusinesscard.ui.theme.MyBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeTheBusinessCard()
                }
            }
        }
    }
}

@Composable
private fun ComposeTheBusinessCard() {
    val TitleFontSize = 40
    Column {
        Text(
            text = "Jeong Jo Yun's\nReception",
            lineHeight = (TitleFontSize + 6).sp,
            textAlign = TextAlign.End,
            fontSize = TitleFontSize.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp)
        )
        Row {
            Column {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(
                            top = 30.dp,
                            start = 30.dp,
                            end = 30.dp,
                            bottom = 20.dp
                        )
                        .size(120.dp)
                )
                Text(
                    text = "Profile Image",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(start = 42.dp)
                )
            }
            Column {
                Text(
                    "Kotlin Fundamentals",
                    modifier = Modifier.padding(top = 30.dp),
                    fontWeight = FontWeight.Black,
                    fontSize = 18.sp
                )
                Text("  Functions, Literals.")
                Text(
                    "Android composable",
                    modifier = Modifier.padding(top = 20.dp),
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 18.sp
                )
                Text("  Row, Column, Box, Image, Text")
                Text(
                    "Android composes",
                    modifier = Modifier.padding(top = 20.dp),
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp
                )
                Text("  Many Things.")
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 16.0.dp)
                .size(width = 600.dp, height = 6.dp)
                .alpha(0.6f)
                .background(Color.Black)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(text = "Kotlin", fontSize = 32.sp, fontWeight = FontWeight.W700)
                Text(text = "Functions, Literals.")
            }
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Android", fontSize = 32.sp, fontWeight = FontWeight.W700)
                Text(text = "Composable")
            }
        }
        Text(
            "What's Next Project!?!?!?!??",
            fontSize = 53.3.sp,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(30.dp)
        )
    }

}

@Preview(showBackground = true, name = "god")
@Composable
private fun PreviewTheBusinessCard() {
    MyBusinessCardTheme {
        ComposeTheBusinessCard()
    }
}