package org.example

fun main() {
/*    print("Введите первое число: ")
    val first = readLine()?.toDoubleOrNull()

    print("Введите второе число: ")
    val second = readLine()?.toDoubleOrNull()

    if (first == null || second == null) {
        println("Ошибка: введите корректные числа.")
        return
    }

    val sum = first + second
    println("Сумма двух чисел: $sum")*/

    fun main(args: Array<String>) {
        if (args.size < 2) {
            println("Usage: java -jar app.jar <number1> <number2>")
            return
        }

        val num1 = args[0].toDoubleOrNull()
        val num2 = args[1].toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Error: both arguments must be numbers")
            return
        }

        println("Сумма двух чисел: ${num1 + num2}")
    }
}