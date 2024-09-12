package com.gcu.pluginshell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.gcu.plugin.base.PluginManager
import com.gcu.plugin.base.ProxyActivity
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_init_plugin).setOnClickListener {
            PluginManager.loadPlugin(this)
        }

        findViewById<Button>(R.id.btn_to_plugin).setOnClickListener {
            // 先判断插件包是否存在
            val privateDir = getExternalFilesDir(null)
            val pluginApk = File(
                (privateDir?.absolutePath ?: "") + File.separator + PluginManager.PLUGIN_APK_NAME
            )
            if (!pluginApk.exists()) {
                Toast.makeText(this, "插件包不存在", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // 跳转
            val intent = Intent(this, ProxyActivity::class.java).apply {
                putExtra("className", "com.gcu.plugin.SettingActivity")
            }
            startActivity(intent)
        }
    }
}