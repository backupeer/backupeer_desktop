package ui.screens.analyzer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun AnalyzerScreen() {
    Row(modifier = Modifier.fillMaxSize(), horizontalArrangement = Arrangement.Start) {
        LeftMenu()
    }
}