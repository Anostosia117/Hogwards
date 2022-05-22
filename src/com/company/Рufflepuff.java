package com.company;

public class Рufflepuff extends HogwartsStudents{
    private String industriousness;
    private String loyalty;
    private String honesty;

    public Рufflepuff(String name, String surname, int magicPower, int transgression, String industriousness, String loyalty, String honesty ) {
        super(name, surname, magicPower, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public String getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(String industriousness) {
        this.industriousness = industriousness;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getHonesty() {
        return honesty;
    }

    public void setHonesty(String honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Рufflepuff{" +
                "industriousness='" + industriousness + '\'' +
                ", loyalty='" + loyalty + '\'' +
                ", honesty='" + honesty + '\'' +
                '}';
    }
}
