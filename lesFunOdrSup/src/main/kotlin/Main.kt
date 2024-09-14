package fr.hamtec

import fr.hamtec.boulang.cookies
import fr.hamtec.odrSup.*

fun main() {
    affMap()
}
fun affMap(): Unit {
    val fullMenu = cookies.map {
        "${it.name} - $${it.price}"
    }
    println("Full menu:")
    fullMenu.forEach {
        println(it)
    }
}
fun affForEach(): Unit {
    cookies.forEach {
        println("Menu item: ${it.name}")
    }
}