package com.example.roomtodo

import androidx.room.Entity
import androidx.room.PrimaryKey

class Todo {
    @Entity
    data class Todo(
        @PrimaryKey(autoGenerate = true)
        val title: String,
        val id: Int,
        val description: String,
    )
}