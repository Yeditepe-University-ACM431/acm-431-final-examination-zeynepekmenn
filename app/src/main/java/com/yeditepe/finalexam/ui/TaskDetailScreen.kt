package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskDetailScreen(title: String) {

    Column(modifier = Modifier.padding(16.dp)) {
        // TODO 4: Display task title
        Text(
            text = it.title,
            fontSize = 20.sp
                    fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        )
    }
}
