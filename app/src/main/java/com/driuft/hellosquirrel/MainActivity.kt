package com.driuft.hellosquirrel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var profileName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide action bar
        supportActionBar?.hide()

        configureProfile()
    }

    private fun configureProfile() {
        profileName = findViewById(R.id.profile_name)

        profileName.text = getString(
            R.string.full_name,
            getString(R.string.first_name),
            getString(R.string.last_name)
        )
    }
}