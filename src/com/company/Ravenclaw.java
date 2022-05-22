package com.company;

public class Ravenclaw extends HogwartsStudents{
    private String wisdom;
    private String wit;
    private String creativity;

    public Ravenclaw(String name, String surname, int magicPower, int transgression, String wisdom, String wit, String creativity) {
        super(name, surname, magicPower, transgression);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public String getWisdom() {
        return wisdom;
    }

    public void setWisdom(String wisdom) {
        this.wisdom = wisdom;
    }

    public String getWit() {
        return wit;
    }

    public void setWit(String wit) {
        this.wit = wit;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ravenclaw{" +
                "wisdom='" + wisdom + '\'' +
                ", wit='" + wit + '\'' +
                ", creativity='" + creativity + '\'' +
                '}';
    }
}
