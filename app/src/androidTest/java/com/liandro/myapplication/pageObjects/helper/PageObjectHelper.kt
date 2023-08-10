package com.liandro.myapplication.pageObjects.helper

import androidx.test.espresso.Espresso.closeSoftKeyboard

class PageObjectHelper {

    fun hideKeyboard() {
        closeSoftKeyboard()
    }

}