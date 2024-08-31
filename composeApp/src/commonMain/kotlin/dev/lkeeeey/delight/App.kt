package dev.lkeeeey.delight

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.lkeeeey.delight.composeApp.database.UsersDatabase
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import kmpsqldelight.composeapp.generated.resources.Res
import kmpsqldelight.composeapp.generated.resources.compose_multiplatform
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.supervisorScope

@Composable
@Preview
fun App(
    database: UsersDatabase
) {

//    val listOfNames = database.userDatabaseQueries.selectAll()
//        .asFlow()
//        .mapToList(Dispatchers.IO)
//        .map { listEntity ->
//            supervisorScope {
//                listEntity.map {
//                    it
//                }
//            }
//        }.collectAsState(emptyList())
//
//    MaterialTheme {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.SpaceEvenly
//        ) {
//            LazyColumn(
//                modifier = Modifier.fillMaxWidth().weight(0.5f),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.spacedBy(12.dp)
//            ) {
//                item {
//                    Text(
//                        text = "Names",
//                        style = MaterialTheme.typography.h3
//                    )
//                }
//                items(listOfNames.value) { name ->
//                    Card(
//                        modifier = Modifier.fillMaxWidth(),
//                        shape = RoundedCornerShape(25.dp)
//                    ) {
//                        Text(
//                            text = "name - $name",
//                        )
//                    }
//                }
//            }
//
//            TextField(
//                modifier = Modifier.fillMaxWidth().padding(12.dp),
//                value = fullName,
//                onValueChange = {
//                    fullName = it
//                },
//                keyboardOptions = KeyboardOptions(
//                    imeAction = ImeAction.Done
//                ),
//                keyboardActions = KeyboardActions(
//                    onDone = {
//                        database.personDatabaseQueries.insert(fullName)
//                        fullName = ""
//                    }
//                ),
//                trailingIcon = {
//                    Icon(
//                        Icons.Default.Add,
//                        null
//                    )
//                }
//            )
//
//        }
//    }
}