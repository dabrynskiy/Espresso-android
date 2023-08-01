package com.example.myapplication

import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class MainActivityUITests {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testTextIsDisplayed() {
        // Just different search options :-)

        // with text (substring)
        composeTestRule.onNodeWithText(
            text = "Android",
            substring = true
        ).assertIsDisplayed()

        // with testTag
        composeTestRule.onNodeWithTag("greeting_text")
            .assertIsDisplayed()

        // with content description
        composeTestRule.onNodeWithContentDescription("Greeting")

    }

    @Test
    fun testContentDescription() {
        composeTestRule.onNodeWithTag("greeting_text")
            .assertContentDescriptionEquals("Greeting")
    }
}