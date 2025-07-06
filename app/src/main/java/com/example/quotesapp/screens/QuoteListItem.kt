package com.example.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quotesapp.model.quote


@Composable
fun QuoteListItem(quote: quote ,onClick: (quote:quote) ->Unit){
   Card(
      modifier = Modifier
          .clickable { onClick(quote) }
         .padding(8.dp),
      shape = RectangleShape,
      elevation= CardDefaults.cardElevation(defaultElevation = 12.dp)

   ) {
    Row(modifier = Modifier.padding(10.dp)) {
      Image(
         imageVector = Icons.Filled.FormatQuote,
         contentDescription ="quote",
         colorFilter= ColorFilter.tint(Color.White),
         alignment = Alignment.TopStart,
         modifier = Modifier
             .size(40.dp)
             .rotate(180F)
             .background(Color.Black)
      )
       Spacer(modifier = Modifier.padding(4.dp))
       Column(modifier=Modifier.weight(1f)) {

           Text(text = quote.text,
              fontWeight = FontWeight.SemiBold,
              style=MaterialTheme.typography.bodyMedium.copy(lineHeight = 16.sp),
              modifier = Modifier.padding(0.dp,0.dp,0.dp,8.dp)
           )
         /* Spacer(
             modifier = Modifier
                .fillMaxWidth(0.4f)     // 40% of parent's width
                .height(1.dp)           // 1 dp height = thin line
                .background(Color.Gray) // light gray color
          )

          */
          Box(modifier = Modifier
              .fillMaxWidth(.5f)
              .height(1.dp)
              .background(Color.LightGray)
          )

          Text(text = quote.author ,
             style=MaterialTheme.typography.bodyMedium,
             fontWeight = FontWeight.ExtraLight,
             modifier = Modifier.padding(2.dp,0.dp,0.dp,0.dp)
          )

       }
    }
   }
}


