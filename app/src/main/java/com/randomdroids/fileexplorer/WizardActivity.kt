package com.randomdroids.fileexplorer


import android.os.Bundle
import androidx.fragment.app.FragmentActivity


/**
 * Loads [WizardFragment].
 */
class WizardActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wizard)
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.wizard_fragment, WizardFragment()).commitAllowingStateLoss()
    }
}