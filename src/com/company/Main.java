package com.company;
public class Main {
    private static void printGryffindorStudents(Gryffindor[] gryffindor) {
        for (int i = 0; i < gryffindor.length; i++) {
            System.out.println(gryffindor[i]);
        }
    }
        private static int sumGryffindorStudentsPoints(Gryffindor[] gryffindor) {
        int sum = 0;
            for (int i = 0; i < gryffindor.length; i++) {
                sum = sum + gryffindor[i].getSum();
                System.out.println(gryffindor[i].getFullName() + " в сумме получает " + sum + " баллов");
            }
            return sum;
        }
    private static void printРufflepuffStudents(Рufflepuff[] pufflepuff) {
        for (int i = 0; i < pufflepuff.length; i++) {
            System.out.println(pufflepuff[i]);
        }
    }
    private static int sumРufflepuffStudentsPoints(Рufflepuff[] pufflepuff) {
        int sum = 0;
        for (int i = 0; i < pufflepuff.length; i++) {
            sum = sum + pufflepuff[i].getSum();
            System.out.println(pufflepuff[i].getFullName() + " в сумме получает " + sum + " баллов");
        }
        return sum;
    }
    private static void printRavenclawStudents(Ravenclaw[] ravenclaw) {
        for (int i = 0; i < ravenclaw.length; i++) {
            System.out.println(ravenclaw[i]);
        }
    }
    private static int sumRavenclawStudentsPoints(Ravenclaw[] ravenclaw) {
        int sum = 0;
        for (int i = 0; i < ravenclaw.length; i++) {
            sum = sum + ravenclaw[i].getSum();
            System.out.println(ravenclaw[i].getFullName() + " в сумме получает " + sum + " баллов");
        }
        return sum;
    }
    private static void printSlytherinStudents(Slytherin[] slytherin) {
        for (int i = 0; i < slytherin.length; i++) {
            System.out.println(slytherin[i]);
        }
    }
    private static int sumSlytherinStudentsPoints(Slytherin[] slytherin) {
        int sum = 0;
        for (int i = 0; i < slytherin.length; i++) {
            sum = sum + slytherin[i].getSum();
            System.out.println(slytherin[i].getFullName() + " в сумме получает " + sum + " баллов");
        }
        return sum;
    }
    public static void main(String[] args) {

        Gryffindor[] gryffindor = {
        new Gryffindor("Гарри", "Поттер", 78, 44, 90, 55, 97),
        new Gryffindor("Гермиона", "Грейнджер", 78, 44, 90, 55, 97),
        new Gryffindor("Рон", "Уизли", 78, 44, 90, 55, 97)};
        printGryffindorStudents(gryffindor);
        sumGryffindorStudentsPoints(gryffindor);
        System.out.println();
        Рufflepuff[] pufflepuff = {
        new Рufflepuff("Захария", "Смит", 78, 44, 90, 55, 97),
        new Рufflepuff("Седрик", "Диггори", 78, 44, 90, 55, 97),
        new Рufflepuff("Джастин", "Финч-Флетчли", 78, 44, 90, 55, 97)};
        printРufflepuffStudents(pufflepuff);
        sumРufflepuffStudentsPoints(pufflepuff);
        System.out.println();
        Ravenclaw[] ravenclaw = {
        new Ravenclaw("Чжоу", "Чанг", 78, 44, 54, 90, 55, 97),
        new Ravenclaw("Падма", "Патил", 78, 44, 29, 90, 55, 97),
        new Ravenclaw("Маркус", "Белби", 78, 44, 80, 90, 55, 97)};
        printRavenclawStudents(ravenclaw);
        sumRavenclawStudentsPoints(ravenclaw);
        System.out.println();
        Slytherin[] slytherin = {
        new Slytherin("Драко", "Малфой", 78, 44, 90, 55, 97, 7, 99),
        new Slytherin("Грэхэм", "Монтегю", 78, 44, 90, 55, 97, 45, 76),
        new Slytherin("Грегори", "Гойл", 78, 44, 90, 55, 97, 75, 11)};
        printSlytherinStudents(slytherin);
        sumSlytherinStudentsPoints(slytherin);
        }
    }