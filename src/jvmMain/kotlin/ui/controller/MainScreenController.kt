package ui.controller

import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

enum class Route(val icon: String) {
    ANALYZER("file_ear_mark.svg"),
    COPIER("file_bar_graph.svg"),
    TRACER("file_type_json.svg"),
    SETTINGS("settings.svg")
}

class MainScreenController {
    val routes = listOf(Route.ANALYZER, Route.COPIER, Route.TRACER, Route.SETTINGS)
    private var _actualRoute by mutableStateOf(Route.ANALYZER)
    val actualRoute by derivedStateOf { _actualRoute }

    fun toggleRoute(route: Route) {
        if (_actualRoute == route) return
        _actualRoute = route
    }
}