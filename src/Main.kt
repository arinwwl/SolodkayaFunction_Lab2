fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()

    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()

    print("Введите третье число: ")
    val num3 = readLine()!!.toInt()

    val sumOfMinMax = sumOfMaxAndMin(num1, num2, num3)
    println("Сумма большего и меньшего чисел: $sumOfMinMax")
}

fun sumOfMaxAndMin(a: Int, b: Int, c: Int): Int {
    val max = maxOf(a, maxOf(b, c))
    val min = minOf(a, minOf(b, c))
    return max + min
}
