package com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/presentation/dashboard/RestaurantViewModel;", "Lcom/cleanarchitecturesample/feature_clean_sample/core/viewmodel/BaseViewModel;", "repository", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/RestaurantRepository;", "(Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/RestaurantRepository;)V", "restaurants", "Landroidx/lifecycle/MutableLiveData;", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/Resource;", "", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/Restaurant;", "getRestaurants", "()Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class RestaurantViewModel extends com.cleanarchitecturesample.feature_clean_sample.core.viewmodel.BaseViewModel {
    private final com.cleanarchitecturesample.feature_clean_sample.domain.repository.RestaurantRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.cleanarchitecturesample.feature_clean_sample.presentation.util.Resource<java.util.List<com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant>>> restaurants = null;
    
    @javax.inject.Inject()
    public RestaurantViewModel(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.repository.RestaurantRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.cleanarchitecturesample.feature_clean_sample.presentation.util.Resource<java.util.List<com.cleanarchitecturesample.feature_clean_sample.domain.model.Restaurant>>> getRestaurants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getRestaurants() {
        return null;
    }
}