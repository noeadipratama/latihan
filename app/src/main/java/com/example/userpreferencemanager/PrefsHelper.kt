package com.example.userpreferencemanager

import android.content.Context
import android.content.SharedPreferences

class PrefsHelper(context: Context) {
    private val prefs: SharedPreferences = context.getSharedPreferences("user_prefs", Context.MODE_PRIVATE)

    var isLoggedIn: Boolean
        get() = prefs.getBoolean("isLoggedIn", false)
        set(value) = prefs.edit().putBoolean("isLoggedIn", value).apply()

    var username: String?
        get() = prefs.getString("username", null)
        set(value) = prefs.edit().putString("username", value).apply()

    var isDarkMode: Boolean
        get() = prefs.getBoolean("isDarkMode", false)
        set(value) = prefs.edit().putBoolean("isDarkMode", value).apply()

    var isNotificationsEnabled: Boolean
        get() = prefs.getBoolean("isNotificationsEnabled", false)
        set(value) = prefs.edit().putBoolean("isNotificationsEnabled", value).apply()

    var isThemeChanged: Boolean
        get() = prefs.getBoolean("isThemeChanged", false)
        set(value) = prefs.edit().putBoolean("isThemeChanged", value).apply()

    fun clear() = prefs.edit().clear().apply()
}