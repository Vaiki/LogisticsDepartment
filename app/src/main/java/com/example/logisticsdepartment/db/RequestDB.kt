package com.example.logisticsdepartment.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Request::class], version = 1, exportSchema = false)
abstract class RequestDB : RoomDatabase() {

    abstract fun requestDao(): RequestDao

    companion object {
        @Volatile
        private var INSTANCE: RequestDB? = null
        fun getInstance(context: Context): RequestDB {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        RequestDB::class.java,
                        "database"
                    ).build()
                }
                return instance
            }
        }
    }
}