package com.example.roomtodo

import androidx.room.Entity
import androidx.room.PrimaryKey

class Task {
    @Entity
    data class Task(
        @PrimaryKey(autoGenerate = true) val id: Int = 0,
        var title: String,
        var description: String,
    )
}