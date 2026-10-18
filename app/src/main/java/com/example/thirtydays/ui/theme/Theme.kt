package com.example.thirtydays.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = GreenPrimary,
    onPrimary = OnDark,
    surfaceVariant = GreenLight,
    tertiary = GoldAccent,
    tertiaryContainer = GoldContainer
)

@Composable
fun ThirtyDaysTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography,
        content = content
    )
}