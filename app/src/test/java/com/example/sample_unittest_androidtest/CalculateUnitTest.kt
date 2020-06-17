package com.example.sample_unittest_androidtest

import com.example.sample_unittest_androidtest.di.CalculatorContract
import com.example.sample_unittest_androidtest.presenter.CalculatorPresenter
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class CalculateUnitTest {
    @Mock
    lateinit var view: CalculatorContract.View

    @Mock
    private lateinit var  presenter : CalculatorPresenter

    @Before
    fun initController(){

        MockitoAnnotations.initMocks(this)
        presenter = CalculatorPresenter(view)

    }

    @Test
    fun onPlusNormal() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedEqual()


        verify(view).onDisplayed("82")
    }

    @Test
    fun onMinusNormal() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("-")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("2")
        presenter.onPressedEqual()


        verify(view).onDisplayed("30")
    }

    @Test
    fun onMultiNormal() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("x")
        presenter.onPressedNumber("5")
        verify(view).onDisplayed("5")
        presenter.onPressedEqual()


        verify(view).onDisplayed("160")
    }


    @Test
    fun onDeviseNormal() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("/")
        presenter.onPressedNumber("5")
        verify(view).onDisplayed("5")
        presenter.onPressedEqual()


        verify(view).onDisplayed("6.4")
    }

    @Test
    fun onDevise0() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("/")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("0")
        presenter.onPressedEqual()
        verify(view).onDisplayed("Infinity")
    }


    @Test
    fun onCal3Set() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedOperator("-")
        verify(view).onDisplayed("82")
        presenter.onPressedNumber("2")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("22")
        presenter.onPressedEqual()
        verify(view).onDisplayed("60")
    }

    @Test
    fun onCal4Set() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedOperator("-")
        verify(view).onDisplayed("82")
        presenter.onPressedNumber("2")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("22")
        presenter.onPressedOperator("x")
        verify(view).onDisplayed("60")
        presenter.onPressedNumber("1")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("10")
        presenter.onPressedEqual()
        verify(view).onDisplayed("600")

    }

    @Test
    fun onCal5Set() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedOperator("-")
        verify(view).onDisplayed("82")
        presenter.onPressedNumber("2")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("22")
        presenter.onPressedOperator("x")
        verify(view).onDisplayed("60")
        presenter.onPressedNumber("1")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("10")
        presenter.onPressedOperator("/")
        verify(view).onDisplayed("600")
        presenter.onPressedNumber("3")
        verify(view,atLeastOnce()).onDisplayed("3")
        presenter.onPressedEqual()
        verify(view).onDisplayed("200")

    }


    @Test
    fun onStartDot() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedDot()
        presenter.onPressedNumber("4")
        verify(view).onDisplayed("5.4")
        presenter.onPressedEqual()
        
        verify(view).onDisplayed("37.4")
    }

    @Test
    fun onPres2Dot() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedDot()
        presenter.onPressedDot()
        presenter.onPressedNumber("4")
        verify(view).onDisplayed("5.4")
        presenter.onPressedEqual()

        verify(view).onDisplayed("37.4")
    }

    @Test
    fun onEndDot() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedDot()
        verify(view).onDisplayed("50.")
        presenter.onPressedEqual()


        verify(view).onDisplayed("82")
    }


    @Test
    fun onStartOperator() {
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedEqual()


        verify(view).onDisplayed("82")
    }

    @Test
    fun onChangeOperate() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("-")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedEqual()


        verify(view).onDisplayed("82")
    }

    @Test
    fun onOperate2Times() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedEqual()


        verify(view).onDisplayed("82")
    }

    @Test
    fun onNotPressEqual() {
        
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedOperator("+")


        verify(view).onDisplayed("82")
    }


    @Test
    fun onPressEqualAndReCalculate() {




        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view,atLeastOnce()).onDisplayed("32")
        presenter.onPressedOperator("-")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedEqual()
        verify(view).onDisplayed("82")

        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view, atLeastOnce()).onDisplayed("32")
        presenter.onPressedOperator("-")
        verify(view, atLeastOnce()).onDisplayed("32")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("2")
        presenter.onPressedEqual()
        verify(view).onDisplayed("30")
        
    }


    @Test
    fun onClearCalculate() {
        presenter.onPressedNumber("3")
        presenter.onPressedNumber("2")
        verify(view).onDisplayed("32")
        presenter.onPressedOperator("+")
        presenter.onPressedNumber("5")
        presenter.onPressedNumber("0")
        verify(view).onDisplayed("50")
        presenter.onPressedOperator("+")
        presenter.onPressedClear()
        verify(view).onDisplayed("0")
    }

}