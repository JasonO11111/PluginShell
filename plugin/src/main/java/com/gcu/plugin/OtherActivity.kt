package com.gcu.plugin

import android.os.Bundle
import android.util.Log
import com.gcu.plugin.base.PluginActivity

/**
 *
 * @author: GGBond
 * @date: 2024/9/11
 */
class OtherActivity : PluginActivity() {

    companion object {
        private val TAG = this::class.simpleName
    }

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_other)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ")
    }
}