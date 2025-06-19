package com.example.spotiplay

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spotiplay.ui.theme.SpotiPlayTheme

class DetailedView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        //Arrays have been brought in from first screen
        val songArray = intent.getStringArrayExtra("song") ?: arrayOf()
        val artistArray = intent.getStringArrayExtra("artist") ?: arrayOf()
        val ratingArray = intent.getStringArrayExtra("rating") ?: arrayOf()
        val commentArray = intent.getStringArrayExtra("comment") ?: arrayOf()

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            ////////////////////////////Goitsemodimo Monare ST10471532//////////////////////////////
            SpotiPlayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEFB069)
                ) {
                    var firstInt by remember {
                        mutableStateOf("")
                    }
                    var secondInt by remember {
                        mutableStateOf("")
                    }
                    var thirdInt by remember {
                        mutableStateOf("")
                    }
                    var fourthInt by remember {
                        mutableStateOf("")
                    }
                    var result by remember {
                        mutableStateOf(0)
                    }
                    var average by remember {
                        mutableStateOf("")
                    }


                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "SpotiPlay",
                            modifier = Modifier,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Black
                        )

                        Spacer(modifier = Modifier.size(30.dp))

                        Text(
                            text = "Here is your created playlist",
                            modifier = Modifier,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold
                        )

                        Spacer(modifier = Modifier.size(30.dp))


                        Column {
                            Text(text = "Song     Artist      Rating      Comment" )

                            // Displays the song and details
                            for (i in songArray.indices){
                                val song = songArray[i]
                                //getOrNull returns a "?" when array is out of bound
                                val artist = artistArray.getOrNull(i) ?: "?"
                                val rating = ratingArray.getOrNull(i) ?: "?"
                                val comment = commentArray.getOrNull(i) ?: "?"

                                Text(text = "-$song     - $artist    - $rating     - $comment")
                            }
                        }

                        //Average Button
                        Button(
                            onClick = {
                                firstInt = ratingArray[0]
                                secondInt = ratingArray[1]
                                thirdInt = ratingArray[2]
                                fourthInt = ratingArray[3]

                                result= Average(firstInt.toInt(), secondInt.toInt(), thirdInt.toInt(), fourthInt.toInt())

                                average = "Average Rating: $result"
                            }
                        ) {
                            Text("Average Rating")
                        }

                        //Return to main screen
                        Button(
                            onClick = {
                                val back = Intent(this@DetailedView,MainActivity::class.java)
                                startActivity(back)
                            }
                        ) {
                            Text("Back")
                        }

                        result.toDouble()
                        Text(text = average)

                    }
                }
            }
        }
    }
}

//Function for calculating Average of Ratings
fun Average (firstInt: Int, secondInt: Int, thirdInt: Int, fourthInt: Int): Int {
    val result: Int = (firstInt + secondInt + thirdInt + fourthInt) / 4

    return result
}

