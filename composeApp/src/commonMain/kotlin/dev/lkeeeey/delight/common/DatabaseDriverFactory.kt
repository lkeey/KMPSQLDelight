package dev.lkeeeey.delight.common

import app.cash.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory() {

    fun createDriver(): SqlDriver
}
