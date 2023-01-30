package com.cleanarchitecturesample.feature_clean_sample.presentation.login

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.cleanarchitecturesample.R
import com.cleanarchitecturesample.databinding.ActivityLoginBinding
import com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard.DashboardActivity
import com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegisterActivity
import com.cleanarchitecturesample.feature_clean_sample.presentation.register.RegistrationViewModel
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.launchActivity
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.showToast
import dagger.hilt.android.AndroidEntryPoint
/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    //View Binding initialization
    private val binding : ActivityLoginBinding by lazy { DataBindingUtil.setContentView(this, R.layout.activity_login) }
   //LoginViewModel initialization
    private val viewModel by viewModels<LoginViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.loginViewModel = viewModel
        initObserver()
        onClickEvents()
        // In case of login success loginLiveData observer will observe
        viewModel.loginLiveData.observe(this){
            showToast(message = "Login Success")
            launchActivity<DashboardActivity>()
            finish()
        }
        }

    private fun onClickEvents() { binding.signUpBtn.setOnClickListener { launchActivity<RegisterActivity>() } }

    /**
     * View binding error observers
     */
    private fun initObserver() {
        viewModel.emailErrorLiveData.observe(this){ binding.usernameLayout.error = it }
        viewModel.passwordErrorLiveData.observe(this){ binding.passwordLayout.error = it }
        viewModel.enableLoginLiveData.observe(this){ binding.loginBtn.isEnabled = it }
        // In case of login failure loginErrorLiveData will observer
        viewModel.loginErrorLiveData.observe(this){ showToast(message =it) }

    }
}