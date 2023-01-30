package com.cleanarchitecturesample.feature_clean_sample.di

import android.content.Context
import com.cleanarchitecturesample.BuildConfig
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.Constant
import com.cleanarchitecturesample.feature_clean_sample.data.api.ApiService
import com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase
import com.cleanarchitecturesample.feature_clean_sample.data.database.UserDao
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.RestaurantRepository
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.NetworkHelper
import com.cleanarchitecturesample.feature_clean_sample.data.repository.RestaurantRepoImpl
import com.cleanarchitecturesample.feature_clean_sample.data.repository.UserRepositoryImpl
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideBaseUrl() = Constant.BASE_URL

    @Provides
    @Singleton
    fun provideRetrofit(
        client: OkHttpClient,
        baseUrl: String,
        moshi: Moshi
    ): Retrofit =
        Retrofit.Builder().apply {
            baseUrl(baseUrl)
            client(client)
            addConverterFactory(MoshiConverterFactory.create(moshi))
        }.build()

    @Provides
    @Singleton
    fun provideHttpLogging() =
        HttpLoggingInterceptor().apply {
            level = when {
                BuildConfig.DEBUG -> HttpLoggingInterceptor.Level.BODY
                else -> HttpLoggingInterceptor.Level.NONE
            }
        }

    @Provides
    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient =
        OkHttpClient.Builder().apply {
            connectTimeout(30, TimeUnit.SECONDS)
            readTimeout(30, TimeUnit.SECONDS)
            addInterceptor(httpLoggingInterceptor)
        }.build()

    @Provides
    @Singleton
    fun provideRepository(service: ApiService, database: MyDatabase, networkHelper: NetworkHelper)
    : RestaurantRepository = RestaurantRepoImpl(service, database, networkHelper)

    @Provides
    @Singleton
    fun provideRegisterRepository(database: MyDatabase)
    : UserRepository= UserRepositoryImpl(database)


    @Provides
    @Singleton
    fun provideFormValidation()=FormValidation()

    @Provides
    @Singleton
    fun provideNetworkHelper(
        @ApplicationContext context: Context
    ): NetworkHelper =
        NetworkHelper(context)

    // Provide Moshi
    @Singleton
    @Provides
    fun provideMoshi(): Moshi =
        Moshi.Builder().apply {
            addLast(KotlinJsonAdapterFactory())
        }.build()

    @Provides
    @Singleton
    fun provideRestaurantApi(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)


}
