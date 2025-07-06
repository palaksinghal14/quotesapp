package com.example.quotesapp
import com.example.quotesapp.screens.QuoteDetail
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.quotesapp.screens.QuoteList
import com.example.quotesapp.screens.QuoteListScreen
import com.example.quotesapp.ui.theme.QuotesappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        datamanager.loadAssestsFromFile(this)
        setContent {
            App()
        }
    }
}
@Composable
fun App(){
    if(datamanager.isDataLoaded.value){
        if(datamanager.currentpage.value==Pages.LISTING){
            QuoteListScreen(data = datamanager.data) {
              datamanager.SwitchPages(it)
            }
        }
      else{
            datamanager.currentquote?.let { QuoteDetail(quote = it) }
        }
    }
}

enum class Pages{
    LISTING,
    DETAIL
}