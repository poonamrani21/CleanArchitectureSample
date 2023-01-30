package com.cleanarchitecturesample.feature_clean_sample.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant
import kotlinx.coroutines.flow.Flow

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@Dao

interface RestaurantDao {

    //Query to get restaurants from local
    @Query("SELECT * FROM restaurants")
    fun getAllRestaurants(): Flow<List<Restaurant>>
    //Insert restaurants to local db
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRestaurants(restaurants: List<Restaurant>)
    //Query  to delete restaurants from local db
    @Query("DELETE FROM restaurants")
    suspend fun deleteAllRestaurants()
}
