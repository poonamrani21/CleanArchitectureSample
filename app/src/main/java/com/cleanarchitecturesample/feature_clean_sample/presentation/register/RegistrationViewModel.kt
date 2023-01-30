package com.cleanarchitecturesample.feature_clean_sample.presentation.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cleanarchitecturesample.feature_clean_sample.core.viewmodel.BaseViewModel
import com.cleanarchitecturesample.feature_clean_sample.domain.model.User
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation
import com.cleanarchitecturesample.feature_clean_sample.domain.use_cases.RegisterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@HiltViewModel
class RegistrationViewModel @Inject constructor(private val registrationUseCase: RegisterUseCase,private val formValidation:FormValidation) : BaseViewModel(){
    val user = User()
    var isValidEmail = false
    var isValidFirstName = false
    var isValidLastName = false
    var isValidPassword = false

    // Register fields validators start
    private var emailValidationPair:Pair<Boolean,String>? = null
    private var firstNameValidationPair:Pair<Boolean,String>? = null
    private var lastNameValidationPair:Pair<Boolean,String>? = null
    private var passwordValidationPair:Pair<Boolean,String>? = null

    private val emailErrorLive:MutableLiveData<String> by lazy { MutableLiveData() }
    val emailErrorLiveData: LiveData<String> by lazy { emailErrorLive }

    private val firstNameErrorLive:MutableLiveData<String> by lazy { MutableLiveData() }
    val firstNameErrorLiveData: LiveData<String> by lazy { firstNameErrorLive }

    private val lastNameErrorLive:MutableLiveData<String> by lazy { MutableLiveData() }
    val lastNameErrorLiveData: LiveData<String> by lazy { lastNameErrorLive }

    private val passwordErrorLive:MutableLiveData<String> by lazy { MutableLiveData() }
    val passwordErrorLiveData: LiveData<String> by lazy { passwordErrorLive }

    private val registerEnableLive:MutableLiveData<Boolean> by lazy { MutableLiveData() }
    val registerEnableLiveData: LiveData<Boolean> by lazy { registerEnableLive }
    // Register fields validators End

    // Register data holder
    private val registerLive:MutableLiveData<Long> by lazy { MutableLiveData() }
    val registerLiveData: LiveData<Long> by lazy { registerLive }
    // Register error holder
    private val registerErrorLive:MutableLiveData<String> by lazy { MutableLiveData() }
    val registerErrorLiveData: LiveData<String> by lazy { registerErrorLive }

    /***
     * @onEmailTextChange will validate the password. If validate true then isValidEmail will true
     */
    fun onEmailTextChange(text:CharSequence){
        emailValidationPair = formValidation.isValidEmail(text.toString().trim())
        isValidEmail = emailValidationPair?.first?:false
        emailErrorLive.value = emailValidationPair?.second
        enableRegistration()
    }
    /***
     * @onFirstNameTextChange will validate the password. If validate true then isValidFirstName will true
     */
    fun onFirstNameTextChange(text:CharSequence){
        firstNameValidationPair = formValidation.isValidUsername(text.toString().trim())
        isValidFirstName = firstNameValidationPair?.first?:false
        firstNameErrorLive.value = firstNameValidationPair?.second
        enableRegistration()
    }


    /***
     * @onLastNameTextChange will validate the password. If validate true then isValidLastName will true
     */
    fun onLastNameTextChange(text:CharSequence){
        lastNameValidationPair = formValidation.isValidUsername(text.toString().trim())
        isValidLastName = lastNameValidationPair?.first?:false
        lastNameErrorLive.value = lastNameValidationPair?.second
        enableRegistration()
    }

    /***
     * @onPasswordTextChange will validate the password. If validate true then isValidPassword will true
     */
    fun onPasswordTextChange(text:CharSequence){
        passwordValidationPair = formValidation.isValidPassword(text.toString().trim())
        isValidPassword = passwordValidationPair?.first?:false
        passwordErrorLive.value = passwordValidationPair?.second
        enableRegistration()
    }

    /***
     * if isValidEmail, isValidFirstName, isValidLastName and isValidPassword will true then "Register" button will enable
     */
    private fun enableRegistration(){
        registerEnableLive.value = isValidEmail && isValidFirstName && isValidLastName && isValidPassword
    }

    /***
     *  @onRegister function call [registration] function of [RegisterUseCase] class to register user in local DB.
     */
    fun onRegister(){
        compositeDisposable.add(registrationUseCase.registration(user)
            .subscribe({ registerLive.value = it },{ registerErrorLive.value = it.message }))
    }
}