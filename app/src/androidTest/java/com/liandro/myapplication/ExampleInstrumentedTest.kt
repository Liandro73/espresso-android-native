package com.liandro.myapplication

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule

import org.junit.Rule
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testLoginSucessfully() {
        onView(withText("Welcome")).check(matches(isDisplayed()))
        onView(withId(R.id.editTextTextEmailAddress)).perform(typeText("liandro.sys@gmail.com"))
        closeSoftKeyboard()
        onView(withId(R.id.editTextTextPassword)).perform(typeText("1234567"))
        closeSoftKeyboard()
        onView(withId(R.id.button_login)).perform(click())
        onView(withText("Home")).check(matches(isDisplayed()))
    }

    @Test
    fun testLogoutSucessfully() {
        onView(withText("Welcome")).check(matches(isDisplayed()))
        onView(withId(R.id.editTextTextEmailAddress)).perform(typeText("liandro.sys@gmail.com"))
        closeSoftKeyboard()
        onView(withId(R.id.editTextTextPassword)).perform(typeText("1234567"))
        closeSoftKeyboard()
        onView(withId(R.id.button_login)).perform(click())
        onView(withText("Home")).check(matches(isDisplayed()))
        onView(withId(R.id.button_logout)).perform(click())
        onView(withText("Welcome")).check(matches(isDisplayed()))
    }

}