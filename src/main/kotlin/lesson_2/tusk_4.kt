package com.example.lesson_2

/*
В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса), который дает +20% к добытым материалам.
Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество "бонусных" (то есть тех материалов,
которые даются "сверху" баффом). По одной строке на материал с его названием.
 */
fun main() {
    val BONUS_PERCENTAGE = 20
    val bonusMultiplier = 1 + BONUS_PERCENTAGE / 100.0
    
    val kristall = 7
    val iron = 11
    val kristallWithBuff = kristall * bonusMultiplier
    val ironWithBuff = iron * bonusMultiplier

    println("Бонус кристаллов: ${kristallWithBuff - kristall}")
    println("Бонус железа: ${ironWithBuff - iron}")

}