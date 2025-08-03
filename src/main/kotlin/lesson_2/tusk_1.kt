package com.example.lesson_2

/*
Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека. У них следующие баллы по профильному предмету 3, 4, 3, 5. Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.

 – Написать выражение, которое высчитывает средний балл;
 – Распечатать результат в консоль;
 – В консоли должно быть выведено дробное число с 2 знаками после запятой.
 */
fun main() {

    val mark1 = 3
    val mark2 = 4
    val mark3 = 3
    val mark4 = 5

    val numberOfStudents = 4
    val sumOfMarks = mark1 + mark2 + mark3 + mark4

    val average = sumOfMarks.toDouble() / numberOfStudents
    val formattedAverage = String.format("%.2f", average)

    println("Средний балл: $formattedAverage")
}