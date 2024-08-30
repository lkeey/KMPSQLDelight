package dev.lkeeeey.delight.comon

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver

actual class DatabaseDriverFactory actual constructor() {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(
            schema = UsersDatabase.Schema,
            context = MyApplication.applicationContext,
            name = "MyAppSQLDelightDatabase.db"
        )
    }
}
