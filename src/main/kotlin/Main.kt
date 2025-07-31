package com.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val num = readln().toInt()

    val result = when (num) {
        0 -> "zero"
        1 -> "one"
        2 -> "two"
        else ->"a lot"
    }
    println(result)
}

const val AGE_OF_MAJORITY = 18