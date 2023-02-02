// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import screens.AppScreen

fun main() = application {
    val windowState = rememberWindowState()
    windowState.size = DpSize(1600.dp, 900.dp)
    Window(title = "Релизная  доска", state = windowState, onCloseRequest = ::exitApplication) {
        AppScreen()
    }
}
