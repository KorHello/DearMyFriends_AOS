package com.devhouse.dearmyfriends

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.devhouse.dearmyfriends.ui.theme.DearMyFriendsTheme

class IntroActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DearMyFriendsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    IntroContent()
                }
            }
        }
    }
}

@Composable
fun IntroContent () {
    Column {
        Spacer(modifier = Modifier.weight(1f))
        Image(painter = painterResource(id = R.drawable.intro_logo), contentDescription = null)
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "@Copyright 2023. Devhouse.", modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Preview(showBackground =  true)
@Composable
fun IntroPreview() {
    DearMyFriendsTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            IntroContent()
        }
    }
}