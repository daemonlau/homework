package com.train;

public class Ticket {
    int ticketnum;
    int roundtrip;


    public Ticket(int ticketnum, int roundtrip) {
        this.ticketnum = ticketnum;
        this.roundtrip = roundtrip;
    }

    public void print(){
        System.out.println("Total tickets: "+ ticketnum +
                "\n"+ "Round-trip: " + roundtrip + "\n"+
                "Total: " + (roundtrip*2000*0.9 + (ticketnum-roundtrip)*1000));

    }
}
