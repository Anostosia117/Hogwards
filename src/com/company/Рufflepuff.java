package com.company;

public class Рufflepuff extends HogwartsStudents{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Рufflepuff(String name, String surname, int magicPower, int transgression, int industriousness, int loyalty, int honesty ) {
        super(name, surname, magicPower, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
public int getSum() {
    return industriousness + loyalty + honesty;
}
    public int sumPoints() {
        return super.sumPoints();
    }
    @Override
    public String  toString() {
        return super.toString() +
                ". Трудолюбие: " + industriousness +
                ". Верность: " + loyalty +
                ". Честность: " + honesty;
    }
}
