package com.cleanarchitecturesample.feature_clean_sample.data.database;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\'J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0007H\'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0011\u001a\u00020\tH\'\u00a8\u0006\u0012"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/data/database/UserDao;", "", "countUsers", "Lio/reactivex/Observable;", "", "findByEmail", "Lio/reactivex/Single;", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "email", "", "findByEmailAndPassword", "password", "insertAll", "Lio/reactivex/Maybe;", "", "user", "isDataExist", "emailId", "app_debug"})
public abstract interface UserDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM User where email LIKE :email AND password LIKE :password")
    public abstract io.reactivex.Single<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> findByEmailAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM User where email LIKE  :email")
    public abstract io.reactivex.Single<com.cleanarchitecturesample.feature_clean_sample.domain.model.User> findByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*) from User")
    public abstract io.reactivex.Observable<java.lang.Integer> countUsers();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert()
    public abstract io.reactivex.Maybe<java.lang.Long> insertAll(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.model.User user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT COUNT(*)  FROM User WHERE email = :emailId")
    public abstract io.reactivex.Maybe<java.lang.Integer> isDataExist(@org.jetbrains.annotations.NotNull()
    java.lang.String emailId);
}