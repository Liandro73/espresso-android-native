package com.liandro.myapplication.pageObjects.robot

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.liandro.myapplication.R

class HomePageObject {

    fun checkTextHomeIsDisplayed(titleHome: String) {
        onView(withText(titleHome)).check(matches(isDisplayed()))
    }

    fun clickOnLogoutButton() {
        onView(withId(R.id.button_logout)).perform(click())
    }

}