package dev.lkeeeey.delight.common

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver
import dev.lkeeeey.delight.composeApp.database.UsersDatabase

class DatabaseDriverFactory(
    private val context: Context
) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            schema = UsersDatabase.Schema,
            context = context,
            name = "UsersDatabase.db"
        )
    }
}