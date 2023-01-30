package com.cleanarchitecturesample.feature_clean_sample.domain.use_cases

import com.cleanarchitecturesample.feature_clean_sample.domain.model.User
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository
import io.reactivex.Maybe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
class RegisterUseCase @Inject constructor(private val repository: UserRepository) {
    /***
     * registration function use the [User] model object to store data in local DB if not exists.
     */
    fun registration(user: User): Maybe<Long> {
        return repository.isDataExist(user.email)
            .flatMap{
                if(it==0){
                    return@flatMap repository.insertUser(user)
                }else{
                    return@flatMap Maybe.error(Throwable("'${user.email}' is already exist. Please try another User."))
                }
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }

}