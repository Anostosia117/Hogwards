package com.company;

public class Slytherin extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int magicPower, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, magicPower, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
public int getSum() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
}
    public int sumPoints() {
        return super.sumPoints();
    }
    @Override
    public String toString() {
        return super.toString() +
                ". Хитрость: " + cunning +
                ". Решительность: " + determination +
                ". Амбициозность: " + ambition +
                ". Находчивость: " + resourcefulness +
                ". Жажда власти: " + lustForPower;
    }
}
