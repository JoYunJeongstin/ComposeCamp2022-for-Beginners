package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        val modifier = Modifier
            .weight(1f)
            .fillMaxSize()
        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.first_title),
                description = stringResource(R.string.fourth_description),
                backgroundColor = Color.Green,
                modifier = modifier)
            ComposableInfoCard(
                title = stringResource(R.string.second_title),
                description = stringResource(R.string.second_description),
                backgroundColor = Color.Yellow,
                modifier = modifier)
        }
        Row(modifier = Modifier.weight(1f)) {
            val thirdTitle = stringResource(R.string.third_title)
            val thirdDescription = stringResource(R.string.third_description)
            ComposableInfoCard(
                title = thirdTitle,
                description = thirdDescription,
                backgroundColor = Color.Cyan,
                modifier = modifier
            )
            val fourthTitle = stringResource(R.string.fourth_title)
            val fourthDescription = stringResource(R.string.fourth_description)
            ComposableInfoCard(
                title = fourthTitle,
                description = fourthDescription,
                backgroundColor = Color.LightGray,
                modifier = modifier
            )
        }
    }
}

//private fun Modifier.duplicateModifier(color: Color): Modifier {
//    return this
//        .fillMaxSize()
//        .background(color)
//        .wrapContentSize(Alignment.Center)
//        .padding(16.dp)
//}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .background(backgroundColor)
            .wrapContentSize(Alignment.Center)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally)
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify,
            fontSize = TextUnit.Unspecified
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantApp()
}