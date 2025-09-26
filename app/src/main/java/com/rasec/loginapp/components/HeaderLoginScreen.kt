package com.rasec.loginapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.rasec.loginapp.ui.theme.Cloud
import com.rasec.loginapp.ui.theme.DarkGray
import com.rasec.loginapp.ui.theme.LightGray
import com.rasec.loginapp.ui.theme.White

@Composable
fun HeaderLoginScreen() {
  Box(
    modifier = Modifier
      .fillMaxWidth()
      .fillMaxHeight(0.4f)
      .background(DarkGray),
    contentAlignment = Alignment.Center
  ) {
    AsyncImage(
      model = "https://wallpapercat.com/w/full/9/5/a/945731-3840x2160-desktop-4k-matte-black-wallpaper-image.jpg",
      contentDescription = "Imagen portada",
      contentScale = ContentScale.Crop
    )
    Icon(
      imageVector = Cloud,
      contentDescription = null,
      tint = DarkGray,
      modifier = Modifier
        .clip(RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp, bottomEnd = 20.dp))
        .background(White)
        .size(80.dp)
        .padding(10.dp)
    )
  }
}