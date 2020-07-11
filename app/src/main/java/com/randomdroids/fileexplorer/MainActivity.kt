
package com.randomdroids.fileexplorer

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.preference.PreferenceManager

/**
 * Loads [MainFragment].
 */
class MainActivity : Activity() {

    val USER_FINISHED_WIZARD = "user_finished_wizard"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        PreferenceManager.getDefaultSharedPreferences(this).apply {
            // Check if we need to display our OnboardingSupportFragment
            if (!getBoolean(USER_FINISHED_WIZARD, false)) {
                // The user hasn't seen the OnboardingSupportFragment yet, so show it
                startActivity(Intent(this@MainActivity, WizardActivity::class.java))
            }
        }
    }
}
