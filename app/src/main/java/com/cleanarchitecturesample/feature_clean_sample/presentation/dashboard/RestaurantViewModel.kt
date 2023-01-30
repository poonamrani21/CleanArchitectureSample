package com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.cleanarchitecturesample.feature_clean_sample.core.viewmodel.BaseViewModel
import com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.Resource
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.RestaurantRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@HiltViewModel
class RestaurantViewModel @Inject constructor(private val repository: RestaurantRepository) : BaseViewModel() {
    val restaurants = MutableLiveData<Resource<List<Restaurant>>>()
    init { getRestaurants() }
    //Get list of restaurant
    fun getRestaurants() = viewModelScope.launch { repository.getRestaurants().collect { restaurants.value = it } }
}
