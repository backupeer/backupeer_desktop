package ui.screens.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import di.MainScreenModule
import org.kodein.di.instance
import theme.ColorSchemaProvider
import theme.Shape
import theme.ShapeProvider
import theme.Theme
import ui.components.DefaultButton
import ui.components.defaultDrawLine
import ui.controller.MainScreenController

@Composable
fun Sidebar() {
    val ctrl by MainScreenModule.instance<MainScreenController>()
    val border = ColorSchemaProvider.current.border
    val drawBorder: DrawScope.() -> Unit = {
        drawRect(
            color = border,
            size = Size(width = 30F, height = 1F),
            topLeft = Offset(x = 10F, y = size.height)
        )
    }

    Column(
        modifier = Modifier
            .zIndex(100F)
            .fillMaxHeight()
            .width(50.dp)
            .background(ColorSchemaProvider.current.background)
            .drawBehind {
                drawRect(
                    color = border,
                    size = Size(width = 1F, height = size.height),
                    topLeft = Offset(x = size.width, y = 0F)
                )
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .drawBehind { drawBorder() },
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource("logo.png"),
                contentDescription = null,
                modifier = Modifier.size(30.dp).clip(ShapeProvider.current.default)
            )
        }

        ctrl.routes.forEach { item ->
            DefaultButton(
                modifier = Modifier.padding(top = 10.dp).size(30.dp),
                isSelected = item == ctrl.actualRoute,
                onClick = { ctrl.toggleRoute(item) }
            ) {
                Icon(
                    painter = painterResource(item.icon),
                    contentDescription = null,
                    tint = ColorSchemaProvider.current.icon
                )
            }
        }

        Column(
            modifier = Modifier.weight(1F),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .drawBehind { drawBorder() },
                contentAlignment = Alignment.Center
            ) {
                DefaultButton(
                    modifier = Modifier.size(30.dp),
                    onClick = { Theme.isDark = !Theme.isDark }
                ) {
                    val icon = if (Theme.isDark) "moon_stars.svg" else "brightness_high.svg"

                    Icon(
                        painter = painterResource(icon),
                        contentDescription = null,
                        tint = ColorSchemaProvider.current.icon
                    )
                }
            }

            DefaultButton(
                modifier = Modifier.padding(vertical = 10.dp).size(30.dp),
                onClick = {}
            ) {
                Icon(
                    painter = painterResource("github.svg"),
                    contentDescription = null,
                    tint = ColorSchemaProvider.current.icon
                )
            }
        }

    }
}