package com.university.lab6;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        cinema.bookSeats(1, 3, new int[]{2, 3, 4});
        cinema.bookSeats(2, 5, new int[]{10, 11, 12});
        cinema.cancelBooking(1, 3, new int[]{3, 4});
        cinema.printSeatingArrangement(1);

        boolean isAvailable = cinema.checkAvailability(2, 3);
        System.out.println("Доступність 3 послідовних місць в залі 2: " + isAvailable);
    }
}
