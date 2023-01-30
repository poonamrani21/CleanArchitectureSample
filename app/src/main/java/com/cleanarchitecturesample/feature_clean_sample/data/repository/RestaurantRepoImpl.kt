package com.cleanarchitecturesample.feature_clean_sample.data.repository

import android.util.Log
import androidx.room.withTransaction
import com.cleanarchitecturesample.feature_clean_sample.data.api.ApiService
import com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.RestaurantRepository
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.NetworkHelper
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.networkBoundResource
import javax.inject.Inject

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
class RestaurantRepoImpl @Inject constructor(
    private val api: ApiService,
    private val db: MyDatabase,
    private val networkHelper: NetworkHelper
) : RestaurantRepository {
    private val restaurantDao = db.restaurantDao()

    override suspend fun getRestaurants() = networkBoundResource(
        query = { restaurantDao.getAllRestaurants() },
        fetch = {
           // delay(2000)
            api.getRestaurants()
        },
        // successfully  response received
        saveFetchResult = { restaurants ->
            db.withTransaction {
                restaurantDao.deleteAllRestaurants()
                restaurantDao.insertRestaurants(restaurants)
            }
        },
        //if internet connection  missing
        shouldFetch = {
            networkHelper.isNetworkAvailable()
                      },
        //if any server error or api error caught
        onFetchFailed = {
            it.message?.let { it1 -> Log.e("getRestaurants: ", it1) }
        }
    )
}
