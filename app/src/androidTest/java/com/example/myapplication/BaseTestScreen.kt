package com.example.myapplication

import android.content.res.Resources
import androidx.annotation.StringRes
import androidx.test.platform.app.InstrumentationRegistry

open class BaseTestScreen {
    private val resources: Resources = InstrumentationRegistry.getInstrumentation()
        .targetContext.resources

    protected fun getStringResource(id: Int) = resources.getString(id)
}