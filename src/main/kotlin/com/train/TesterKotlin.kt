package com.train

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    print("Please enter number of tickets: ")
    var ticketnum = scanner.nextInt()
    print("How many round-trip tickets: ")
    var roundtrip = scanner.nextInt()
    val tic = Ticketk(ticketnum,roundtrip)
    tic.print()
}
class Ticketk(var ticketnum: Int, var roundtrip: Int){
    fun print(){
        println(
            """
                Total tickets: $ticketnum
                Round-trip: $roundtrip
                Total: ${roundtrip * 2000 * 0.9 + (ticketnum - roundtrip) * 1000}
                """.trimIndent()
        )
    }
}
class TesterKotlin {
}