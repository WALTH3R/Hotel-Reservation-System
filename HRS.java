/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hrs;

/**
 *
 * @author munya
 */

import java.util.Date;


public class HRS {
    public static void main(String[] args) {
        // Create a hotel
        Hotel hotel = new Hotel("Grand Hotel", "Downtown", 5);

        // Create some rooms
        Room room1 = new Room(101, "Single", true);
        Room room2 = new Room(102, "Double", true);
        Room room3 = new Room(103, "Suite", true);
        Room room4 = new Room(104, "VIP", true);
        Room room5 = new luxuryroom(104, "VIP", true, "Free breakfast, Spa access");
        // Create a guest
        Guest guest = new Guest("John Doe", "1234567890", 30, 4);

        // Create a reservation
        Reservation reservation = new Reservation(1, 101, new Date(), new Date(), guest.getName());

        // Display information
        System.out.println(hotel);
        System.out.println(room1);
        System.out.println(room2);
        System.out.println(room3);
        System.out.println(room4);
        System.out.println(room5);
        System.out.println(guest);
        System.out.println(reservation);
    }
}

