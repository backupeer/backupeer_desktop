package ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.jetbrains.skiko.Cursor
import theme.ColorSchemaProvider
import theme.ShapeProvider

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun DefaultButton(
    modifier: Modifier = Modifier,
    normalColor: Color = Color.Transparent,
    hoverColor: Color = ColorSchemaProvider.current.hover,
    selectedColor: Color = ColorSchemaProvider.current.primary,
    defaultSpacing: Dp = 4.dp,
    isSelected: Boolean = false,
    cursor: Int = Cursor.HAND_CURSOR,
    shape: RoundedCornerShape = ShapeProvider.current.default,
    onClick: () -> Unit,
    content: @Composable (RowScope.(isHovering: Boolean) -> Unit)
) {
    var isHovering by remember { mutableStateOf(false) }

    var backgroundColor = if (isSelected) {
        selectedColor
    } else {
        if (isHovering) {
            hoverColor
        } else {
            normalColor
        }
    }

    Row(
        modifier = modifier
            .clip(shape)
            .background(backgroundColor)
            .onPointerEvent(PointerEventType.Enter) { isHovering = true }
            .onPointerEvent(PointerEventType.Exit) { isHovering = false }
            .pointerHoverIcon(PointerIcon(Cursor(cursor)))
            .clickable(interactionSource = MutableInteractionSource(), indication = null, onClick = onClick),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(defaultSpacing, Alignment.CenterHorizontally)
    ) {
        content(isHovering)
    }
}