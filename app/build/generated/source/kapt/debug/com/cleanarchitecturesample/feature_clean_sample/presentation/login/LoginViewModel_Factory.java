// Generated by Dagger (https://dagger.dev).
package com.cleanarchitecturesample.feature_clean_sample.presentation.login;

import com.cleanarchitecturesample.feature_clean_sample.domain.use_cases.LoginUseCase;
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.FormValidation;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<LoginUseCase> loginUseCaseProvider;

  private final Provider<FormValidation> formValidationProvider;

  public LoginViewModel_Factory(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<FormValidation> formValidationProvider) {
    this.loginUseCaseProvider = loginUseCaseProvider;
    this.formValidationProvider = formValidationProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(loginUseCaseProvider.get(), formValidationProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<LoginUseCase> loginUseCaseProvider,
      Provider<FormValidation> formValidationProvider) {
    return new LoginViewModel_Factory(loginUseCaseProvider, formValidationProvider);
  }

  public static LoginViewModel newInstance(LoginUseCase loginUseCase,
      FormValidation formValidation) {
    return new LoginViewModel(loginUseCase, formValidation);
  }
}
