package com.cleanarchitecturesample.feature_clean_sample.presentation.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cleanarchitecturesample.feature_clean_sample.core.viewmodel.BaseViewModel
import com.cleanarchitecturesample.feature_clean_sample.domain.model.User
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation
import com.cleanarchitecturesample.feature_clean_sample.domain.use_cases.LoginUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@HiltViewModel
class LoginViewModel @Inject constructor(private val loginUseCase: LoginUseCase,private val formValidation :FormValidation): BaseViewModel() {

    private var email = ""
    private var password = ""

    var isValidEmail = false
    var isValidPassword = false

    // Login fields validators start
    private var emailValidationPair: Pair<Boolean,String>? = null
    private var passwordValidationPair: Pair<Boolean,String>? = null

    private val emailErrorLive : MutableLiveData<String> by lazy { MutableLiveData() }
    val emailErrorLiveData : LiveData<String> by lazy { emailErrorLive }

    private val passwordErrorLive : MutableLiveData<String> by lazy { MutableLiveData() }
    val passwordErrorLiveData : LiveData<String> by lazy { passwordErrorLive }

    private val enableLoginLive : MutableLiveData<Boolean> by lazy { MutableLiveData() }
    val enableLoginLiveData : LiveData<Boolean> by lazy { enableLoginLive }
    // Login fields validators end

    // Login data holder
    private val loginLive : MutableLiveData<User> by lazy { MutableLiveData() }
    val loginLiveData : LiveData<User> by lazy { loginLive }

    // Login error holder
    private val loginErrorLive : MutableLiveData<String> by lazy { MutableLiveData() }
    val loginErrorLiveData : LiveData<String> by lazy { loginErrorLive }

    // onLogin function validate the email password and move to dashboard Activity otherwise error will return
    fun onLogin(){
        if(isValidEmail && isValidPassword){
            compositeDisposable.add(loginUseCase.getUserFindByEmailAndPassword(email,password)
                .subscribe({
                    loginLive.value = it
                },{
                    loginErrorLive.value = it.message
                }))
        }
    }

    /***
     * onEmailTextChange validate the email address
     */
    fun onEmailTextChange(text:CharSequence){
        email = text.toString()
        emailValidationPair = formValidation.isValidEmail(email.trim())
        isValidEmail = emailValidationPair?.first?:false
        emailErrorLive.value = emailValidationPair?.second
        enableLogin()
    }

    /**
     * onPasswordTextChange validate the password
     */
    fun onPasswordTextChange(text:CharSequence){
        password = text.toString()
        passwordValidationPair = formValidation.isValidPassword(password.trim())
        isValidPassword = passwordValidationPair?.first?:false
        passwordErrorLive.value = passwordValidationPair?.second
        enableLogin()
    }

    /***
     *  if isValidEmail and isValidPassword will true then loginBtn will enable
     */
    private fun enableLogin(){
        enableLoginLive.value = isValidEmail && isValidPassword
    }
}