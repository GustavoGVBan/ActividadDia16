package com.example.actividadperros

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View

class SplashActivity : AppCompatActivity() {
    private val segundos = 5
    private val millisecons = segundos * 800
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        starLaunchSplash()
    }
    private fun starLaunchSplash() {
        fullScreenMode()
        startCount()
    }

    @SuppressLint("ObsoleteSdkInt")
    fun fullScreenMode() {
        val uiOptions = window.decorView.systemUiVisibility
        var newUiOptions = uiOptions
        val isImmersiveModeEnabled = uiOptions or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY == uiOptions
        if (Build.VERSION.SDK_INT >= 14) {
            newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
        }
        if (Build.VERSION.SDK_INT >= 16) {
            newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 18) {
            newUiOptions = newUiOptions xor View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        }
        window.decorView.systemUiVisibility = newUiOptions
    }

    private fun startCount() {

        object : CountDownTimer(millisecons.toLong(), 800) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {

                val dashBoardIntent = Intent(this@SplashActivity, MainActivity::class.java)
                dashBoardIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                this@SplashActivity.startActivity(dashBoardIntent)
                this@SplashActivity.finish()

            }
        }.start()
    }
}