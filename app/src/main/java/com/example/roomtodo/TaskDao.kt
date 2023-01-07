package com.example.roomtodo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

class TaskDao {
    @Dao
    interface TaskDao {
        @Insert
        // suspendを付けることで非同期ワンショットクエリにする
        suspend fun insertTask(task: Task)

        @Query("SELECT * FROM Task")
        // Flow(coroutine)にすることでオブザーバブルクエリにする
        fun loadAllTasks(): Flow<List<Task>>

        @Update
        suspend fun updateTask(task: Task)

        @Delete
        suspend fun deleteTask(task: Task)
    }
}