package com.example.myapplication

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
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
    fun testImageCry() {
        with(MainActivityTestScreen(composeTestRule)) {
            checkImageCry()
        }
    }
}