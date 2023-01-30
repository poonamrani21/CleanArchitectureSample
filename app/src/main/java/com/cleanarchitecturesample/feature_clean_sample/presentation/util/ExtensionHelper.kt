package com.cleanarchitecturesample.feature_clean_sample.presentation.util

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast

/***
 * Created by @author Poonam Rani by 18 Jan 2023
 */


fun Activity.showToast(resId: Int? = null, message: String? = null) {
    Toast.makeText(this, if (resId != null) { this.getString(resId) } else { message!! }, Toast.LENGTH_SHORT).show()
}
/**
 * Extension for smarter launching of Activities
 */
inline fun <reified T : Activity> Context.launchActivity(
    noinline modify: Intent.() -> Unit = {}
) {
    val intent = Intent(this, T::class.java)
    intent.modify()
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
    startActivity(intent)
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}
