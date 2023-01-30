package com.cleanarchitecturesample.feature_clean_sample.presentation.register

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.cleanarchitecturesample.R
import com.cleanarchitecturesample.databinding.ActivityRegisterBinding
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.showToast
import dagger.hilt.android.AndroidEntryPoint

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {

    //View Binding initialization
    private val binding: ActivityRegisterBinding by lazy { DataBindingUtil.setContentView(this, R.layout.activity_register) }
    //RegistrationViewModel initialization
    private val viewModel by viewModels<RegistrationViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.registrationViewModel = viewModel
        binding.user = viewModel.user
        initObserver()
        // In case of register success registerLiveData observer will observe
        viewModel.registerLiveData.observe(this){ finish() }

    }
    /**
     * View binding error observers
     */
    private fun initObserver() {
        viewModel.emailErrorLiveData.observe(this) { binding.emailLayout.error = it }
        viewModel.firstNameErrorLiveData.observe(this) { binding.firstNameLayout.error = it }
        viewModel.lastNameErrorLiveData.observe(this) { binding.lastNameLayout.error = it }
        viewModel.passwordErrorLiveData.observe(this) { binding.passwordLayout.error = it }
        viewModel.registerEnableLiveData.observe(this) { binding.registerBtn.isEnabled = it }
        // In case of register failure registerErrorLiveData will observer
        viewModel.registerErrorLiveData.observe(this){ showToast(message = it) }
    }
}