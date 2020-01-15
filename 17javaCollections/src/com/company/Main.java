package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("Olympian",8, 12);
//        theatre.getSeats();
        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay");
        }else{
            System.out.print("Sorry seat is already taken");
        }
    }
}
