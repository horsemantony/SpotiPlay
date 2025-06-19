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
import androidx.compose.material3.OutlinedTextField
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

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ////////////////////////////Goitsemodimo Monare ST10471532//////////////////////////////
            SpotiPlayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEFB069)
                ) {
                    //Array for Song
                    var song by remember {
                        mutableStateOf("")
                    }
                    var songArray by remember {
                        mutableStateOf(arrayOf<String>())
                    }

                    //Array for Artist
                    var artist by remember {
                        mutableStateOf("")
                    }
                    var artistArray by remember {
                        mutableStateOf(arrayOf<String>())
                    }

                    //Array for Rating
                    var rating by remember {
                        mutableStateOf("")
                    }
                    var ratingArray by remember {
                        mutableStateOf(arrayOf<String>())
                    }

                    //Array for Comment
                    var comment by remember {
                        mutableStateOf("")
                    }
                    var commentArray by remember {
                        mutableStateOf(arrayOf<String>())
                    }


                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally)
                    {
                        Text(
                            text = "SpotiPlay",
                            modifier = Modifier,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Black
                            )

                        Spacer(modifier = Modifier.size(30.dp))

                        Text(text = "Let's help you manage your playlists!")

                        Spacer(modifier = Modifier.size(30.dp))

                        //Text Box for Song
                        OutlinedTextField(
                            value = song,
                            onValueChange = {song = it},
                            placeholder ={ Text("e.g. Finest") }
                        )
                        Spacer(modifier = Modifier.size(30.dp))

                        //Text Box for Artist
                        OutlinedTextField(
                            value = artist,
                            onValueChange = {artist = it},
                            placeholder ={ Text("e.g. Finest") }
                        )
                        Spacer(modifier = Modifier.size(30.dp))

                        //Text Box for rating
                        OutlinedTextField(
                            value = rating,
                            onValueChange = {rating = it},
                            placeholder ={ Text("e.g. Finest") }
                        )
                        Spacer(modifier = Modifier.size(30.dp))

                        //Text Box for Comment
                        OutlinedTextField(
                            value = comment,
                            onValueChange = {comment = it},
                            placeholder ={ Text("e.g. Finest") }
                        )
                        Spacer(modifier = Modifier.size(30.dp))



                        Button(
                            onClick = {


                            }) {
                            Text(text = "Add to Playlist")
                        }




                    }
                }
            }
        }
    }
}



