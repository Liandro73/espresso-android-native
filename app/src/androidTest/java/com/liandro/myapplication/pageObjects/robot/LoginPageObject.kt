package com.liandro.myapplication.pageObjects.robot

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.liandro.myapplication.R

class LoginPageObject {

    fun checkTextLoginIsDisplayed(titleLogin: String) {
        onView(withText(titleLogin)).check(matches(isDisplayed()))
    }

    fun fillFieldEmailAddress(email: String) {
        onView(withId(R.id.editTextTextEmailAddress)).perform(typeText(email))
        Espresso.closeSoftKeyboard()
    }

    fun fillFieldPassword(password: String) {
        onView(withId(R.id.editTextTextPassword)).perform(typeText(password))
        Espresso.closeSoftKeyboard()
    }

    fun clickOnLoginButton() {
        onView(withId(R.id.button_login)).perform(click())
    }

}