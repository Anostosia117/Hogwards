package com.company;

public class Gryffindor extends HogwartsStudents{
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, String surname, int magicPower, int transgression, int nobility, int honour, int bravery) {
        super(name, surname, magicPower, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getSum() {
        return nobility + honour + bravery;
    }
    public int sumPoints() {
        return super.sumPoints();
    }
    @Override
    public String toString() {
        return super.toString() +
                ". Благородство: " + nobility +
                ". Честь: " + honour +
                ". Храбрость: " + bravery;
    }
}
