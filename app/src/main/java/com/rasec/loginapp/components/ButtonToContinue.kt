package com.rasec.loginapp.components

import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rasec.loginapp.ui.theme.DarkGray
import com.rasec.loginapp.ui.theme.White

@Composable
fun ButtonToContinue(buttonTitle: String = "") {
  Button(
    onClick = { },
    modifier = Modifier
      .padding(top = 8.dp)
      .fillMaxWidth()
      .clip(RoundedCornerShape(topStart = 16.dp, bottomStart = 16.dp, bottomEnd = 16.dp))
      .background(DarkGray)
      .padding(vertical = 2.dp, horizontal = 12.dp)
    ,
    colors = ButtonDefaults.buttonColors(
      containerColor = Color.Transparent,
      disabledContainerColor = Color.Transparent,
    )
  ) {
    Text(
      text = buttonTitle,
      color = White,
      style = MaterialTheme.typography.displayMedium,
      fontSize = 14.sp
    )
  }
}