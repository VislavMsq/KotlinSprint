package com.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600

/*
Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
- Значения часов, минут и секунд отображать двумя цифрами.
 */
fun main() {
    val totalSeconds = 6480

    val hours = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours = totalSeconds % SECONDS_IN_HOUR
    val minutes = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    println("Время полёта Гагарина: [$formattedTime]")
}