package fr.hamtec

import fr.hamtec.boulang.cookies
import fr.hamtec.odrSup.*

fun main() {
    cookies.forEach {
        println("Menu item: ${it.name}")
    }
}