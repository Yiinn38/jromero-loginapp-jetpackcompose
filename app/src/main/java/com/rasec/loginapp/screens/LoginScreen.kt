package com.rasec.loginapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
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
    Box(
      modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.4f)
        .background(DarkGray),
      contentAlignment = Alignment.Center
    ) {
      Icon(
        imageVector = Cloud,
        contentDescription = null,
        tint = DarkGray,
        modifier = Modifier
          .clip(RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp, bottomEnd = 20.dp))
          .background(LightGray)
          .padding(12.dp)
      )
      AsyncImage(
        model = "https://wallpapercat.com/w/full/9/5/a/945731-3840x2160-desktop-4k-matte-black-wallpaper-image.jpg",
        contentDescription = "Imagen portada",
        contentScale = ContentScale.Crop
      )
    }
    Column(
      modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.7f)
        .align(Alignment.BottomCenter)
        .clip(RoundedCornerShape(topStart = 40.dp))
        .background(BackgroundColor)
        .padding(horizontal = 8.dp)
        .padding(top = 40.dp)
    ) {
      Button(
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
          text = "Registrarse",
          style = MaterialTheme.typography.bodyMedium
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