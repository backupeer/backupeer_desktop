package ui.components

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import theme.DarkColorSchema
import theme.LightColorSchema
import theme.Theme

val defaultColor = if (Theme.isDark) DarkColorSchema().border else LightColorSchema().border

fun Modifier.defaultDrawLine(color: Color = defaultColor, size: Size, topLeft: Offset) = this.then(
    drawBehind {
        drawRect(
            color = color,
            size = size,
            topLeft = topLeft
        )
    }
)