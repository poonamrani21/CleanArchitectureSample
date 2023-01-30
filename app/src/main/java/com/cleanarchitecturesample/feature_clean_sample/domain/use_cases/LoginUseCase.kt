package com.cleanarchitecturesample.feature_clean_sample.domain.use_cases

import com.cleanarchitecturesample.feature_clean_sample.domain.model.User
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
class LoginUseCase @Inject constructor(private val repository: UserRepository) {
    /***
     * @getUserFindByEmailAndPassword function use the email and password for login if exists in local DB.
     */
    fun getUserFindByEmailAndPassword(email:String, password:String): Single<User> {
       val passwordErrorMsg = "Invalid Password."
        return repository.getUserFindByEmail(email)
            .flatMap {
                if(it.password != password){
                    return@flatMap Single.error(Throwable(passwordErrorMsg))
                }else{
                    return@flatMap Single.just(it)
                }
            }
            .onErrorResumeNext{
                if(it.message == passwordErrorMsg) {
                    return@onErrorResumeNext Single.error(it)
                }else{
                    return@onErrorResumeNext Single.error(Throwable("Invalid User. Register First."))
                }
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
    }
}