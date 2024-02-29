package com.example.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.Task.taskList
import com.example.todolist.taskmanager.components.HeaderProfile
import com.example.todolist.taskmanager.components.Tasks
import com.example.todolist.taskmanager.components.WelcomeMessage
import com.example.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoListTheme {
                LazyColumn(
                    contentPadding = PaddingValues(
                        start = 16.dp,
                        top = 16.dp,
                        bottom = 16.dp
                    )
                ) {
                    item {
                        HeaderProfile()
                    }

                    item {
                        Spacer(modifier = Modifier.height(30.dp))

                        WelcomeMessage()

                        Spacer(modifier = Modifier.height(30.dp))
                    }

                    items(taskList) { task ->
                        Tasks(task = task)

                        Spacer(modifier = Modifier.height(30.dp))
                    }
                }
            }
        }
    }
}
