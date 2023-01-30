package com.cleanarchitecturesample.feature_clean_sample.domain.use_cases;

import java.lang.System;

/**
 * *
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/cleanarchitecturesample/feature_clean_sample/domain/use_cases/RegisterUseCase;", "", "repository", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/UserRepository;", "(Lcom/cleanarchitecturesample/feature_clean_sample/domain/repository/UserRepository;)V", "registration", "Lio/reactivex/Maybe;", "", "user", "Lcom/cleanarchitecturesample/feature_clean_sample/domain/model/User;", "app_debug"})
public final class RegisterUseCase {
    private final com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository repository = null;
    
    @javax.inject.Inject()
    public RegisterUseCase(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository repository) {
        super();
    }
    
    /**
     * *
     * registration function use the [User] model object to store data in local DB if not exists.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.lang.Long> registration(@org.jetbrains.annotations.NotNull()
    com.cleanarchitecturesample.feature_clean_sample.domain.model.User user) {
        return null;
    }
}