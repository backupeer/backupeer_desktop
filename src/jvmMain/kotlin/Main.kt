import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import settings.Settings
import settings.SettingsProvider
import theme.*
import ui.screens.main.MainScreen
import java.awt.Dimension

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Backupeer",
        icon = painterResource("logo.png"),
        state = rememberWindowState(
            placement = WindowPlacement.Floating,
            position = WindowPosition(alignment = Alignment.Center),
            size = DpSize(width = 800.dp, height = 600.dp)
        ),
    ) {
        this.window.minimumSize = Dimension(800, 600)

        //TODO: develop a way to store and read settings
        val defaultSettings = Settings(
            analyzerConfigDirs = mutableListOf("analyzers"),
            copierConfigDirs = mutableListOf("copiers"),
            tracerConfigDirs = mutableListOf("tracers"),
            shortcuts = mutableMapOf()
        )

        CompositionLocalProvider(SettingsProvider provides defaultSettings) {
            val light = LightColorSchema()
            val dark = DarkColorSchema()
            BackupeerTheme(
                colors = if (Theme.isDark) dark else light,
                typography = Typography(fontColor = if (Theme.isDark) dark.text else light.text),
                shape = Shape()
            ) {
                MainScreen()
            }
        }
    }
}
