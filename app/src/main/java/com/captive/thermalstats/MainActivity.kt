package com.captive.thermalstats

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PowerManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val powerManager = getSystemService(Context.POWER_SERVICE) as? PowerManager
        val TAG = "Test"
        Log.d(TAG, "get current Thermal status: ${powerManager?.currentThermalStatus}")

    }
}
