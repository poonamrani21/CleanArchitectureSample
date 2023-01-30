package com.cleanarchitecturesample.feature_clean_sample.presentation.register;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010L\u001a\u00020MH\u0002J\u000e\u0010N\u001a\u00020M2\u0006\u0010O\u001a\u00020PJ\u000e\u0010Q\u001a\u00020M2\u0006\u0010O\u001a\u00020PJ\u000e\u0010R\u001a\u00020M2\u0006\u0010O\u001a\u00020PJ\u000e\u0010S\u001a\u00020M2\u0006\u0010O\u001a\u00020PJ\u0006\u0010T\u001a\u00020MR!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0017\u0010\u000bR!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\r\u001a\u0004\b\u001a\u0010\u0011R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010%\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R!\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\r\u001a\u0004\b(\u0010\u000bR!\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\r\u001a\u0004\b+\u0010\u0011R\u001c\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010.\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010\r\u001a\u0004\b/\u0010\u000bR!\u00101\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\r\u001a\u0004\b2\u0010\u0011R\u001c\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\r\u001a\u0004\b6\u0010\u000bR!\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\r\u001a\u0004\b9\u0010\u0011R!\u0010;\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\r\u001a\u0004\b<\u0010\u000bR!\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\r\u001a\u0004\b?\u0010\u0011R!\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010\r\u001a\u0004\bC\u0010\u000bR!\u0010E\u001a\b\u0012\u0004\u0012\u00020B0\u000f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010\r\u001a\u0004\bF\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010H\u001a\u00020I\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010K\u00a8\u0006U"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/presentation/register/RegistrationViewModel;", "Lcom/cleanarchitecturesample/feature_clean_sample/core/viewmodel/BaseViewModel;", "registrationUseCase", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/use_cases/RegisterUseCase;", "formValidation", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/FormValidation;", "(Lcom/cleanarchitecturesample/feature_clean_sample/domain/use_cases/RegisterUseCase;Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/FormValidation;)V", "emailErrorLive", "Landroidx/lifecycle/MutableLiveData;", "", "getEmailErrorLive", "()Landroidx/lifecycle/MutableLiveData;", "emailErrorLive$delegate", "Lkotlin/Lazy;", "emailErrorLiveData", "Landroidx/lifecycle/LiveData;", "getEmailErrorLiveData", "()Landroidx/lifecycle/LiveData;", "emailErrorLiveData$delegate", "emailValidationPair", "Lkotlin/Pair;", "", "firstNameErrorLive", "getFirstNameErrorLive", "firstNameErrorLive$delegate", "firstNameErrorLiveData", "getFirstNameErrorLiveData", "firstNameErrorLiveData$delegate", "firstNameValidationPair", "isValidEmail", "()Z", "setValidEmail", "(Z)V", "isValidFirstName", "setValidFirstName", "isValidLastName", "setValidLastName", "isValidPassword", "setValidPassword", "lastNameErrorLive", "getLastNameErrorLive", "lastNameErrorLive$delegate", "lastNameErrorLiveData", "getLastNameErrorLiveData", "lastNameErrorLiveData$delegate", "lastNameValidationPair", "passwordErrorLive", "getPasswordErrorLive", "passwordErrorLive$delegate", "passwordErrorLiveData", "getPasswordErrorLiveData", "passwordErrorLiveData$delegate", "passwordValidationPair", "registerEnableLive", "getRegisterEnableLive", "registerEnableLive$delegate", "registerEnableLiveData", "getRegisterEnableLiveData", "registerEnableLiveData$delegate", "registerErrorLive", "getRegisterErrorLive", "registerErrorLive$delegate", "registerErrorLiveData", "getRegisterErrorLiveData", "registerErrorLiveData$delegate", "registerLive", "", "getRegisterLive", "registerLive$delegate", "registerLiveData", "getRegisterLiveData", "registerLiveData$delegate", "user", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "getUser", "()Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "enableRegistration", "", "onEmailTextChange", "text", "", "onFirstNameTextChange", "onLastNameTextChange", "onPasswordTextChange", "onRegister", "app_debug"})
public final class RegistrationViewModel extends com.cleanarchitecturesample.feature_clean_sample.core.viewmodel.BaseViewModel {
    private final com.cleanarchitecturesample.feature_clean_sample.domain.use_cases.RegisterUseCase registrationUseCase = null;
    private final com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation formValidation = null;
    @org.jetbrains.annotations.NotNull()
    private final com.cleanarchitecturesample.feature_clean_sample.domain.model.User user = null;
    private boolean isValidEmail = false;
    private boolean isValidFirstName = false;
    private boolean isValidLastName = false;
    private boolean isValidPassword = false;
    private kotlin.Pair<java.lang.Boolean, java.lang.String> emailValidationPair;
    private kotlin.Pair<java.lang.Boolean, java.lang.String> firstNameValidationPair;
    private kotlin.Pair<java.lang.Boolean, java.lang.String> lastNameValidationPair;
    private kotlin.Pair<java.lang.Boolean, java.lang.String> passwordValidationPair;
    private final kotlin.Lazy emailErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy emailErrorLiveData$delegate = null;
    private final kotlin.Lazy firstNameErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy firstNameErrorLiveData$delegate = null;
    private final kotlin.Lazy lastNameErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy lastNameErrorLiveData$delegate = null;
    private final kotlin.Lazy passwordErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy passwordErrorLiveData$delegate = null;
    private final kotlin.Lazy registerEnableLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registerEnableLiveData$delegate = null;
    private final kotlin.Lazy registerLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registerLiveData$delegate = null;
    private final kotlin.Lazy registerErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy registerErrorLiveData$delegate = null;
    
    @javax.inject.Inject()
    public RegistrationViewModel(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.use_cases.RegisterUseCase registrationUseCase, @org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation formValidation) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.cleanarchitecturesample.feature_clean_sample.domain.model.User getUser() {
        return null;
    }
    
    public final boolean isValidEmail() {
        return false;
    }
    
    public final void setValidEmail(boolean p0) {
    }
    
    public final boolean isValidFirstName() {
        return false;
    }
    
    public final void setValidFirstName(boolean p0) {
    }
    
    public final boolean isValidLastName() {
        return false;
    }
    
    public final void setValidLastName(boolean p0) {
    }
    
    public final boolean isValidPassword() {
        return false;
    }
    
    public final void setValidPassword(boolean p0) {
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getEmailErrorLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getEmailErrorLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getFirstNameErrorLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getFirstNameErrorLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getLastNameErrorLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getLastNameErrorLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getPasswordErrorLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPasswordErrorLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRegisterEnableLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getRegisterEnableLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> getRegisterLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Long> getRegisterLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getRegisterErrorLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getRegisterErrorLiveData() {
        return null;
    }
    
    /**
     * *
     * @onEmailTextChange will validate the password. If validate true then isValidEmail will true
     */
    public final void onEmailTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * *
     * @onFirstNameTextChange will validate the password. If validate true then isValidFirstName will true
     */
    public final void onFirstNameTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * *
     * @onLastNameTextChange will validate the password. If validate true then isValidLastName will true
     */
    public final void onLastNameTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * *
     * @onPasswordTextChange will validate the password. If validate true then isValidPassword will true
     */
    public final void onPasswordTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * *
     * if isValidEmail, isValidFirstName, isValidLastName and isValidPassword will true then "Register" button will enable
     */
    private final void enableRegistration() {
    }
    
    /**
     * *
     *  @onRegister function call [registration] function of [RegisterUseCase] class to register user in local DB.
     */
    public final void onRegister() {
    }
}