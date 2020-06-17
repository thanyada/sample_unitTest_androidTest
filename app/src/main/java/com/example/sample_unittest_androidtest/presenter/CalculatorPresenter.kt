package com.example.sample_unittest_androidtest.presenter

import com.example.sample_unittest_androidtest.di.CalculatorContract

class CalculatorPresenter(private var view : CalculatorContract.View? = null) :
     CalculatorContract.Presenter {

    val operations = listOf("c","/","x","-","+","=")
    val numbers = listOf("0","1","2","3","4","5","6","7","8","9",".")
    private var lastOperate = ""
    private var lastNumber = 0.0
    private var lastPressed = ""
    private var isPressOperate = false
    private var total  = "0"


     override fun onPressedNumber(valuePressed: String) {

         if(isPressOperate ) {

             isPressOperate = false

             lastNumber = total.toDouble()
             total = valuePressed
             view?.onDisplayed(total)
             lastPressed = valuePressed

             return
         }

         total =  if(total == "0" || total.contains("Infinity",true) || lastPressed == "=" )  valuePressed
         else "$total$valuePressed"

         view?.onDisplayed(total)
         lastPressed = valuePressed

     }

    override fun onPressedOperator(valuePressed: String) {

        if (total == "0") return

        total = getResultCalculate()
        view?.onDisplayed(total)

        isPressOperate = true
        lastOperate = valuePressed
        lastPressed = valuePressed

    }

    override fun onPressedDot() {

        lastPressed = "."

        if(total.contains("Infinity",true))
            return

        if(!total.contains(".")){
            total = "$total."
            view?.onDisplayed(total)
        }
    }


    override fun onPressedEqual()  {

        total = getResultCalculate()
        view?.onDisplayed(total)

        lastOperate = ""
        lastNumber = 0.0
        isPressOperate = false
        lastPressed = "="

    }


    override fun onPressedClear() {
        total = "0"
        lastOperate = ""
        lastNumber = 0.0
        isPressOperate = false
        lastPressed = ""
        view?.onDisplayed(total)
    }


    override fun cleanUp() {
        view = null

    }


     private fun getResultCalculate() : String{

         if(!operations.contains(lastPressed) && lastNumber != 0.0 ) {

             if (total.endsWith(".")) total = "${total}0"

             val result =  calculate(lastNumber,total.toDouble(),lastOperate)

             val resultString =  result.toString()

             return  if(resultString.endsWith(".0")) resultString.removeSuffix(".0")
             else resultString

         }

         return total
     }



     private fun calculate(a:Double, b:Double, o:String) : Double {
         return when (o) {
             operations[1] ->   a / b
             operations[2] ->   a * b
             operations[3] ->   a - b
             operations[4] ->   a + b
             else -> 0.0
         }
     }



 }