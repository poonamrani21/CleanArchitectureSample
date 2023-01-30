// Generated by Dagger (https://dagger.dev).
package com.cleanarchitecturesample.feature_clean_sample.di;

import com.cleanarchitecturesample.feature_clean_sample.data.database.MyDatabase;
import com.cleanarchitecturesample.feature_clean_sample.domain.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRegisterRepositoryFactory implements Factory<UserRepository> {
  private final Provider<MyDatabase> databaseProvider;

  public AppModule_ProvideRegisterRepositoryFactory(Provider<MyDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public UserRepository get() {
    return provideRegisterRepository(databaseProvider.get());
  }

  public static AppModule_ProvideRegisterRepositoryFactory create(
      Provider<MyDatabase> databaseProvider) {
    return new AppModule_ProvideRegisterRepositoryFactory(databaseProvider);
  }

  public static UserRepository provideRegisterRepository(MyDatabase database) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRegisterRepository(database));
  }
}