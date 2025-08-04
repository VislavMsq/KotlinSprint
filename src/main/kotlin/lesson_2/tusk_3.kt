package com.example.lesson_2

const val MINUTES_IN_HOUR = 60

/*
Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них. Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */
fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinutes = 457

    val departureTotalMinutes = departureHour * MINUTES_IN_HOUR + departureMinute

    val arrivalTotalMinutes = departureTotalMinutes + travelTimeInMinutes

    val arrivalHour = arrivalTotalMinutes / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTotalMinutes % MINUTES_IN_HOUR

    val formattedArrivalTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)
    println("Время прибытия поезда: $formattedArrivalTime")
}