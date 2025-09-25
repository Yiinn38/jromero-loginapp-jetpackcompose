package com.rasec.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rasec.loginapp.ui.theme.BackgroundColor
import com.rasec.loginapp.ui.theme.LoginAppTheme

@Composable
fun SignUpScreen(navController: NavController) {
  Column(
    modifier = Modifier
      .fillMaxSize()
      .background(BackgroundColor)
      .padding(top = 40.dp)
      .padding(horizontal = 12.dp)
  ) {
    Text(
      text = "Soy la pagina signup"
    )
    Button(
      onClick = { navController.navigate("login") }
    ) {
      Text(
        text = "Ir a login"
      )
    }
  }
}

@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun SignUpPreview() {
  LoginAppTheme {
    val navController = rememberNavController()
    SignUpScreen(navController)
  }
}