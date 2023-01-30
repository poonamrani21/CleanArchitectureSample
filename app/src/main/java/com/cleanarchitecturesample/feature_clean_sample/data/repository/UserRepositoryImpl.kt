package com.cleanarchitecturesample.feature_clean_sample.data.repository

import com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase
import com.cleanarchitecturesample.feature_clean_sample.domain.model.User
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
class UserRepositoryImpl @Inject constructor(private val db: MyDatabase) : UserRepository {
    private val userDao = db.getUserDao()

    // getUserFindByEmail will check if email already exist in local db then user will able to do login
    override fun getUserFindByEmailAndPassword(email: String, password: String): Single<User> {
        return userDao.findByEmailAndPassword(email,password)
    }

    // getUserFindByEmail will check if email already exist in local db then user will able to do login
    override fun getUserFindByEmail(email: String): Single<User> {
        return userDao.findByEmail(email)
    }

    //get total count of user stored in local db
    override fun getUsersCount(): Observable<Int> {
        return userDao.countUsers()
    }

    //insertUser will insert new user in local DB
    override fun insertUser(user: User): Maybe<Long> {
        return userDao.insertAll(user)
    }

    //During sign up this function will check if user already exist in local DB
    override fun isDataExist(emailID: String): Maybe<Int> {
        return userDao.isDataExist(emailID)
    }
}