fun main() {
    // for loop

    val names = arrayListOf("Kotlin", "Java", "Draft")

    for(i in 0 until names.size){
        println(names[i])
    }

    for(i in 0..10) { //continue break
        if (i == 6) continue
        println(i)
    }
    println("....................")

    //while

    var j = 0
    while( j <= 10){
        println("while $j")
        j++
    }
    //do while
    println(",,,,,,,,,,,,,,,,,,,,")

    var k = 0
    do{
        println("do while $k")
        k++
    }while (k <= 10)
}