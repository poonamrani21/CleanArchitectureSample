package com.cleanarchitecturesample.feature_clean_sample.domain.repository

import com.cleanarchitecturesample.feature_clean_sample.domain.model.User
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
interface UserRepository {
    fun getUserFindByEmailAndPassword(email: String, password: String):Single<User>
    fun getUserFindByEmail(email: String):Single<User>
    fun getUsersCount():Observable<Int>
    fun insertUser(user: User): Maybe<Long>
    fun isDataExist(emailID: String): Maybe<Int>
}