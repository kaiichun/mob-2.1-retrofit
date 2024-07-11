package com.alvin.mob.core

import android.util.Log

object Utils {
    fun debugLog(tag: String = "debugging"):(Any) -> Unit {
        return {
            Log.d(tag, it.toString())
        }
    }
}