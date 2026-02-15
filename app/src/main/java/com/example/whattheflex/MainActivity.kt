package com.example.whattheflex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whattheflex.ui.theme.WhatTheFlexTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           TwoRowsWithBoxes()

//            PlaylistHeader(
//                coverArt = painterResource(id = R.drawable.download), // replace with your drawable
//                title = "Stay Hungry Mind Clean",
//                creator = "Sudip Banik",
//                meta = "3 songs • 13 min"
//            )

        }
    }
}

@Composable
fun PlaylistHeader(
    coverArt: Painter,
    title: String,
    creator: String,
    meta: String
) {
    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = coverArt,
            contentDescription = null,
            modifier = Modifier.size(200.dp).clip(RoundedCornerShape(8.dp))
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(title, style = MaterialTheme.typography.titleLarge)
        Text("By $creator", style = MaterialTheme.typography.titleLarge, color = Color.Gray)
        Text(meta, style = MaterialTheme.typography.titleLarge, color = Color.Gray)
    }
}

@Preview(showBackground = true)
@Composable
fun PlaylistHeaderPreview() {

}
