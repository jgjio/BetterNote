package com.betternote

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.rule.ActivityTestRule

@RunWith(AndroidJUnit4::class)
@LargeTest
class NotesActivityTest {

    @Test
    fun testNewNoteFloatingActionButton_shouldBeDisplayed() {
        onView(withId(R.id.fab)).check(matches(isDisplayed()))
    }

    @Test
    fun testNewNoteFloatingActionButton_shouldOpenCreateNoteActivity() {
        onView(withId(R.id.fab)).perform(click())
                onView(withId(R.id.create_note_fragment)).check(matches(isDisplayed()))
    }

    //ActivityTestRule provides functional testing
    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)
}