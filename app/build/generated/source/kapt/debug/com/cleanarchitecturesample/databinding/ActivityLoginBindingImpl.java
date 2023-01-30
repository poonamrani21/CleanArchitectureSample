package com.cleanarchitecturesample.databinding;
import com.cleanarchitecturesample.R;
import com.cleanarchitecturesample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityLoginBindingImpl extends ActivityLoginBinding implements com.cleanarchitecturesample.generated.callback.OnTextChanged.Listener, com.cleanarchitecturesample.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.sign_up_btn, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.button.MaterialButton) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textview.MaterialTextView) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            );
        this.loginBtn.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.passwordLayout.setTag(null);
        this.usernameLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.cleanarchitecturesample.generated.callback.OnTextChanged(this, 2);
        mCallback8 = new com.cleanarchitecturesample.generated.callback.OnClickListener(this, 3);
        mCallback6 = new com.cleanarchitecturesample.generated.callback.OnTextChanged(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.loginViewModel == variableId) {
            setLoginViewModel((com.cleanarchitecturesample.feature_clean_sample.presentation.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoginViewModel(@Nullable com.cleanarchitecturesample.feature_clean_sample.presentation.login.LoginViewModel LoginViewModel) {
        this.mLoginViewModel = LoginViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.loginViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        boolean loginViewModelIsValidEmail = false;
        boolean loginViewModelIsValidPassword = false;
        boolean LoginViewModelIsValidPassword1 = false;
        com.cleanarchitecturesample.feature_clean_sample.presentation.login.LoginViewModel loginViewModel = mLoginViewModel;
        boolean LoginViewModelIsValidEmail1 = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (loginViewModel != null) {
                    // read loginViewModel.isValidEmail
                    loginViewModelIsValidEmail = loginViewModel.isValidEmail();
                    // read loginViewModel.isValidPassword
                    LoginViewModelIsValidPassword1 = loginViewModel.isValidPassword();
                }


                // read !loginViewModel.isValidEmail
                LoginViewModelIsValidEmail1 = !loginViewModelIsValidEmail;
                // read !loginViewModel.isValidPassword
                loginViewModelIsValidPassword = !LoginViewModelIsValidPassword1;
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.loginBtn.setOnClickListener(mCallback8);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback6, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback7, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.passwordLayout.setErrorEnabled(loginViewModelIsValidPassword);
            this.usernameLayout.setErrorEnabled(LoginViewModelIsValidEmail1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // loginViewModel != null
                boolean loginViewModelJavaLangObjectNull = false;
                // loginViewModel
                com.cleanarchitecturesample.feature_clean_sample.presentation.login.LoginViewModel loginViewModel = mLoginViewModel;



                loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
                if (loginViewModelJavaLangObjectNull) {



                    loginViewModel.onPasswordTextChange(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // loginViewModel != null
                boolean loginViewModelJavaLangObjectNull = false;
                // loginViewModel
                com.cleanarchitecturesample.feature_clean_sample.presentation.login.LoginViewModel loginViewModel = mLoginViewModel;



                loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
                if (loginViewModelJavaLangObjectNull) {



                    loginViewModel.onEmailTextChange(callbackArg_0);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // loginViewModel != null
        boolean loginViewModelJavaLangObjectNull = false;
        // loginViewModel
        com.cleanarchitecturesample.feature_clean_sample.presentation.login.LoginViewModel loginViewModel = mLoginViewModel;



        loginViewModelJavaLangObjectNull = (loginViewModel) != (null);
        if (loginViewModelJavaLangObjectNull) {


            loginViewModel.onLogin();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loginViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}