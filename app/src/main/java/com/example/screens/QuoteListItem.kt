package com.example.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.model.Quote
import com.example.quoteapp.R


@Composable
fun ListItem(quote: Quote, onClick: (quote:Quote) -> Unit) {
    Card(elevation = 4.dp, modifier = Modifier.padding(4.dp).clickable { onClick(quote) }) {
        Row(modifier = Modifier.padding(4.dp)) {
            Image(
                painter = painterResource(id = R.drawable.quote),
                contentDescription = "",
                modifier = Modifier.size(45.dp).padding(4.dp),
                alignment = Alignment.TopStart,
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    fontSize = 16.sp,
                    text = quote.quote,
                    style = MaterialTheme.typography.body2,
                    modifier = Modifier.padding(0.dp, 4.dp, 0.dp, 4.dp)
                )
                Box(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .fillMaxWidth(.2f)
                        .height(1.dp)
                        .padding(0.dp, 4.dp, 0.dp, 0.dp)
                )
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.caption,
                    color = Color.Gray,
                    modifier = Modifier.padding(0.dp, 4.dp, 0.dp,8.dp)

                )
            }
        }
    }
}