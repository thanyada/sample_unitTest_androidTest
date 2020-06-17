package com.example.sample_unittest_androidtest.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.sample_unittest_androidtest.R
import com.example.sample_unittest_androidtest.presenter.CalculatorPresenter
import kotlinx.android.synthetic.main.activity_main.*

class CalculatorActivity : AppCompatActivity(),
    CalculatorContract.View {

    private lateinit var presenter: CalculatorPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = CalculatorPresenter(this)
    }

    fun pressOperate(v: View){

        val value = when(v.id){
            R.id.btnDevise ->  presenter.operations[1]
            R.id.btnMultiple ->  presenter.operations[2]
            R.id.btnMinus ->  presenter.operations[3]
            R.id.btnPlus ->  presenter.operations[4]
            else ->  ""
        }
        presenter.onPressedOperator(value)
    }


    fun pressNumber(v: View){
        val value = when(v.id){
            R.id.btn0 ->  presenter.numbers[0]
            R.id.btn1 ->  presenter.numbers[1]
            R.id.btn2 ->  presenter.numbers[2]
            R.id.btn3 ->  presenter.numbers[3]
            R.id.btn4 ->  presenter.numbers[4]
            R.id.btn5 ->  presenter.numbers[5]
            R.id.btn6 ->  presenter.numbers[6]
            R.id.btn7 ->  presenter.numbers[7]
            R.id.btn8 ->  presenter.numbers[8]
            R.id.btn9 ->  presenter.numbers[9]
            else ->  ""
        }
        presenter.onPressedNumber(value)
    }

    fun pressEqual(v: View){
        presenter.onPressedEqual()
    }

    fun pressClear(v: View){
        presenter.onPressedClear()
    }

    fun pressDot(v: View){
        presenter.onPressedDot()
    }

    override fun onDisplayed(r : String) {
        Log.i("onDisplayed","r : $r")
        tvResult.text = r
    }


    override fun onDestroy() {
        super.onDestroy()

        presenter.cleanUp()
    }


}