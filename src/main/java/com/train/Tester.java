package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketnum = 0;
        while(ticketnum != -1){
            System.out.print("Please enter number of tickets:" + "\n" +
                    "(Press -1 if you want to stop) ");
            ticketnum = scanner.nextInt();
            if (ticketnum == -1){
                break;
            }
            System.out.print("How many round-trip tickets: ");
            int roundtrip = scanner.nextInt();
            if (roundtrip > ticketnum){
                System.out.println("Roundtrip must smaller than tickets number.");
            } else{
                Ticket tic=new Ticket(ticketnum,roundtrip);
                tic.print();
            }

        }








    }
}
