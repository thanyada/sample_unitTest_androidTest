package com.example.sample_unittest_androidtest.di

interface CalculatorContract {

    interface View{
        fun onDisplayed(result : String)
    }

    interface Presenter{
        fun onPressedOperator(valuePressed:String)
        fun onPressedNumber(valuePressed:String)
        fun onPressedDot()
        fun onPressedEqual()
        fun onPressedClear()
        fun cleanUp()

    }
}