package com.cleanarchitecturesample.feature_clean_sample.presentation.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.cleanarchitecturesample.R
import com.cleanarchitecturesample.databinding.ActivityDashboardBinding
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.Resource
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.gone
import com.cleanarchitecturesample.feature_clean_sample.presentation.util.visible
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */
@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {
    //View Binding initialization
    private val binding : ActivityDashboardBinding by lazy { DataBindingUtil.setContentView(this, R.layout.activity_dashboard) }
   // RestaurantAdapter initialization
    private val restaurantAdapter by lazy { RestaurantAdapter() }
    //RestaurantViewModel initialization
    private val viewModel by viewModels<RestaurantViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.apply {
            swipeRefreshLayout.setOnRefreshListener { lifecycleScope.launch { viewModel.getRestaurants() } }
            restaurantsList.apply { adapter = restaurantAdapter }
                viewModel.restaurants.observe(this@DashboardActivity){
                    restaurantAdapter.submitList(it.data)
                    when (it) {
                        is Resource.Loading -> {
                            if (!swipeRefreshLayout.isRefreshing) { progressBar.visible() }
                            progressBar.isVisible = it.data.isNullOrEmpty()
                        }
                        is Resource.Success -> {
                            progressBar.gone()
                            swipeRefreshLayout.isRefreshing = false
                        }
                        is Resource.Error -> {
                            progressBar.gone()
                            textViewError.isVisible = it.data.isNullOrEmpty()
                            swipeRefreshLayout.isRefreshing = false
                        }
                    }
            }

        }
    }
}