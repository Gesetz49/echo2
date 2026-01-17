package org.example

fun main() {
    print("Введите первое число: ")
    val first = readLine()?.toDoubleOrNull()

    print("Введите второе число: ")
    val second = readLine()?.toDoubleOrNull()

    if (first == null || second == null) {
        println("Ошибка: введите корректные числа.")
        return
    }

    val sum = first + second
    println("Сумма двух чисел: $sum")
}