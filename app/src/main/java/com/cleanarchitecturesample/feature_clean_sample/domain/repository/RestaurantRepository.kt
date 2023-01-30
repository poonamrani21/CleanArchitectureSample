package com.cleanarchitecturesample.feature_clean_sample.domain.repository

import com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.Resource
import kotlinx.coroutines.flow.Flow

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
interface RestaurantRepository {
    suspend fun getRestaurants(): Flow<Resource<List<Restaurant>>>
}
