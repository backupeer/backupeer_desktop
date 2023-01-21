package settings

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.input.key.KeyShortcut

data class Settings(
    val analyzerConfigDirs: MutableList<String> = mutableListOf(),
    val copierConfigDirs: MutableList<String> = mutableListOf(),
    val tracerConfigDirs: MutableList<String> = mutableListOf(),
    val shortcuts: MutableMap<KeyShortcut, () -> Unit> = mutableMapOf()
)

val SettingsProvider = compositionLocalOf { Settings() }