package com.omrilhn.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.omrilhn.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Android")
            }
           /* testFunction(5){
            //you can either give function as parameter or write
                // it after these curly bracelets. WHEN THIS ARGUMENT IS THE LAST PARAMETER
                testFunctionLambda()
             }*/
        }
    /*fun  testFunction(int:Int, myFunction : ()-> Unit)//Second parameter is Lambda argument
    {
        myFunction.invoke()
    }
    fun testFunctionLambda()
    {
        println("test")
    }*/
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column() //Column-Row - Box: Use box when you want to set text above Image
    {

        CustomText(text = "Hello Android")
        CustomText(text = "Halo World")
        CustomText(text = "Lorem Ipsum")
    }

}
@Composable
fun CustomText(text : String)
{
    Text(
        text = text, //Reusable Text specifications

        modifier = Modifier
            .background(color = Color.DarkGray)
            .padding(
                top = 10.dp,
                start = 1.dp,
                end = 1.dp,
                bottom = 30.dp
            )//Set distance between text and the background border
            .clickable {//Trigger something when you click inside the border of here
                println("Is clicked")
            }
        //.width(250.dp) SET WIDTH OF THE BACKGROUND
        //.height(200.dp) SET HEIGHT OF THE BACKGROUND
        //.size(width = 30.dp, height =25.dp) EITHER SET BOTH WIDTH AND HEIGHT especially for Images
        //.fillMaxSize(1f) Size -> Width-Height

        ,color = Color.Magenta,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}