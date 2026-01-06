package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TaskItemScreen() {

    // TODO 1: Create a mutable state to hold completion status (Boolean)
    // Initial value should be false
private val_tasks = mutableStateOf<List<Task>>(emptyList())
    val tasks: State<List<Task>> = _tasks

    init {
        loadSampleTasks()

    }
    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Submit Final Project",
            style = MaterialTheme.typography.titleLarge
        )

        // TODO 2: Show text "Completed" or "Not Completed"
        // depending on completion state


        Button(

                // TODO 3: Toggle completion state
            onClick = { navController.popBackStack()},
            Text("back to list")
            }
        ) {
            Text("Change Status")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskItemPreview() {
    // TODO: Call TaskItemScreen
    fun getTaskById(id: Int?): Task?{
        return _tasks.value.find { it.id == id}

    }
}

