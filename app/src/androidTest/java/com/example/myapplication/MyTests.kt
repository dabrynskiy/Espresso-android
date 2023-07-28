package com.example.myapplication

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.junit.Rule
import org.junit.Test

class MyTests {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun test() {
        composeTestRule.setContent {
            MyApplicationTheme {
                Greeting("Android")
            }
        }

        composeTestRule.onNodeWithText(
            text = "Android",
            substring = true
        ).assertIsDisplayed()

    }
}