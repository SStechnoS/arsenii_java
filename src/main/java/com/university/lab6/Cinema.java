package com.university.lab6;

public class Cinema {
    private int[][][] seats;

    public Cinema() {
    
        seats = new int[5][10][20];
     
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 20; k++) {
                    seats[i][j][k] = 0;
                }
            }
        }
    }


    public void bookSeats(int hallNumber, int row, int[] seatsToBook) {
        for (int seat : seatsToBook) {
            if (seats[hallNumber][row][seat] == 1) {
                System.out.println("Місце " + seat + " у ряду " + row + " в залі " + hallNumber + " вже заброньоване.");
            } else {
                seats[hallNumber][row][seat] = 1;
                System.out.println("Місце " + seat + " у ряду " + row + " в залі " + hallNumber + " успішно заброньоване.");
            }
        }
    }


    public void cancelBooking(int hallNumber, int row, int[] seatsToCancel) {
        for (int seat : seatsToCancel) {
            if (seats[hallNumber][row][seat] == 0) {
                System.out.println("Місце " + seat + " у ряду " + row + " в залі " + hallNumber + " вже вільне.");
            } else {
                seats[hallNumber][row][seat] = 0;
                System.out.println("Бронювання для місця " + seat + " у ряду " + row + " в залі " + hallNumber + " скасовано.");
            }
        }
    }


    public boolean checkAvailability(int hallNumber, int numSeats) {
        for (int i = 0; i < 10; i++) {
            int consecutiveSeats = 0;
            for (int j = 0; j < 20; j++) {
                if (seats[hallNumber][i][j] == 0) {
                    consecutiveSeats++;
                    if (consecutiveSeats == numSeats) {
                        return true;
                    }
                } else {
                    consecutiveSeats = 0;
                }
            }
        }
        return false;
    }


    public void printSeatingArrangement(int hallNumber) {
        System.out.println("Схема розміщення місць для залу " + hallNumber + ":");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (seats[hallNumber][i][j] == 0) {
                    System.out.print("O "); 
                } else {
                    System.out.print("X "); 
                }
            }
            System.out.println(); 
        }
    }

    public int[][][] getSeats() {
        return seats;
    }


    
}
