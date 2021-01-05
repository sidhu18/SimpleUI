package com.ambient.simpleui.screens.home.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = PlacesEntity.TABLE_NAME)
data class PlacesEntity(
    @PrimaryKey
    private val id: Int,
    private val name: String,
    private val country: String,
    private val description: String,
) {
    companion object {
        const val TABLE_NAME = "places_table"
    }
}