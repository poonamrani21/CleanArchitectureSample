package com.cleanarchitecturesample.feature_clean_sample.data.database;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@androidx.room.Database(entities = {com.cleanarchitecturesample.feature_clean_sample.domain.model.User.class, com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/data/database/MyDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getUserDao", "Lcom/cleanarchitecturesample/feature_clean_sample/data/database/UserDao;", "restaurantDao", "Lcom/cleanarchitecturesample/feature_clean_sample/data/database/RestaurantDao;", "app_debug"})
public abstract class MyDatabase extends androidx.room.RoomDatabase {
    
    public MyDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cleanarchitecturesample.feature_clean_sample.data.database.UserDao getUserDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.cleanarchitecturesample.feature_clean_sample.data.database.RestaurantDao restaurantDao();
}