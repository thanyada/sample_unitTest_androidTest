package com.example.sample_unittest_androidtest

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import androidx.test.rule.ActivityTestRule
import com.example.sample_unittest_androidtest.di.CalculatorActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@MediumTest
class CalculateInstrumentedTest {

    @get:Rule
    val activityRule = ActivityTestRule(CalculatorActivity::class.java)

    @Test
    fun onPlusNormal() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))

    }


    @Test
    fun onMinusNormal() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnMinus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("2")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("30")))

    }

    @Test
    fun onMultiNormal() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnMultiply)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("5")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("160")))

    }


    @Test
    fun onDivideNormal() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnDivide)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("5")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("6.4")))

    }

    @Test
    fun onDivide0() {


        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnDivide)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("0")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("Infinity")))
    }


    @Test
    fun onCal3Set() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btnMinus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))

        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("22")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("60")))
    }

    @Test
    fun onCal4Set() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btnMinus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))

        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("22")))

        Espresso.onView(withId(R.id.btnMultiply)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("60")))

        Espresso.onView(withId(R.id.btn1)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("10")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("600")))

    }

    @Test
    fun onCal5Set() {
        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btnMinus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))

        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("22")))

        Espresso.onView(withId(R.id.btnMultiply)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("60")))

        Espresso.onView(withId(R.id.btn1)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("10")))

        Espresso.onView(withId(R.id.btnDivide)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("600")))

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("3")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("200")))
    }


    @Test
    fun onStartDot() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btnDot)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn4)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("5.4")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("37.4")))

    }

    @Test
    fun onPres2Dot() {


        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btnDot)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btnDot)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn4)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("5.4")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("37.4")))

    }

    @Test
    fun onEndDot() {


        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnDot)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50.")))
        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))
    }


    @Test
    fun onStartOperator() {
        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))
    }

    @Test
    fun onChangeOperate() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnMinus)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))
    }

    @Test
    fun onOperate2Times() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))
    }

    @Test
    fun onNotPressEqual() {


        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))
    }


    @Test
    fun onPressEqualAndReCalculate() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("82")))


        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnMinus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("2")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("30")))

    }


    @Test
    fun onClearCalculate() {

        Espresso.onView(withId(R.id.btn3)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn2)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("32")))

        Espresso.onView(withId(R.id.btnPlus)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.btn5)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btn0)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("50")))

        Espresso.onView(withId(R.id.btnEqual)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.btnC)).perform(ViewActions.click())

        Espresso.onView(withId(R.id.tvResult)).check(matches(withText("0")))
    }

}