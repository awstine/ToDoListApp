package com.example.todolist.Task

data class Task(
    val id: Int,
    val title: String,
    val body: String? = null,
    val startTime:String,
    val endTime:String
)

val taskList = listOf(
    Task(
        1,
        "Do laundry",
        "Wash and fold clothes",
        "10:00",
        "11:00"
    ),
    Task(
        2,
        "Go grocery shopping",
        "Buy essentials for the week",
        "12:00",
        "13:00"
    ),
    Task(
        3,
        "Read a book",
        "Relaxing activity",
        "14:00",
        "15:00"
    ),
    Task(
        4,
        "Write report",
        "Work assignment",
        "16:00",
        "17:00"
    ),
    Task(
        5,
        "Exercise",
        "30 minutes of jogging",
        "18:00",
        "18:30"
    ),
    Task(
        6,
        "Cook dinner",
        "Prepare a healthy meal",
        "19:00",
        "20:00"
    ),
    Task(
        7,
        "Watch a movie",
        "Relaxing activity",
        "21:00",
        "23:00"
    ),
    Task(
        8,
        "Sleep",
        "Get a good night's rest",
        "23:00",
        "07:00"
    ),
    Task(
        9,
        "Do laundry",
        "Wash and fold clothes",
        "10:00",
        "11:00"
    ),
    Task(
        10,
        "Go grocery shopping",
        "Buy essentials for the week",
        "12:00",
        "13:00"
    ),
    Task(
        11,
        "Read a book",
        "Relaxing activity",
        "14:00",
        "15:00"
    ),
    Task(
        12,
        "Write report",
        "Work assignment",
        "16:00",
        "17:00"
    ),
    Task(
        13,
        "Exercise",
        "30 minutes of jogging",
        "18:00",
        "18:30"
    ),
)
