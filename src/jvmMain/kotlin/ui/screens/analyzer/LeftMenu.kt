package ui.screens.analyzer

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.dp
import di.AnalyzerScreenModule
import org.kodein.di.instance
import theme.ColorSchemaProvider
import ui.components.DefaultTextField
import ui.controller.AnalyzerScreenController

@Composable
fun LeftMenu() {
    val border = ColorSchemaProvider.current.border
    val ctrl by AnalyzerScreenModule.instance<AnalyzerScreenController>()

    Column(
        modifier = Modifier
            .width(260.dp)
            .fillMaxHeight()
            .background(ColorSchemaProvider.current.background)
            .drawBehind {
                drawRect(
                    color = border,
                    size = Size(width = 1F, height = size.height),
                    topLeft = Offset(x = size.width, y = 0F)
                )
            }
            .padding(horizontal = 16.dp)
    ) {
        LeftMenuTitleBar()

        DefaultTextField(
            value = ctrl.searchField,
            onValueChange = ctrl::updateSearchField,
            icon = "search.svg",
            placeholder = "Pesquisar...",
            modifier = Modifier.padding(vertical = 10.dp)
        )
    }
}