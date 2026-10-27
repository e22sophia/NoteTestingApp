package com.example.notetestingapp

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class NoteValidatorTest {

    @Test
    fun validNoteReturnsTrue() {
        assertTrue(isValidNote("Complete lab record"))
    }

    @Test
    fun emptyNoteReturnsFalse() {
        assertFalse(isValidNote(""))
    }

    @Test
    fun blankNoteReturnsFalse() {
        assertFalse(isValidNote("   "))
    }
}