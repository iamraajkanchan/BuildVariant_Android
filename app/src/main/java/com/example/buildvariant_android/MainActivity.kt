package com.example.buildvariant_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity()
{
    companion object {
        const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState : Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }

    private fun test()
    {
        val data = BuildConfig.VERSION_NAME
        Log.d(TAG, data)
    }
}