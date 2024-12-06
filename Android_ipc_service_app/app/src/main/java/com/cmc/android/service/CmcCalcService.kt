package com.cmc.android.service

import android.app.ActivityManager
import android.app.Service
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.IBinder
import android.os.Looper
import android.os.Message
import android.os.Messenger
import com.cmc.android.context.CalcContext
import com.cmc.android.CmcBundleKey
import com.cmc.android.CmcMessageType
import com.cmc.android.ui.MainActivity
import com.cmc.android.ui.SplashActivity

class CmcCalcService : Service() {

    companion object {
        const val SERVICE_FULL_NAME = "com.cmc.android.service.CmcCalcService"
    }
}