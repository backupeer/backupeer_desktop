package ui.controller

import androidx.compose.runtime.*

class AnalyzerScreenController {
    private var _searchField by mutableStateOf("")
    val searchField by derivedStateOf { _searchField }

    fun updateSearchField(value: String) {
        _searchField = value
    }
}