package ru.netology

fun calculateCommission(cardType: String, amount: Int): Int {
    return when (cardType) {
        "Mastercard", "Maestro" -> if (amount in 300..75000) {
            0
        } else {
            (amount * 0.006 + 20).toInt()
        }

        "Visa", "Мир" -> (amount * 0.0075 + 35).toInt()
        else -> 0
    }
}

fun isWithinLimits(cardType: String, amount: Int): Boolean {
    return when (cardType) {
        "Mastercard", "Maestro" -> amount <= 150000
        "Visa", "Мир" -> amount <= 150000
        "VK Pay" -> amount <= 15000
        else -> false
    }
}

fun main() {
    val cardType = "Mastercard"
    val amount = 5000

    val commission = calculateCommission(cardType, amount)
    val isWithinLimits = isWithinLimits(cardType, amount)

    println("Commission: $commission")
    println("Within Limits: $isWithinLimits")
}
