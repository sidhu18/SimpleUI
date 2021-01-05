package com.ambient.simpleui.screens.home.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.ambient.simpleui.screens.home.data.entity.PlacesEntity
import com.ambient.simpleui.screens.home.data.repository.PlacesRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: PlacesRepository = PlacesRepository(application)

    private val _placesData = MutableLiveData<List<PlacesEntity>>()

    val placesData: LiveData<List<PlacesEntity>> = _placesData

    init {
        fetchPlacesData()
    }

    private fun fetchPlacesData() {
        viewModelScope.launch {
            val response = repository.getPlaces()
            response.collect {
                _placesData.value = it
            }
        }
    }
}