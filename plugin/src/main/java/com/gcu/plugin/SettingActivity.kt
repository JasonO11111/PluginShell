package com.gcu.plugin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.gcu.plugin.base.PluginActivity

/**
 *
 * @author: GGBond
 * @date: 2024/9/11
 */
class SettingActivity : PluginActivity() {
    companion object {
        private val TAG = this::class.simpleName
    }

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_setting)

        val msg = bundle?.getString("msg")
        Log.d(TAG, "onCreate: 宿主发的消息 = [${msg}]")

        findViewById<Button>(R.id.btn_to_main)?.setOnClickListener {
            startActivity(Intent(proxyActivity, OtherActivity::class.java))
        }
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

    override fun getTheme(): Int {
        return R.style.Theme_PluginShell
    }

}