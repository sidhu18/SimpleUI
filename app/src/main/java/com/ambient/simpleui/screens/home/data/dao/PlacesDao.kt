package com.ambient.simpleui.screens.home.data.dao

import androidx.room.*
import com.ambient.simpleui.screens.home.data.entity.PlacesEntity
import com.ambient.simpleui.screens.home.data.models.Places
import kotlinx.coroutines.flow.Flow

@Dao
interface PlacesDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPlace(place: PlacesEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPlaces(placesList: List<PlacesEntity>)

    @Update
    fun updatePlace(place: PlacesEntity)

    @Delete
    fun deletePlace(place: PlacesEntity)

    @Query("SELECT * FROM ${PlacesEntity.TABLE_NAME}")
    fun getPlaces(): Flow<List<PlacesEntity>>

    @Query("SELECT * FROM ${PlacesEntity.TABLE_NAME} WHERE id = :id")
    fun getPlace(id: Int): Flow<PlacesEntity>
}