package com.example.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.model.Quote

@Composable
fun QuoteList(data: Array<Quote>,onClick:(quote:Quote)->Unit) {
    LazyColumn(modifier = Modifier.padding(14.dp),content = {
        items(data) {
            ListItem(quote = it,onClick)
        }
    })
}