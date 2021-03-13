package com.example.top10university

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val actionBar = supportActionBar
        actionBar?.title = "Profile"
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}