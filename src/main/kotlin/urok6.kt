fun main() {
    val month = 12

    when(month) {
        in 1..1 -> println("Месяц 1 Дней 31")
        in 2..2 -> println("Месяц 2 Дней 28 или 29")
        in 3..3 -> println("Месяц 3 Дней 31")
        in 4..4 -> println("Месяц 4 Дней 30")
        in 5..5 -> println("Месяц 5 Дней 31")
        in 6..6 -> println("Месяц 6 Дней 30")
        in 7..7 -> println("Месяц 7 Дней 31")
        in 8..8 -> println("Месяц 8 Дней 31")
        in 9..9 -> println("Месяц 9 Дней 30")
        in 10..10 -> println("Месяц 10 Дней 31")
        in 11..11 -> println("Месяц 11 Дней 30")
        in 12..12 -> println("Месяц 12 Дней 31")
        else ->{
            println("no")
        }


    }
}