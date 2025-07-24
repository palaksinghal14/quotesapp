package com.example.quotesapp.screens

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.model.quote


@Composable
fun QuoteListScreen (data: Array<quote>, onClick: (quote:quote)-> Unit) {
    Column {
        Text(text = "Quotes app",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp,24.dp)
                .fillMaxWidth(1f)
        )
        QuoteList(data = data , onClick)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewQuoteListScreen() {
    val sampleQuotes = arrayOf(
        quote("Be yourself; everyone else is already taken.", "Oscar Wilde"),
        quote("The only way to do great work is to love what you do.", "Steve Jobs"),
    )

    QuoteListScreen(
        data = sampleQuotes,
        onClick = { /* Do nothing or show a log */ }
    )
}
