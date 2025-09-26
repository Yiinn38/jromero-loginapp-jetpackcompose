package com.rasec.loginapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rasec.loginapp.ui.theme.BackgroundColor
import com.rasec.loginapp.ui.theme.DarkGray
import com.rasec.loginapp.ui.theme.MediumGray
import com.rasec.loginapp.ui.theme.White

@Composable
fun InputText(title: String = "", type: String = "") {
  var email by remember { mutableStateOf("") }

  Column(
    modifier = Modifier
      .fillMaxWidth()
      .padding(vertical = 10.dp)
      .clip(RoundedCornerShape(16.dp))
      .background(White)
      .padding(vertical = 8.dp, horizontal = 4.dp)
  ) {
    Text(
      text = title,
      color = DarkGray,
      style = MaterialTheme.typography.bodyMedium,
      fontSize = 16.sp,
      modifier = Modifier.padding(start = 8.dp)
    )
    TextField(
      value = email,
      onValueChange = { email = it },
      placeholder = { Text(type, color = Color.Gray) },
      modifier = Modifier
        .fillMaxWidth(),
      colors = TextFieldDefaults.colors(
        cursorColor = MediumGray,
        focusedContainerColor = White,
        unfocusedContainerColor = White,
        focusedIndicatorColor = White,
        unfocusedIndicatorColor = White,
        focusedTextColor = MediumGray
      )
    )
  }
}