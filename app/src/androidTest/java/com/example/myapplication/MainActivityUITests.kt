package com.example.myapplication

import android.content.res.Resources
import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Rule
import org.junit.Test

class MainActivityUITests {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testGreetingText() {
        with(MainActivityTestScreen(composeTestRule)) {
            checkGreetingText()
        }
    }

    @Test
    fun test() {
        assert(1 == 2) {"Тестовая ошибка"}
    }
}