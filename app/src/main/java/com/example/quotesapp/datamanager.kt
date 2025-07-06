package com.example.quotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.example.quotesapp.model.quote
import com.google.gson.Gson
import java.nio.charset.Charset

object datamanager
{
    var data= emptyArray<quote>()
    var currentpage= mutableStateOf(Pages.LISTING)
   var isDataLoaded = mutableStateOf(false)
    var currentquote:quote?=null

    fun loadAssestsFromFile(context: Context){
        val inputStream=context.assets.open("quotes.json")
        val size:Int=inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val json=String(buffer, Charsets.UTF_8)
        val gson= Gson()
       data=gson.fromJson(json,Array<quote>::class.java)
        isDataLoaded.value=true

    }
    fun SwitchPages(quote:quote?){
        if(currentpage.value==Pages.LISTING){
            currentquote=quote
            currentpage.value=Pages.DETAIL
        }
        else{
            currentpage.value=Pages.LISTING
        }
    }
}
