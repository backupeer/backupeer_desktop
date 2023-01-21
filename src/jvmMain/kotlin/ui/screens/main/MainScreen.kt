package ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import theme.ColorSchemaProvider
import theme.Theme

@Composable
fun MainScreen() {
    Row(
        modifier = Modifier.fillMaxSize().background(ColorSchemaProvider.current.surface),
        horizontalArrangement = Arrangement.Start
    ) {
        Sidebar()
    }
}
