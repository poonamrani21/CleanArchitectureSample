package com.cleanarchitecturesample.feature_clean_sample.di;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\fH\u0007J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\nH\u0007\u00a8\u0006\""}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/di/AppModule;", "", "()V", "provideBaseUrl", "", "provideFormValidation", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/FormValidation;", "provideHttpLogging", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideNetworkHelper", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/NetworkHelper;", "context", "Landroid/content/Context;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "httpLoggingInterceptor", "provideRegisterRepository", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/UserRepository;", "database", "Lcom/cleanarchitecturesample/feature_clean_sample/data/database/MyDatabase;", "provideRepository", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/RestaurantRepository;", "service", "Lcom/cleanarchitecturesample/feature_clean_sample/data/api/ApiService;", "networkHelper", "provideRestaurantApi", "retrofit", "Lretrofit2/Retrofit;", "provideRetrofit", "client", "baseUrl", "moshi", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.cleanarchitecturesample.feature_clean_sample.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    com.squareup.moshi.Moshi moshi) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLogging() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor httpLoggingInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.cleanarchitecturesample.feature_clean_sample.domain.repository.RestaurantRepository provideRepository(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.data.api.ApiService service, @org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase database, @org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.presentation.util.NetworkHelper networkHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository provideRegisterRepository(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation provideFormValidation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.cleanarchitecturesample.feature_clean_sample.presentation.util.NetworkHelper provideNetworkHelper(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.squareup.moshi.Moshi provideMoshi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.cleanarchitecturesample.feature_clean_sample.data.api.ApiService provideRestaurantApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}