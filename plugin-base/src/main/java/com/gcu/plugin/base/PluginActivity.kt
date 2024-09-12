package com.gcu.plugin.base

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import com.gcu.plugin_base.R

/**
 * 所有插件activity的基类，名义上是activity，但是实际没有activity的能力，要借助外部activity
 * 这里继承activity只是为了过编译
 * @author: GGBond
 * @date: 2024/9/11
 */
open class PluginActivity : ActivityInterface {

    protected lateinit var proxyActivity: Activity

    override fun attachToAppContext(activity: Activity) {
        this.proxyActivity = activity
    }

    override fun onCreate(bundle: Bundle?) {

    }

    override fun onStart() {

    }

    override fun onResume() {

    }

    override fun onPause() {

    }

    override fun onStop() {

    }

    override fun onDestroy() {

    }

    override fun getTheme(): Int {
        return R.style.Theme_PluginShell
    }

    fun setContentView(@LayoutRes layoutId: Int) {
        proxyActivity.setContentView(layoutId)
    }

    fun <T> findViewById(@IdRes resId: Int): T? {
        return proxyActivity.findViewById(resId)
    }

    /**
     * 插件activity跳转到别的activity
     */
    fun startActivity(intent: Intent) {
        val newIntent = Intent().apply {
            putExtra("className", intent.component?.className)
        }
        proxyActivity.startActivity(newIntent)
    }
}