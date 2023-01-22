package ui.screens.analyzer

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import theme.ColorSchemaProvider
import theme.TypographyProvider
import ui.components.DefaultButton

@Composable
fun LeftMenuTitleBar() {
    val border = ColorSchemaProvider.current.border

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .drawBehind {
                drawRect(
                    color = border,
                    size = Size(width = size.width, height = 1F),
                    topLeft = Offset(x = 0F, y = size.height)
                )
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text("Analyzer", style = TypographyProvider.current.subtitle)

        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            DefaultButton(
                modifier = Modifier.size(30.dp),
                onClick = {}
            ) {
                Icon(
                    painter = painterResource("plus_circle_dotted.svg"),
                    contentDescription = null,
                    tint = ColorSchemaProvider.current.icon
                )
            }

            DefaultButton(
                modifier = Modifier.size(30.dp),
                onClick = {}
            ) {
                Icon(
                    painter = painterResource("arrow_repeat.svg"),
                    contentDescription = null,
                    tint = ColorSchemaProvider.current.icon
                )
            }
        }
    }
}