package com.cleanarchitecturesample.feature_clean_sample.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.cleanarchitecturesample.feature_clean_sample.domain.model.User
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@Dao
interface UserDao {

    //Query to get local db users with email and password
    @Query("SELECT * FROM User where email LIKE :email AND password LIKE :password")
    fun findByEmailAndPassword(email: String, password: String): Single<User>

    //Query to get local db users with email
    @Query("SELECT * FROM User where email LIKE  :email")
    fun findByEmail(email: String): Single<User>

    //Query to get local db users count
    @Query("SELECT COUNT(*) from User")
    fun countUsers(): Observable<Int>

    //Insert user during registration
    @Insert
    fun insertAll(user: User):Maybe<Long>

    //Query to check  user already exist during registration
    @Query("SELECT COUNT(*)  FROM User WHERE email = :emailId")
    fun isDataExist(emailId: String): Maybe<Int>

}