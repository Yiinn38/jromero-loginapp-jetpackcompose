package com.rasec.loginapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rasec.loginapp.ui.theme.BackgroundColor
import com.rasec.loginapp.ui.theme.LightGray
import com.rasec.loginapp.ui.theme.MediumGray
import com.rasec.loginapp.ui.theme.White

@Composable
fun InputPassword(title: String = "") {
  var password by remember { mutableStateOf("") }

  Column(
    modifier = Modifier
      .fillMaxWidth()
      .padding(vertical = 10.dp)
      .background(White)
      .padding(vertical = 8.dp, horizontal = 4.dp)
  ) {
    Text(
      text = title,
      color = MediumGray,
      style = MaterialTheme.typography.bodyMedium,
      fontSize = 20.sp,
      modifier = Modifier.padding(start = 8.dp)
    )
    TextField(
      value = password,
      onValueChange = { password = it },
      placeholder = { Text("• • • • • • •", color = LightGray) },
      visualTransformation = PasswordVisualTransformation(),
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