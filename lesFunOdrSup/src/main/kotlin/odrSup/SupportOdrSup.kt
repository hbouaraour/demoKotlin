package fr.hamtec.odrSup

fun hello(): Unit {
    println("Hello")
}

fun hello1() = println("Hello-1")

fun fistOdrSup(): Unit {
    val hello2 = { -> println("Hello-2") }
    val hello3 = { println("Hello-3") }

    hello2()
}
