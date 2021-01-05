package com.ambient.simpleui.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ambient.simpleui.commons.DATABASE_NAME
import com.ambient.simpleui.commons.DATABASE_VERSION
import com.ambient.simpleui.screens.home.data.dao.PlacesDao
import com.ambient.simpleui.screens.home.data.entity.PlacesEntity

@Database(
    entities = [PlacesEntity::class],
    version = DATABASE_VERSION,
    exportSchema = false
)
abstract class AppDB : RoomDatabase() {

    abstract fun getPlacesDao(): PlacesDao

    companion object {

        @Volatile
        private var INSTANCE: AppDB? = null

        fun getInstance(context: Context): AppDB {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDB::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}