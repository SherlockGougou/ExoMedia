package com.devbrackets.android.exomedia.nmp.manager

import android.annotation.SuppressLint
import android.os.Build

/**
 * Provides the user agent to use when communicating over a network
 */
open class UserAgentProvider {
  companion object {
    @SuppressLint("DefaultLocale")
    val defaultUserAgent = String.format(
        "ExoMedia %s / Android %s / %s",
        "5.0.0",
        Build.VERSION.RELEASE,
        Build.MODEL
    )
  }

  open val userAgent: String = defaultUserAgent
}