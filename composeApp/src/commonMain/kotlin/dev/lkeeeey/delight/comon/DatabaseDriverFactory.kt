package dev.lkeeeey.delight.comon

import app.cash.sqldelight.db.SqlDriver

expect class DatabaseDriverFactory() {

    fun createDriver(): SqlDriver
}