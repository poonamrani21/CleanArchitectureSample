package com.cleanarchitecturesample.feature_clean_sample.data.api

import com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant
import retrofit2.http.GET

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
interface ApiService {

    @GET("restaurant/random_restaurant?size=20")
    suspend fun getRestaurants(): List<Restaurant>
}
