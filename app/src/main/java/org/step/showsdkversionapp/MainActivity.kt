package org.step.showsdkversionapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var apiversion_textview: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        showApiVersion()
    }

    private fun showApiVersion() {
        val apiVersion = Build.VERSION.SDK_INT
        apiversion_textview?.text = getString(R.string.main_api_version, apiVersion)
    }

    private fun initializeViews() {
        apiversion_textview = findViewById(R.id.textview_activity_main_apiversion)
    }
}