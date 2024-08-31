package dev.lkeeeey.delight.common

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import dev.lkeeeey.delight.composeApp.database.UsersDatabase

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            schema = UsersDatabase.Schema,
            name = "UsersDatabase.db"
        )
    }
}