package com.cmc.android.ui

import android.os.Bundle
import android.os.Message
import androidx.appcompat.app.AppCompatActivity
import com.cmc.android.CmcBundleKey
import com.cmc.android.CmcMessageType
import com.cmc.android.CmcResultCode
import com.cmc.android.CmcResultMsg
import com.cmc.android.databinding.ActivityMainBinding
import com.cmc.android.service.CmcCalcServiceManager
import kotlinx.coroutines.runBlocking
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding by lazy { requireNotNull(_binding) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}