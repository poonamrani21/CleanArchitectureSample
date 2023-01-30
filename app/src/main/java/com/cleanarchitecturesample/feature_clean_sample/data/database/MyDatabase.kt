package com.cleanarchitecturesample.feature_clean_sample.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant
import com.cleanarchitecturesample.feature_clean_sample.domain.model.User

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@Database(entities = [User::class, Restaurant::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    //Get users from local db
    abstract fun getUserDao(): UserDao
    // get restaurant list from local db
    abstract fun restaurantDao(): RestaurantDao

}