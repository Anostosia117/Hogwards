package com.company;

public class HogwartsStudents {
    private String name;
    private String surname;
    private int magicPower;
    private int transgression;

    public HogwartsStudents(String name, String surname, int magicPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public String getFullName() {
        return name + " " + surname;
    }
    public int sumPoints() {
        return magicPower + transgression;
    }
    @Override
    public String toString() {
        return "Имя студента " + getFullName() +
                ". Магическая сила равна " + magicPower +
                ". Трансгрессировать может на " + transgression;
    }
}
