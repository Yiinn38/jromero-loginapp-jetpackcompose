package com.rasec.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil3.compose.AsyncImage
import com.rasec.loginapp.components.ButtonToContinue
import com.rasec.loginapp.components.InputPassword
import com.rasec.loginapp.components.InputText
import com.rasec.loginapp.ui.theme.BackgroundColor
import com.rasec.loginapp.ui.theme.DarkGray
import com.rasec.loginapp.ui.theme.LoginAppTheme
import com.rasec.loginapp.ui.theme.LoginScreenRoute
import com.rasec.loginapp.ui.theme.SignUpScreenRoute
import com.rasec.loginapp.ui.theme.White

@Composable
fun SignUpScreen(navController: NavController) {
  Box(
    modifier = Modifier.fillMaxSize()
  ) {
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.28f)
        .background(DarkGray)
        .padding(top = 40.dp),
    ) {
      AsyncImage(
        model = "https://wallpapercat.com/w/full/9/5/a/945731-3840x2160-desktop-4k-matte-black-wallpaper-image.jpg",
        contentDescription = "Imagen portada SignUp",
        contentScale = ContentScale.Crop
      )
      Box(
        modifier = Modifier
          .fillMaxWidth()
          .padding(top = 40.dp)
      ) {
        Row(
          modifier = Modifier.fillMaxWidth(),
          verticalAlignment = Alignment.CenterVertically
        ) {
          Button(
            onClick = {
              navController.navigate(LoginScreenRoute) {
                launchSingleTop = true
                popUpTo(navController.graph.startDestinationId) {
                  saveState = true
                }
                restoreState = true
              }
            },
            colors = ButtonDefaults.buttonColors(
              containerColor = Color.Transparent,
              disabledContainerColor = Color.Transparent,
            ),
            contentPadding = PaddingValues(0.dp),
          ) {
            Icon(
              imageVector = Icons.Default.ArrowBack,
              contentDescription = null,
              tint = White
            )
          }
          Box(
            modifier = Modifier
              .fillMaxWidth()
              .padding(end = 60.dp),
            contentAlignment = Alignment.Center
          ) {
            Text(
              text = "Sign Up",
              color = White,
              style = MaterialTheme.typography.bodyLarge,
              fontSize = 36.sp
            )
          }
        }
      }
    }
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.80f)
        .align(Alignment.BottomCenter)
        .clip(RoundedCornerShape(topStart = 40.dp))
        .background(BackgroundColor)
        .padding(horizontal = 25.dp, vertical = 16.dp),
      horizontalAlignment = Alignment.CenterHorizontally,
    ) {
      InputText(title = "First name", type = "Cesar")
      InputText(title = "Last name", type = "Romero")
      InputText(title = "Email", type = "example@email.com")
      InputPassword(title = "Password")
      InputPassword(title = "Confirm Password")

      ButtonToContinue(buttonTitle = "Sign Up")

      Spacer(modifier = Modifier.weight(1f))

      TextButton(
        onClick = {
          navController.navigate(LoginScreenRoute) {
            launchSingleTop = true
            popUpTo(navController.graph.startDestinationId) {
              saveState = true
            }
            restoreState = true
          }
        }
      ) {
        Text(
          text = "Already have any account? Sign In",
          style = MaterialTheme.typography.bodySmall,
          fontSize = 16.sp,
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
fun SignUpPreview() {
  LoginAppTheme {
    val navController = rememberNavController()
    SignUpScreen(navController)
  }
}