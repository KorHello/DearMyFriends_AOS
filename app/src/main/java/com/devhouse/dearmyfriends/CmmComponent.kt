package com.devhouse.dearmyfriends

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CmmComponent {
}

@Composable
fun MainNavigation(text: String) {
    Row (modifier = Modifier
        .fillMaxWidth()
        .height(60.dp), verticalAlignment = Alignment.CenterVertically) {
        Spacer(modifier = Modifier.width(46.dp))
        Text(modifier = Modifier.weight(1f), text = text, textAlign = TextAlign.Center, fontSize = 17.sp)
        Image(painter = painterResource(id = R.drawable.nav_btn_setting), contentDescription = null, modifier = Modifier
            .width(30.dp)
            .height(30.dp))
        Spacer(modifier = Modifier.width(16.dp))
    }
}