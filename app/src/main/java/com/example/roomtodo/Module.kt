package com.example.roomtodo

import android.content.Context
import androidx.compose.runtime.internal.composableLambdaInstance
import androidx.room.Room
import androidx.room.RoomDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@dagger.Module
@InstallIn(SingletonComponent::class)
class Module {
    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(context, AppDatabase::class.java, "task_database").build()

    @Singleton
    @Provides
    fun provideDao(db: AppDatabase) = db.taskDao()
}