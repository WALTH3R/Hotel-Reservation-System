/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hrs;

/**
 *
 * @author munya
 */
public class Guest {
    private String name;
    private String phone;
    private int age;
    private int familyCount;

    public Guest(String name, String phone, int age, int familyCount) {
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.familyCount = familyCount;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getFamilyCount() {
        return familyCount;
    }

    public void setFamilyCount(int familyCount) {
        this.familyCount = familyCount;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", familyCount=" + familyCount +
                '}';
    }
}

