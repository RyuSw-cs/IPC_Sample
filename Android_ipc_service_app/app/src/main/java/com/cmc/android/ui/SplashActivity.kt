package com.cmc.android.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.cmc.android.databinding.ActivitySplashBinding
import com.cmc.android.service.CmcCalcServiceManager

class SplashActivity : AppCompatActivity() {

    private var _binding : ActivitySplashBinding? = null
    private val binding by lazy { requireNotNull(_binding) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startMain()
    }

    private fun checkAppToApp() {

    }

    private fun startMain(){
        checkAppToApp()
        Handler(Looper.getMainLooper()).postDelayed({
            finish()
            startActivity(
                Intent(this, MainActivity::class.java).apply {
                    this@SplashActivity.intent.extras?.run {
                        putExtras(this)
                    }
                }
            )
        }, 3000)
    }
}