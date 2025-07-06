package com.example.quotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.quotesapp.model.quote

@Composable
fun QuoteList(data : Array<quote> , onClick :(quote:quote)-> Unit){
    LazyColumn(content = {
        items(data){
            QuoteListItem(quote = it ,   onClick)
        }
    })
}



