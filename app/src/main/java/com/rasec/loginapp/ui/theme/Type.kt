package com.rasec.loginapp.ui.theme

import com.rasec.loginapp.R

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val poppinsFontFamily = FontFamily(
  Font(R.font.poppins_regular),
  Font(R.font.poppins_light, FontWeight.W300),
  Font(R.font.poppins_black, FontWeight.W900),
  Font(R.font.poppins_bold, FontWeight.W700)
)


val poppinsTypo = Typography(

  titleLarge = TextStyle(
    fontWeight = FontWeight.W700,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 22.sp,
    lineHeight = 28.sp
  ),
  titleMedium = TextStyle(
    fontWeight = FontWeight.W700,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.15.sp
  ),
  titleSmall = TextStyle(
    fontWeight = FontWeight.W700,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.1.sp
  ),
  bodyLarge = TextStyle(
    fontWeight = FontWeight.Normal,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 16.sp,
    lineHeight = 24.sp
  ),
  bodyMedium = TextStyle(
    fontWeight = FontWeight.Normal,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 14.sp,
    lineHeight = 20.sp
  ),
  bodySmall = TextStyle(
    fontWeight = FontWeight.Normal,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 12.sp,
    lineHeight = 16.sp
  ),
  labelLarge = TextStyle(
    fontWeight = FontWeight.W700,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.1.sp
  ),
  labelMedium = TextStyle(
    fontWeight = FontWeight.W700,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 12.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.5.sp
  ),
  labelSmall = TextStyle(
    fontWeight = FontWeight.W700,
    fontFamily = com.rasec.loginapp.ui.theme.poppinsFontFamily,
    fontSize = 11.sp,
    lineHeight = 16.sp
  )
)