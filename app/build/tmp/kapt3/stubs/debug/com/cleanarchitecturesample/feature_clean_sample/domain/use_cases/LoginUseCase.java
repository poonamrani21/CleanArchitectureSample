package com.cleanarchitecturesample.feature_clean_sample.domain.use_cases;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/domain/use_cases/LoginUseCase;", "", "repository", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/UserRepository;", "(Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/UserRepository;)V", "getUserFindByEmailAndPassword", "Lio/reactivex/Single;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "email", "", "password", "app_debug"})
public final class LoginUseCase {
    private final com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository repository = null;
    
    @javax.inject.Inject()
    public LoginUseCase(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository repository) {
        super();
    }
    
    /**
     * *
     * @getUserFindByEmailAndPassword function use the email and password for login if exists in local DB.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> getUserFindByEmailAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
}