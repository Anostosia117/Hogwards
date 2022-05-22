package com.company;

public class Ravenclaw extends HogwartsStudents{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int magicPower, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, magicPower, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
public int getSum() {
        return mind + wisdom + wit + creativity;
}
    public int sumPoints() {
        return super.sumPoints();
    }
    @Override
    public String toString() {
        return super.toString() +
                ". Ум: " + mind +
                ". Мудрость: " + wisdom +
                ". Остроумие: " + wit +
                ". Креативность: " + creativity;
    }
}
