package com.ambient.simpleui.screens.home.data.repository

import android.content.Context
import com.ambient.simpleui.data.db.AppDB
import com.ambient.simpleui.screens.home.data.dao.PlacesDao
import com.ambient.simpleui.screens.home.data.entity.PlacesEntity
import kotlinx.coroutines.flow.Flow

class PlacesRepository(context: Context) {

    private val database: AppDB = AppDB.getInstance(context)
    private val dao: PlacesDao = database.getPlacesDao()

    fun getPlaces(): Flow<List<PlacesEntity>> {
        return dao.getPlaces()
    }

    fun insertPlaces(placesList: List<PlacesEntity>) {
        dao.insertPlaces(placesList)
    }
}