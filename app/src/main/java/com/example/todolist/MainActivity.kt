package com.example.todolist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.example.todolist.Task.taskList
import com.example.todolist.taskmanager.components.HeaderProfile
import com.example.todolist.taskmanager.components.Tasks
import com.example.todolist.taskmanager.components.WelcomeMessage
import com.example.todolist.ui.theme.ToDoListTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoListTheme {
                var selectedIcon by remember {
                    mutableStateOf(1)
                }
                var icons = listOf("Calendar", "Home", "Messages")

                Scaffold(
                    bottomBar = {
                        BottomNavigation(
                            modifier =
                                Modifier
                                    .height(90.dp),
                            backgroundColor = Color.DarkGray,
                            elevation = 0.dp,
                        ) {
                            icons.forEachIndexed { index, _ ->
                                var icon: ImageVector =
                                    when (index) {
                                        0 -> Icons.Filled.CalendarMonth
                                        1 -> Icons.Filled.Home
                                        2 -> Icons.Filled.Mail
                                        else -> Icons.Filled.Home
                                    }
                                BottomNavigationItem(
                                    selected = selectedIcon == index,
                                    onClick = { selectedIcon == index },
                                    icon = {
                                        Box(
                                            modifier =
                                                Modifier
                                                    .size(70.dp)
                                                    .clip(CircleShape)
                                                    .background(
                                                        if (selectedIcon == index) {
                                                            Color.Black
                                                        } else {
                                                            Color.White
                                                        },
                                                    ),
                                            //  contentAlignment = Alignment.Center
                                        ) {
                                            Icon(
                                                imageVector = icon,
                                                contentDescription = "Icons",
                                                modifier =
                                                    Modifier
                                                        .size(40.dp)
                                                        .padding(12.dp),
                                                tint =
                                                    if (selectedIcon == index) {
                                                        Color.White
                                                    } else {
                                                        Color.Black
                                                    },
                                            )
                                        }
                                    },
                                )
                            }
                        }
                    },
                ) {
                    LazyColumn(
                        contentPadding =
                            PaddingValues(
                                start = 16.dp,
                                top = 16.dp,
                                bottom = 16.dp,
                            ),
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
}
