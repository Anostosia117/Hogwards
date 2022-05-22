package com.company;

public class Gryffindor extends HogwartsStudents{
    private String nobility;
    private String honour;
    private String bravery;

    public Gryffindor(String name, String surname, int magicPower, int transgression, String nobility, String honour, String bravery) {
        super(name, surname, magicPower, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public String getNobility() {
        return nobility;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public String getHonour() {
        return honour;
    }

    public void setHonour(String honour) {
        this.honour = honour;
    }

    public String getBravery() {
        return bravery;
    }

    public void setBravery(String bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Gryffindor{" +
                "nobility='" + nobility + '\'' +
                ", honour='" + honour + '\'' +
                ", bravery='" + bravery + '\'' +
                '}';
    }
}
