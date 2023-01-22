package theme

import androidx.compose.ui.graphics.Color

abstract class ColorSchema {
    open val primary: Color = Color.Transparent
    open val onPrimary: Color = Color.Transparent
    open val secondary: Color = Color.Transparent
    open val onSecondary: Color = Color.Transparent
    open val accent: Color = Color.Transparent
    open val background: Color = Color.Transparent
    open val surface: Color = Color.Transparent
    open val icon: Color = Color.Transparent
    open val hover: Color = Color.Transparent
    open val border: Color = Color.Transparent
    open val disabled: Color = Color.Transparent
    open val text: Color = Color.Transparent
}

class LightColorSchema : ColorSchema() {
    override val primary: Color = Color(0xFF94a5fb)
    override val onPrimary: Color = Color(0xFF121212)
    override val secondary: Color = Color(0xFFCEE2FB)
    override val onSecondary: Color = Color(0xFF121212)
    override val accent: Color = Color(0xFF0444FC)
    override val background: Color = Color.White
    override val surface: Color = Color(0xFFEEEEEE)
    override val icon: Color = Color(0xFF121212)
    override val hover: Color = Color(0xFFCEE2FB)
    override val border: Color = Color(0xFFA6A6A6)
    override val disabled: Color = Color(0xFFEEEEEE)
    override val text: Color = Color(0xFF121212)
}

//TODO: refactor DarkColorSchema
class DarkColorSchema : ColorSchema() {
    override val primary: Color = Color(0xFF164D8F)
    override val onPrimary: Color = Color(0xFFEEEEEE)
    override val secondary: Color = Color(0xFFCEE2FB)
    override val onSecondary: Color = Color(0xFFEEEEEE)
    override val accent: Color = Color(0xFF012daa)
    override val background: Color = Color(0xFF242424)
    override val surface: Color = Color(0xFF121212)
    override val icon: Color = Color(0xFFEEEEEE)
    override val hover: Color = Color(0x30FFEEEE)
    override val border: Color = Color(0xFF727272)
    override val disabled: Color = Color(0xFF727272)
    override val text: Color = Color(0xFFEEEEEE)
}

