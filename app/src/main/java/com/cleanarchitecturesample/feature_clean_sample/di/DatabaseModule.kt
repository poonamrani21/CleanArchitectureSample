package com.cleanarchitecturesample.feature_clean_sample.di

import android.content.Context
import androidx.room.Room
import com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.Constant.MY_DATA_BASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): MyDatabase = Room.databaseBuilder(context, MyDatabase::class.java, MY_DATA_BASE).fallbackToDestructiveMigration().build()
}
