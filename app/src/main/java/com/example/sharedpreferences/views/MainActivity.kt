package com.example.sharedpreferences.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferences.R

class MainActivity : AppCompatActivity() {

    val sharedPref by lazy {
        getSharedPreferences("com.example.sharedpreferences", 0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editPreferences = sharedPref.edit()

        editPreferences.putString("my_app_color", "RED")
        sharedPref.getString("my_app_color", "BLUE DEFAULT")


    }
}
