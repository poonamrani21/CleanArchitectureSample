package com.cleanarchitecturesample.feature_clean_sample.domain.repository;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\u0006\u0010\u0011\u001a\u00020\u0006H&\u00a8\u0006\u0012"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/UserRepository;", "", "getUserFindByEmail", "Lio/reactivex/Single;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "email", "", "getUserFindByEmailAndPassword", "password", "getUsersCount", "Lio/reactivex/Observable;", "", "insertUser", "Lio/reactivex/Maybe;", "", "user", "isDataExist", "emailID", "app_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> getUserFindByEmailAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> getUserFindByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<java.lang.Integer> getUsersCount();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<java.lang.Long> insertUser(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.model.User user);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Maybe<java.lang.Integer> isDataExist(@org.jetbrains.annotations.NotNull()
    java.lang.String emailID);
}