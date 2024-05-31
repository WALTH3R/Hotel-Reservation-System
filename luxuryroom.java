/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrs;

/**
 *
 * @author munya
 */
public class luxuryroom extends Room {
    private String additionalServices;

    public luxuryroom(int roomNumber, String type, boolean isAvailable, String additionalServices) {
        super(roomNumber, type, isAvailable);
        this.additionalServices = additionalServices;
    }

    public String getAdditionalServices() {
        return additionalServices;
    }

    public void setAdditionalServices(String additionalServices) {
        this.additionalServices = additionalServices;
    }

    @Override
    public String toString() {
        return "LuxuryRoom{" +
                "roomNumber=" + getRoomNumber() +
                ", type='" + getType() + '\'' +
                ", isAvailable=" + isAvailable() +
                ", additionalServices='" + additionalServices + '\'' +
                '}';
    }
}
