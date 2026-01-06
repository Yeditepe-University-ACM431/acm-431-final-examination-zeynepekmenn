package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
private val_recipes = mutableStateOf<List<Task>>(emptyList())
val task: State<List<Task>> = _tasks
    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        task_taskList = task.isCompleted()
    }
}
