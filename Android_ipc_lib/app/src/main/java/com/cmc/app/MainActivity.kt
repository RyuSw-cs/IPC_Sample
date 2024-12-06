package com.cmc.app

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.cmc.app.databinding.ActivityMainBinding
import com.ryusw.ipc.api.CmcManager
import com.ryusw.ipc.callback.CmcResponseCallback
import com.ryusw.ipc.callback.CmcServiceConnectionCallback
import com.ryusw.ipc.constant.CmcBundleKey
import com.ryusw.ipc.context.CmcCalcType
import com.ryusw.ipc.params.CmcCalcRequestParams

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding by lazy { requireNotNull(_binding) }
    private var operator = CmcCalcType.PLUS

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.VANILLA_ICE_CREAM){
            addPadding()
        }
        initView()
    }

    private fun initView() {
        with(binding) {
            btnStart.setOnClickListener {
                startAppToApp()
            }
            groupOperator.setOnCheckedChangeListener { _, checkedId ->
                when (checkedId) {
                    R.id.btn_plus -> {
                        operator = CmcCalcType.PLUS
                    }

                    R.id.btn_minus -> {
                        operator = CmcCalcType.MINUS
                    }
                }
            }
        }
    }

    private fun addPadding() {
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun startAppToApp() {
        // TODO : 앱 설치 유무로 변경
        if (true) {

        } else {
            PopupDialog.showDialog(
                content = "앱이 설치되지 않았습니다.",
                fragmentManager = supportFragmentManager
            )
        }
    }

    private fun showToast(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

