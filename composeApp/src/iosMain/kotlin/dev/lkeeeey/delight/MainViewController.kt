package dev.lkeeeey.delight

import androidx.compose.ui.window.ComposeUIViewController
import dev.lkeeeey.delight.common.DatabaseDriverFactory
import dev.lkeeeey.delight.composeApp.database.UsersDatabase

fun MainViewController() = ComposeUIViewController {
    val database = UsersDatabase(DatabaseDriverFactory().createDriver())
    App(database)
}