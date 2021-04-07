

fun main() {
    var a = 10
    val b = 3

    println("a++ : $" +
            "")

    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")
    println("a%b = ${a%b}")

    println("2+2*5 = ${(2+2)*5}")

    a += 2
    println("a += 2 : $a")
    a -= 2
    println("a -= 2 : $a")
    a *= 2
    println("a *= 2 : $a")
    a /= 2
    println("a /= 2 : $a")
    a %= 2
    println("a %= 2 : $a")


}
