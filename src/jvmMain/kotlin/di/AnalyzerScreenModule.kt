package di

import org.kodein.di.DI
import org.kodein.di.bindSingleton
import ui.controller.AnalyzerScreenController

val AnalyzerScreenModule = DI {
    bindSingleton { AnalyzerScreenController() }
}