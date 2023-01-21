package di

import org.kodein.di.DI
import org.kodein.di.bindSingleton
import ui.controller.MainScreenController

val MainScreenModule = DI {
    bindSingleton { MainScreenController() }
}