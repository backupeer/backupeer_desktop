package theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf

val ColorSchemaProvider = compositionLocalOf<ColorSchema> { LightColorSchema() }
val TypographyProvider = compositionLocalOf<Typography> { Typography() }
val ShapeProvider = compositionLocalOf<Shape> { Shape() }

@Composable
fun BackupeerTheme(colors: ColorSchema, typography: Typography, shape: Shape, content: @Composable () -> Unit) {
    CompositionLocalProvider(
        ColorSchemaProvider provides colors,
        TypographyProvider provides typography,
        ShapeProvider provides shape,
        content = content
    )
}