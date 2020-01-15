package com.company;
import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows -1);
        for(char row = 'A';row<=lastRow;row++) {
            for(int seatNum =1;seatNum<=seatsPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("%02d",seatNum));
                seats.add(seat);
            }

        }
    }

    public String getTheatreName(){
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat>0){
            return seats.get(foundSeat).reserve();
        }else{
            System.out.println("There is no seat "+seatNumber);
            return false;
        }
//        for(Seat seat : seats) {
//            System.out.println(".");
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                System.out.println("Found seat "+seat.getSeatNumber());
//                break;
//            }
//        }
//
//        if(requestedSeat == null){
//            System.out.println("There is no seat "+seatNumber);
//            return false;
//        }else {
//            return requestedSeat.reserve();
//        }
    }

    //for testing
    public void getSeats(){
        for(Seat seat : seats){
            System.out.print(seat.getSeatNumber()+"\n");
        }
    }

    //create a Seat class
    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;
        //Seat constructor
        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }
        @Override
        public int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());

        }
        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat "+seatNumber+" reserved");
                return true;
            }else{
                return false;
            }
        }
        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.print("Reservation of seat at "+seatNumber + " cancelled");
                return true;
            }else{
               return false;
            }
        }
        public String getSeatNumber(){
            return seatNumber;
        }
    }
}

