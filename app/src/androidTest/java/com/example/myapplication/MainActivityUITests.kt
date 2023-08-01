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

    private val resources: Resources = InstrumentationRegistry.getInstrumentation()
        .targetContext.resources

    @Test
    fun testTextIsDisplayed() {
        // Just different search options :-)

        // with text (substring)
        composeTestRule.onNodeWithText(
            text = resources.getString(R.string.android),
            substring = true
        ).assertIsDisplayed()


        // with testTag
        composeTestRule.onNodeWithTag(MainActivitySemantics.greetingText)
            .assertIsDisplayed()

        // with content description
        composeTestRule.onNodeWithContentDescription(
            resources.getString(R.string.greeting)
        )

    }

    @Test
    fun testContentDescription() {
        composeTestRule.onNodeWithTag(MainActivitySemantics.greetingText)
            .assertContentDescriptionEquals(
                resources.getString(R.string.greeting)
            )
    }
}