package com.liandro.myapplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.liandro.myapplication.pageObjects.constants.ConstantsHome
import com.liandro.myapplication.pageObjects.constants.ConstantsLogin
import com.liandro.myapplication.pageObjects.robot.HomePageObject
import com.liandro.myapplication.pageObjects.robot.LoginPageObject

import org.junit.Rule
import org.junit.Test

import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestLogin {

    private val loginPageObject = LoginPageObject()
    private val constantsLogin = ConstantsLogin()
    private val homePageObject = HomePageObject()
    private val constantsHome = ConstantsHome()

    @get:Rule
    var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testLoginSucessfully() {
        loginPageObject.checkTextLoginIsDisplayed(constantsLogin.TITLE_LOGIN)
        loginPageObject.fillFieldEmailAddress(constantsLogin.USER_EMAIL)
        loginPageObject.fillFieldPassword(constantsLogin.USER_PASSWORD)
        loginPageObject.clickOnLoginButton()
        homePageObject.checkTextHomeIsDisplayed(constantsHome.TITLE_HOME)
    }

    @Test
    fun testLogoutSucessfully() {
        loginPageObject.checkTextLoginIsDisplayed(constantsLogin.TITLE_LOGIN)
        loginPageObject.fillFieldEmailAddress(constantsLogin.USER_EMAIL)
        loginPageObject.fillFieldPassword(constantsLogin.USER_PASSWORD)
        loginPageObject.clickOnLoginButton()
        homePageObject.checkTextHomeIsDisplayed(constantsHome.TITLE_HOME)
        homePageObject.clickOnLogoutButton()
        loginPageObject.checkTextLoginIsDisplayed(constantsLogin.TITLE_LOGIN)
    }

}