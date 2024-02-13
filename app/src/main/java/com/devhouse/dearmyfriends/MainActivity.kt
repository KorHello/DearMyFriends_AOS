package com.devhouse.dearmyfriends

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.devhouse.dearmyfriends.ui.theme.DearMyFriendsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DearMyFriendsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    DmfContent()
                }
            }
        }
    }
}

@Composable
fun DmfContent() {
    Column(modifier = Modifier.fillMaxSize()) {
        MainNavigation("")
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "isText", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 25.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "writer", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center, fontSize = 16.sp)
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DearMyFriendsTheme {
        DmfContent()
    }
}