package com.example.notetestingapp

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class NoteScreenTest {

    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun addNoteButtonIsDisplayed() {

        composeRule.setContent {
            NoteScreen()
        }

        composeRule
            .onNodeWithText("Add Note")
            .assertIsDisplayed()
    }
}