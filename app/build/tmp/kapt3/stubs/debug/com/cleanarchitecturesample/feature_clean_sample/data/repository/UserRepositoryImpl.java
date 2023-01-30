package com.cleanarchitecturesample.feature_clean_sample.data.repository;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0016\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/data/repository/UserRepositoryImpl;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/UserRepository;", "db", "Lcom/cleanarchitecturesample/feature_clean_sample/data/database/MyDatabase;", "(Lcom/cleanarchitecturesample/feature_clean_sample/data/database/MyDatabase;)V", "userDao", "Lcom/cleanarchitecturesample/feature_clean_sample/data/database/UserDao;", "getUserFindByEmail", "Lio/reactivex/Single;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "email", "", "getUserFindByEmailAndPassword", "password", "getUsersCount", "Lio/reactivex/Observable;", "", "insertUser", "Lio/reactivex/Maybe;", "", "user", "isDataExist", "emailID", "app_debug"})
public final class UserRepositoryImpl implements com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository {
    private final com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase db = null;
    private final com.cleanarchitecturesample.feature_clean_sample.data.database.UserDao userDao = null;
    
    @javax.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> getUserFindByEmailAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> getUserFindByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<java.lang.Integer> getUsersCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<java.lang.Long> insertUser(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.model.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Maybe<java.lang.Integer> isDataExist(@org.jetbrains.annotations.NotNull()
    java.lang.String emailID) {
        return null;
    }
}