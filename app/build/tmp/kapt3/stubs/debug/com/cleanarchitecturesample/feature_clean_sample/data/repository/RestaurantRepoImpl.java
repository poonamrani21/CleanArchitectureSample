package com.cleanarchitecturesample.feature_clean_sample.data.repository;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r0\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/data/repository/RestaurantRepoImpl;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/RestaurantRepository;", "api", "Lcom/cleanarchitecturesample/feature_clean_sample/data/api/ApiService;", "db", "Lcom/cleanarchitecturesample/feature_clean_sample/data/database/MyDatabase;", "networkHelper", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/NetworkHelper;", "(Lcom/cleanarchitecturesample/feature_clean_sample/data/api/ApiService;Lcom/cleanarchitecturesample/feature_clean_sample/data/database/MyDatabase;Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/NetworkHelper;)V", "restaurantDao", "Lcom/cleanarchitecturesample/feature_clean_sample/data/database/RestaurantDao;", "getRestaurants", "Lkotlinx/coroutines/flow/Flow;", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/Resource;", "", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/Restaurant;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RestaurantRepoImpl implements com.cleanarchitecturesample.feature_clean_sample.domain.repository.RestaurantRepository {
    private final com.cleanarchitecturesample.feature_clean_sample.data.api.ApiService api = null;
    private final com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase db = null;
    private final com.cleanarchitecturesample.feature_clean_sample.presentation.util.NetworkHelper networkHelper = null;
    private final com.cleanarchitecturesample.feature_clean_sample.data.database.RestaurantDao restaurantDao = null;
    
    @javax.inject.Inject()
    public RestaurantRepoImpl(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.data.api.ApiService api, @org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase db, @org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.presentation.util.NetworkHelper networkHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRestaurants(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.cleanarchitecturesample.feature_clean_sample.presentation.util.Resource<java.util.List<com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant>>>> continuation) {
        return null;
    }
}