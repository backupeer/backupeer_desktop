package theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class Theme {
    companion object {
        var isDark by mutableStateOf(false)
    }
}