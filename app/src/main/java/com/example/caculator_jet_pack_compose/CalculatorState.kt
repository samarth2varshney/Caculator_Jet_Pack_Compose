package com.example.caculator_jet_pack_compose

data class CalculatorState(
    val number1:String = "",
    val number2:String = "",
    val operation: CalculatorOperation?=null
)
