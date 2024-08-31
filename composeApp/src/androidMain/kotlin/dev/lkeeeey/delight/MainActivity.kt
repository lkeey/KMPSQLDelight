package dev.lkeeeey.delight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import dev.lkeeeey.delight.common.DatabaseDriverFactory
import dev.lkeeeey.delight.composeApp.database.UsersDatabase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val database = UsersDatabase(DatabaseDriverFactory(LocalContext.current).createDriver())
            App(database)
        }
    }
}
