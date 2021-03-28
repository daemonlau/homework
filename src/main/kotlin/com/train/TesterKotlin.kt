package com.train

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)
    var ticketnum:Int = 0
    while (ticketnum !=-1){
        print("Please enter number of tickets: " + "\n" +"(Press -1 if you want to stop.)")
        ticketnum = scanner.nextInt()
        if (ticketnum == -1){
            break
        }
        print("How many round-trip tickets: ")
        var roundtrip = scanner.nextInt()
        if (roundtrip > ticketnum){
            println("Round-trip must smaller than tickets number.")
        }else{
            val tic = Ticketk(ticketnum,roundtrip)
            tic.print()
        }

    }


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