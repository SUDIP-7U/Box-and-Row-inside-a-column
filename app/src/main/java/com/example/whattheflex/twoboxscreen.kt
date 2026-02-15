package com.example.whattheflex

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
@Composable
fun TwoRowsWithBoxes() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.size(width = 100.dp, height = 100.dp)
                    .background(Color.LightGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Row Box 1")
            }

            Spacer(modifier = Modifier.width(32.dp))

            Box(modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "row Box 2")
            }
            Spacer(modifier = Modifier.width(32.dp))

            Box(modifier = Modifier
                .size(width = 100.dp, height = 100.dp)
                .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Row Box 3")
            }
        }

        Spacer(modifier = Modifier.height(32.dp)) // gap between rows

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .background(Color.Magenta),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "2nd row Box 1")
            }

            Spacer(modifier = Modifier.width(32.dp))

            Box(modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Row Box 2")
            }
        }

        Spacer(modifier = Modifier.height(32.dp)) // gap between rows

        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .size(width = 80.dp, height = 80.dp)
                    .background(Color.Magenta),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "3rd Row Box ")
            }
            Spacer(modifier = Modifier.width(32.dp))
            Box(
                modifier = Modifier
                    .size(width = 80.dp, height = 80.dp)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Row Box 2 ")
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        Box(modifier = Modifier
            .size(width = 80.dp, height = 80.dp)
            .background(Color.Green),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "80 dp box")
        }
    }
}