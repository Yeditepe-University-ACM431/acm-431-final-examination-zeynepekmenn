package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
         composable ("tasks_list") {
            TaskListScreen(navController, viewModel)
        }

        }


        // TODO 2: Add composable for "taskDetail/{title}"
         composable(
        route = "task_detail/{recipeId}",
        arguments = listOf(navArgument("taskId"){ type = NavType.IntType})
    ){ backStackEntry ->
        val taskId = backStackEntry.arguments?.getInt("taskId")
        TaskDetailScreen(navController,viewModel,taskId)
    }
}
