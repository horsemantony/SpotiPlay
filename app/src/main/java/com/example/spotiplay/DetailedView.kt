package com.example.spotiplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
        setContent {
            SpotiPlayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEFB069)
                ) {
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

                        




                    }
                }
            }
        }
    }
}

