package com.university.lab6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CinemaTest {

    @Test
    public void testBookSeats() {
        Cinema cinema = new Cinema();
        cinema.bookSeats(1, 3, new int[]{2, 3, 4});
        assertEquals(1, cinema.getSeats()[1][3][2]); 
        assertEquals(1, cinema.getSeats()[1][3][3]);
        assertEquals(1, cinema.getSeats()[1][3][4]);
    }

    @Test
    public void testCancelBooking() {
        Cinema cinema = new Cinema();
        cinema.bookSeats(1, 3, new int[]{2, 3, 4});
        cinema.cancelBooking(1, 3, new int[]{3, 4});
        assertEquals(1, cinema.getSeats()[1][3][2]); 
        assertEquals(0, cinema.getSeats()[1][3][3]); 
        assertEquals(0, cinema.getSeats()[1][3][4]);
    }

    @Test
    public void testCheckAvailability() {
        Cinema cinema = new Cinema();
        boolean isAvailable = cinema.checkAvailability(1, 3);
        assertTrue(isAvailable);
    }

    @Test
    public void testPrintSeatingArrangement() {
        Cinema cinema = new Cinema();
        assertDoesNotThrow(() -> cinema.printSeatingArrangement(1));
    }

    @Test
    public void testInvalidBooking() {
        Cinema cinema = new Cinema();
        cinema.bookSeats(1, 3, new int[]{2, 3, 4});
        cinema.bookSeats(1, 3, new int[]{3, 4});
        assertEquals(1, cinema.getSeats()[1][3][2]); 
        assertEquals(1, cinema.getSeats()[1][3][3]); 
        assertEquals(1, cinema.getSeats()[1][3][4]); 
    }
}
