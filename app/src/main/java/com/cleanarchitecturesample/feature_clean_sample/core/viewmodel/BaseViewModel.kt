package com.cleanarchitecturesample.feature_clean_sample.core.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
open class BaseViewModel : ViewModel() {
    val compositeDisposable = CompositeDisposable()
    private val loading:MutableLiveData<Boolean> by lazy { MutableLiveData() }
    val loadingLiveData:LiveData<Boolean> by lazy { loading }
    /**
     * This method will be called when this ViewModel is no longer used and will be destroyed.
     */
    override fun onCleared() {
        /**
         * Atomically clears the container, then disposes all the previously contained Disposables.
         */
        compositeDisposable.clear()
        super.onCleared()
    }
}