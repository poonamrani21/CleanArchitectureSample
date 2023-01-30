package com.cleanarchitecturesample.databinding;
import com.cleanarchitecturesample.R;
import com.cleanarchitecturesample.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRegisterBindingImpl extends ActivityRegisterBinding implements com.cleanarchitecturesample.generated.callback.OnTextChanged.Listener, com.cleanarchitecturesample.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback4;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback3;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.email
            //         is user.setEmail((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // user.email
            java.lang.String userEmail = null;
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.cleanarchitecturesample.feature_clean_sample.domain.model.User user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setEmail(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.firstName
            //         is user.setFirstName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user.firstName
            java.lang.String userFirstName = null;
            // user
            com.cleanarchitecturesample.feature_clean_sample.domain.model.User user = mUser;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setFirstName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView6androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.lastName
            //         is user.setLastName((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView6);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.cleanarchitecturesample.feature_clean_sample.domain.model.User user = mUser;
            // user.lastName
            java.lang.String userLastName = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setLastName(((java.lang.String) (callbackArg_0)));
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.password
            //         is user.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // user != null
            boolean userJavaLangObjectNull = false;
            // user
            com.cleanarchitecturesample.feature_clean_sample.domain.model.User user = mUser;
            // user.password
            java.lang.String userPassword = null;



            userJavaLangObjectNull = (user) != (null);
            if (userJavaLangObjectNull) {




                user.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public ActivityRegisterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityRegisterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.textfield.TextInputLayout) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.button.MaterialButton) bindings[9]
            );
        this.emailLayout.setTag(null);
        this.firstNameLayout.setTag(null);
        this.lastNameLayout.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputEditText) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.passwordLayout.setTag(null);
        this.registerBtn.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.cleanarchitecturesample.generated.callback.OnTextChanged(this, 4);
        mCallback2 = new com.cleanarchitecturesample.generated.callback.OnTextChanged(this, 2);
        mCallback5 = new com.cleanarchitecturesample.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.cleanarchitecturesample.generated.callback.OnTextChanged(this, 3);
        mCallback1 = new com.cleanarchitecturesample.generated.callback.OnTextChanged(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.registrationViewModel == variableId) {
            setRegistrationViewModel((com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.cleanarchitecturesample.feature_clean_sample.domain.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRegistrationViewModel(@Nullable com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel RegistrationViewModel) {
        this.mRegistrationViewModel = RegistrationViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.registrationViewModel);
        super.requestRebind();
    }
    public void setUser(@Nullable com.cleanarchitecturesample.feature_clean_sample.domain.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.user);
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
        boolean registrationViewModelIsValidFirstName = false;
        java.lang.String userPassword = null;
        com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel registrationViewModel = mRegistrationViewModel;
        boolean registrationViewModelIsValidPassword = false;
        boolean RegistrationViewModelIsValidFirstName1 = false;
        java.lang.String userEmail = null;
        boolean registrationViewModelIsValidEmail = false;
        boolean registrationViewModelIsValidLastName = false;
        boolean RegistrationViewModelIsValidPassword1 = false;
        java.lang.String userFirstName = null;
        com.cleanarchitecturesample.feature_clean_sample.domain.model.User user = mUser;
        java.lang.String userLastName = null;
        boolean RegistrationViewModelIsValidLastName1 = false;
        boolean RegistrationViewModelIsValidEmail1 = false;

        if ((dirtyFlags & 0x5L) != 0) {



                if (registrationViewModel != null) {
                    // read registrationViewModel.isValidPassword
                    registrationViewModelIsValidPassword = registrationViewModel.isValidPassword();
                    // read registrationViewModel.isValidFirstName
                    RegistrationViewModelIsValidFirstName1 = registrationViewModel.isValidFirstName();
                    // read registrationViewModel.isValidEmail
                    registrationViewModelIsValidEmail = registrationViewModel.isValidEmail();
                    // read registrationViewModel.isValidLastName
                    RegistrationViewModelIsValidLastName1 = registrationViewModel.isValidLastName();
                }


                // read !registrationViewModel.isValidPassword
                RegistrationViewModelIsValidPassword1 = !registrationViewModelIsValidPassword;
                // read !registrationViewModel.isValidFirstName
                registrationViewModelIsValidFirstName = !RegistrationViewModelIsValidFirstName1;
                // read !registrationViewModel.isValidEmail
                RegistrationViewModelIsValidEmail1 = !registrationViewModelIsValidEmail;
                // read !registrationViewModel.isValidLastName
                registrationViewModelIsValidLastName = !RegistrationViewModelIsValidLastName1;
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (user != null) {
                    // read user.password
                    userPassword = user.getPassword();
                    // read user.email
                    userEmail = user.getEmail();
                    // read user.firstName
                    userFirstName = user.getFirstName();
                    // read user.lastName
                    userLastName = user.getLastName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.emailLayout.setErrorEnabled(RegistrationViewModelIsValidEmail1);
            this.firstNameLayout.setErrorEnabled(registrationViewModelIsValidFirstName);
            this.lastNameLayout.setErrorEnabled(registrationViewModelIsValidLastName);
            this.passwordLayout.setErrorEnabled(RegistrationViewModelIsValidPassword1);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, userEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userFirstName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userLastName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, userPassword);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback1, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback2, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView6, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback3, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView6androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, mCallback4, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            this.registerBtn.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // registrationViewModel != null
                boolean registrationViewModelJavaLangObjectNull = false;
                // registrationViewModel
                com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel registrationViewModel = mRegistrationViewModel;



                registrationViewModelJavaLangObjectNull = (registrationViewModel) != (null);
                if (registrationViewModelJavaLangObjectNull) {



                    registrationViewModel.onPasswordTextChange(callbackArg_0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // registrationViewModel != null
                boolean registrationViewModelJavaLangObjectNull = false;
                // registrationViewModel
                com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel registrationViewModel = mRegistrationViewModel;



                registrationViewModelJavaLangObjectNull = (registrationViewModel) != (null);
                if (registrationViewModelJavaLangObjectNull) {



                    registrationViewModel.onFirstNameTextChange(callbackArg_0);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // registrationViewModel != null
                boolean registrationViewModelJavaLangObjectNull = false;
                // registrationViewModel
                com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel registrationViewModel = mRegistrationViewModel;



                registrationViewModelJavaLangObjectNull = (registrationViewModel) != (null);
                if (registrationViewModelJavaLangObjectNull) {



                    registrationViewModel.onLastNameTextChange(callbackArg_0);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // registrationViewModel != null
                boolean registrationViewModelJavaLangObjectNull = false;
                // registrationViewModel
                com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel registrationViewModel = mRegistrationViewModel;



                registrationViewModelJavaLangObjectNull = (registrationViewModel) != (null);
                if (registrationViewModelJavaLangObjectNull) {



                    registrationViewModel.onEmailTextChange(callbackArg_0);
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // registrationViewModel != null
        boolean registrationViewModelJavaLangObjectNull = false;
        // registrationViewModel
        com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel registrationViewModel = mRegistrationViewModel;



        registrationViewModelJavaLangObjectNull = (registrationViewModel) != (null);
        if (registrationViewModelJavaLangObjectNull) {


            registrationViewModel.onRegister();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): registrationViewModel
        flag 1 (0x2L): user
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}