package com.cleanarchitecturesample.feature_clean_sample.core.application;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = BaseApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface BaseApplication_GeneratedInjector {
  void injectBaseApplication(BaseApplication baseApplication);
}
