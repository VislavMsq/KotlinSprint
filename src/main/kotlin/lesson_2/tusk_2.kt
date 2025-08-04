package com.example.lesson_2

/*
В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
 */
fun main() {
    val employees = 50
    val salary = 30000
    val interns = 30
    val internSalary = 20000

    val permanentEmployeeExpenses = employees * salary

    val totalSalaryExpenses = permanentEmployeeExpenses + (interns * internSalary)

    val totalEmployees = employees + interns
    val averageSalary = totalSalaryExpenses / totalEmployees

    println("Расходы на зарплату постоянных сотрудников: $permanentEmployeeExpenses")
    println("Общие расходы на зарплату: $totalSalaryExpenses")
    println("Средняя зарплата: $averageSalary")
}