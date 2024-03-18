package org.jetbrains.kotlinconf.utils

import android.util.Log
import io.ktor.client.plugins.logging.Logger

actual fun mobileLogger(): Logger = object : Logger {
    override fun log(message: String) {
        Log.w("KotlinConfClient", message)
    }
}