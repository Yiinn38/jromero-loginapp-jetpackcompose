package com.rasec.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import coil3.compose.AsyncImage
import coil3.compose.SubcomposeAsyncImage
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.rasec.loginapp.components.HeaderLoginScreen
import com.rasec.loginapp.components.InputPassword
import com.rasec.loginapp.components.InputText
import com.rasec.loginapp.ui.theme.BackgroundColor
import com.rasec.loginapp.ui.theme.Cloud
import com.rasec.loginapp.ui.theme.DarkGray
import com.rasec.loginapp.ui.theme.LightGray
import com.rasec.loginapp.ui.theme.LoginAppTheme
import com.rasec.loginapp.ui.theme.SignUpScreenRoute

@Composable
fun LoginScreen(navController: NavController) {
  Box(
    modifier = Modifier
      .fillMaxSize()
  ) {
    HeaderLoginScreen()
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.70f)
        .align(Alignment.BottomCenter)
        .clip(RoundedCornerShape(topStart = 40.dp))
        .background(BackgroundColor)
        .padding(horizontal = 16.dp)
        .padding(bottom = 12.dp),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      Text(
        text = "Login",
        color = DarkGray,
        style = MaterialTheme.typography.bodyLarge,
        fontSize = 32.sp,
        modifier = Modifier.padding(vertical = 40.dp)
      )
      InputText(title = "Email")
      InputPassword(title = "Password")

      Spacer(modifier = Modifier.weight(1f))

      TextButton(
        onClick = {
          navController.navigate(SignUpScreenRoute) {
            launchSingleTop = true
            popUpTo(navController.graph.startDestinationId) {
              saveState = true
            }
            restoreState = true
          }
        }
      ) {
        Text(
          text = "Don't have any account? Sing Up",
          style = MaterialTheme.typography.titleSmall,
          color = DarkGray,
        )
      }
    }
  }
}


@Preview(
  showBackground = true,
  showSystemUi = true
)
@Composable
fun LoginPreview() {
  LoginAppTheme {
    val navController = rememberNavController()
    LoginScreen(navController)
  }
}