// Generated by data binding compiler. Do not edit!
package com.cleanarchitecturesample.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.cleanarchitecturesample.R;
import com.cleanarchitecturesample.feature_clean_sample.domain.model.User;
import com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRegisterBinding extends ViewDataBinding {
  @NonNull
  public final TextInputLayout emailLayout;

  @NonNull
  public final TextInputLayout firstNameLayout;

  @NonNull
  public final TextInputLayout lastNameLayout;

  @NonNull
  public final TextInputLayout passwordLayout;

  @NonNull
  public final MaterialButton registerBtn;

  @Bindable
  protected RegistrationViewModel mRegistrationViewModel;

  @Bindable
  protected User mUser;

  protected ActivityRegisterBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextInputLayout emailLayout, TextInputLayout firstNameLayout, TextInputLayout lastNameLayout,
      TextInputLayout passwordLayout, MaterialButton registerBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.emailLayout = emailLayout;
    this.firstNameLayout = firstNameLayout;
    this.lastNameLayout = lastNameLayout;
    this.passwordLayout = passwordLayout;
    this.registerBtn = registerBtn;
  }

  public abstract void setRegistrationViewModel(
      @Nullable RegistrationViewModel registrationViewModel);

  @Nullable
  public RegistrationViewModel getRegistrationViewModel() {
    return mRegistrationViewModel;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_register, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRegisterBinding>inflateInternal(inflater, R.layout.activity_register, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_register, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRegisterBinding>inflateInternal(inflater, R.layout.activity_register, null, false, component);
  }

  public static ActivityRegisterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityRegisterBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRegisterBinding)bind(component, view, R.layout.activity_register);
  }
}