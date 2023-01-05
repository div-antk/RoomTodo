package com.example.roomtodo

import androidx.room.Database
import androidx.room.RoomDatabase

class AppDatabase {
    @Database(entities = [Task::class], version = 1)
    abstract class AppDatabase : RoomDatabase() {
        abstract fun taskDao(): TaskDao
    }
}