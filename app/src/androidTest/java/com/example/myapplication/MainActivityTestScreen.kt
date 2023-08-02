package com.example.myapplication

import androidx.compose.ui.test.assertContentDescriptionEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.rules.ActivityScenarioRule

class MainActivityTestScreen(testRule: AndroidComposeTestRule<ActivityScenarioRule<MainActivity>, MainActivity>): BaseTestScreen() {
    val composeTestRule = testRule
    fun checkGreetingText(
        //composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<MainActivity>, MainActivity>
    ) {
        composeTestRule.onNodeWithTag(MainActivitySemantics.greetingText)
            .assertIsDisplayed()
            .assertTextContains(
                value = getStringResource(R.string.hello),
                substring = true
            )
            .assertContentDescriptionEquals(getStringResource(R.string.greeting))
    }
}