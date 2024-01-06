package com.example.caculator_jet_pack_compose

sealed class CalculatorOperation(val symbol:String) {
    object Add: CalculatorOperation("+")
    object Subtract: CalculatorOperation("-")
    object Multiply: CalculatorOperation("x")
    object Divide: CalculatorOperation("/")
}