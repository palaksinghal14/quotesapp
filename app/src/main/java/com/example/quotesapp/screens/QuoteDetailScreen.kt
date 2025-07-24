package com.example.quotesapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.datamanager
import com.example.quotesapp.model.quote

@Composable
fun QuoteDetail(quote: quote) {
    BackHandler() {
        datamanager.SwitchPages(null)
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color.White,
                        Color.LightGray
                    )
                )
            )
    ) {
        Card(
            modifier = Modifier
                .padding(32.dp),
            shape = RectangleShape,
            elevation= CardDefaults.cardElevation(defaultElevation = 12.dp)

        ){
            Column (verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(16.dp,24.dp)){
                Image(
                    imageVector = Icons.Filled.FormatQuote,
                    contentDescription = "quote",
                    // colorFilter = ColorFilter.tint(Color.White),
                    //  alignment = Alignment.TopStart,
                    modifier = Modifier
                        .size(80.dp)
                        .rotate(180F)
                    //.background(Color.Black)
                )
                Text(
                    text = quote.text,
                    fontWeight = FontWeight.SemiBold,
                    fontSize =25.sp,
                    style = MaterialTheme.typography.bodyMedium.copy(lineHeight = 30.sp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = quote.author,
                    style = MaterialTheme.typography.bodyMedium,
                    fontSize =20.sp,
                    fontWeight = FontWeight.Light,
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewquoteDetailScreen(){
    val Samplequote=quote(text = "sgiwbc bwycehsc b",
        author = "dghydbhddb")
    
    QuoteDetail(quote = Samplequote)
}