package com.cleanarchitecturesample.feature_clean_sample.presentation.login;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u00108\u001a\u000209H\u0002J\u000e\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<J\u0006\u0010=\u001a\u000209J\u000e\u0010>\u001a\u0002092\u0006\u0010;\u001a\u00020<R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u0018\u0010\fR!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000e\u001a\u0004\b\u001b\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u000e\u001a\u0004\b$\u0010\fR!\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010\u000e\u001a\u0004\b\'\u0010\u0012R!\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u000e\u001a\u0004\b+\u0010\fR!\u0010-\u001a\b\u0012\u0004\u0012\u00020*0\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\u000e\u001a\u0004\b.\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u00101\u001a\b\u0012\u0004\u0012\u00020\b0\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\u000e\u001a\u0004\b2\u0010\fR!\u00104\u001a\b\u0012\u0004\u0012\u00020\b0\u00108FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\u000e\u001a\u0004\b5\u0010\u0012R\u001c\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/presentation/login/LoginViewModel;", "Lcom/cleanarchitecturesample/feature_clean_sample/core/viewmodel/BaseViewModel;", "loginUseCase", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/use_cases/LoginUseCase;", "formValidation", "Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/FormValidation;", "(Lcom/cleanarchitecturesample/feature_clean_sample/domain/use_cases/LoginUseCase;Lcom/cleanarchitecturesample/feature_clean_sample/presentation/util/FormValidation;)V", "email", "", "emailErrorLive", "Landroidx/lifecycle/MutableLiveData;", "getEmailErrorLive", "()Landroidx/lifecycle/MutableLiveData;", "emailErrorLive$delegate", "Lkotlin/Lazy;", "emailErrorLiveData", "Landroidx/lifecycle/LiveData;", "getEmailErrorLiveData", "()Landroidx/lifecycle/LiveData;", "emailErrorLiveData$delegate", "emailValidationPair", "Lkotlin/Pair;", "", "enableLoginLive", "getEnableLoginLive", "enableLoginLive$delegate", "enableLoginLiveData", "getEnableLoginLiveData", "enableLoginLiveData$delegate", "isValidEmail", "()Z", "setValidEmail", "(Z)V", "isValidPassword", "setValidPassword", "loginErrorLive", "getLoginErrorLive", "loginErrorLive$delegate", "loginErrorLiveData", "getLoginErrorLiveData", "loginErrorLiveData$delegate", "loginLive", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "getLoginLive", "loginLive$delegate", "loginLiveData", "getLoginLiveData", "loginLiveData$delegate", "password", "passwordErrorLive", "getPasswordErrorLive", "passwordErrorLive$delegate", "passwordErrorLiveData", "getPasswordErrorLiveData", "passwordErrorLiveData$delegate", "passwordValidationPair", "enableLogin", "", "onEmailTextChange", "text", "", "onLogin", "onPasswordTextChange", "app_debug"})
public final class LoginViewModel extends com.cleanarchitecturesample.feature_clean_sample.core.viewmodel.BaseViewModel {
    private final com.cleanarchitecturesample.feature_clean_sample.domain.use_cases.LoginUseCase loginUseCase = null;
    private final com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation formValidation = null;
    private java.lang.String email = "";
    private java.lang.String password = "";
    private boolean isValidEmail = false;
    private boolean isValidPassword = false;
    private kotlin.Pair<java.lang.Boolean, java.lang.String> emailValidationPair;
    private kotlin.Pair<java.lang.Boolean, java.lang.String> passwordValidationPair;
    private final kotlin.Lazy emailErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy emailErrorLiveData$delegate = null;
    private final kotlin.Lazy passwordErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy passwordErrorLiveData$delegate = null;
    private final kotlin.Lazy enableLoginLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy enableLoginLiveData$delegate = null;
    private final kotlin.Lazy loginLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loginLiveData$delegate = null;
    private final kotlin.Lazy loginErrorLive$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy loginErrorLiveData$delegate = null;
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.use_cases.LoginUseCase loginUseCase, @org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation formValidation) {
        super();
    }
    
    public final boolean isValidEmail() {
        return false;
    }
    
    public final void setValidEmail(boolean p0) {
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
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getPasswordErrorLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPasswordErrorLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEnableLoginLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEnableLoginLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> getLoginLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> getLoginLiveData() {
        return null;
    }
    
    private final androidx.lifecycle.MutableLiveData<java.lang.String> getLoginErrorLive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getLoginErrorLiveData() {
        return null;
    }
    
    public final void onLogin() {
    }
    
    /**
     * *
     * onEmailTextChange validate the email address
     */
    public final void onEmailTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * onPasswordTextChange validate the password
     */
    public final void onPasswordTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    /**
     * *
     *  if isValidEmail and isValidPassword will true then loginBtn will enable
     */
    private final void enableLogin() {
    }
}