package com.spone.keyplusclone.service.language

import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.os.LocaleListCompat

private const val TAG = "LanguageService"

class LanguageService {
    fun setLanguage(code: String) {
        val appLocale: LocaleListCompat = LocaleListCompat.forLanguageTags("xx-YY")
// Call this on the main thread as it may require Activity.restart()
        AppCompatDelegate.setApplicationLocales(appLocale)
    }

    fun test(){
         val list = AppCompatDelegate.getApplicationLocales()

        Log.v(TAG, "test:${list.toLanguageTags()}")
    }
}