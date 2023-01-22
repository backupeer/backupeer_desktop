package ui.screens.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import di.MainScreenModule
import org.kodein.di.instance
import theme.ColorSchemaProvider
import theme.Theme
import ui.controller.MainScreenController
import ui.controller.Route
import ui.screens.analyzer.AnalyzerScreen

@Composable
fun MainScreen() {
    val ctrl by MainScreenModule.instance<MainScreenController>()

    Row(
        modifier = Modifier.fillMaxSize().background(ColorSchemaProvider.current.surface),
        horizontalArrangement = Arrangement.Start
    ) {
        Sidebar()

        when (ctrl.actualRoute) {
            Route.ANALYZER -> {
                AnalyzerScreen()
            }

            else -> {}
        }
    }
}
