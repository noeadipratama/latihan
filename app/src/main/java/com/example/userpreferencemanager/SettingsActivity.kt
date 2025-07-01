package com.example.userpreferencemanager

import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    private lateinit var prefs: PrefsHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        prefs = PrefsHelper(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val switchTheme = findViewById<Switch>(R.id.switchTheme)
        val switchNotifications = findViewById<Switch>(R.id.switchNotifications)
        val btnSave = findViewById<Button>(R.id.btnSave)

        // Load current preferences
        switchTheme.isChecked = prefs.isDarkMode
        switchNotifications.isChecked = prefs.isNotificationsEnabled

        btnSave.setOnClickListener {
            prefs.isDarkMode = switchTheme.isChecked
            prefs.isNotificationsEnabled = switchNotifications.isChecked

            // Ini kunci agar MainActivity tahu user ubah tema
            prefs.isThemeChanged = true

            finish() // Balik ke MainActivity
        }
    }
}