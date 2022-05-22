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
        if (gryffindor[0].getSum() > gryffindor[1].getSum()) {
            System.out.println(gryffindor[0].getFullName() + " лучший Гриффиндорец, чем " + gryffindor[1].getFullName());
        } else
            System.out.println(gryffindor[1].getFullName() + " лучший Гриффиндорец, чем " + gryffindor[0].getFullName());
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
        if (pufflepuff[2].getSum() > pufflepuff[1].getSum()) {
            System.out.println(pufflepuff[2].getFullName() + " лучший Пуффендуец, чем " + pufflepuff[1].getFullName());
        } else
            System.out.println(pufflepuff[1].getFullName() + " лучший Пуффендуец, чем " + pufflepuff[2].getFullName());
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
        if (ravenclaw[2].getSum() > ravenclaw[0].getSum()) {
            System.out.println(ravenclaw[2].getFullName() + " лучший Когтевранец, чем " + ravenclaw[0].getFullName());
        } else
            System.out.println(ravenclaw[0].getFullName() + " лучший Когтевранец, чем " + ravenclaw[2].getFullName());
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
        if (slytherin[1].getSum() > slytherin[0].getSum()) {
            System.out.println(slytherin[1].getFullName() + " лучший Слизеринец, чем " + slytherin[0].getFullName());
        } else
            System.out.println(slytherin[0].getFullName() + " лучший Слизеринец, чем " + slytherin[1].getFullName());
        return sum;
    }
    public static int sumBestStudent(Рufflepuff[] pufflepuff, Gryffindor[] gryffindor) {
        int sumPoints = 0;
        for (int i = 0; i < sumPoints; i++) {
        }
        if (pufflepuff[1].sumPoints() < gryffindor[2].sumPoints()) {
            System.out.println(pufflepuff[1].getFullName() + " бОльшей мощностью магии, чем "+ gryffindor[2].getFullName());
        } else
            System.out.println(pufflepuff[2].getFullName() + " обладает бОльшей мощностью магии, чем "+ gryffindor[1].getFullName());
        return sumPoints;
    }
    public static void main(String[] args) {

        Gryffindor[] gryffindor = new Gryffindor[3];
        gryffindor[0] = new Gryffindor("Гарри", "Поттер", 78, 44, 90, 55, 97);
        gryffindor[1] = new Gryffindor("Гермиона", "Грейнджер", 64, 43, 50, 51, 61);
        gryffindor[2] = new Gryffindor("Рон", "Уизли", 48, 29, 13, 63, 77);
        printGryffindorStudents(gryffindor);
        sumGryffindorStudentsPoints(gryffindor);
        System.out.println();
        Рufflepuff[] pufflepuff = new Рufflepuff[3];
        pufflepuff[0] = new Рufflepuff("Захария", "Смит", 58, 41, 92, 48, 70);
        pufflepuff[1] = new Рufflepuff("Седрик", "Диггори", 46, 74, 43, 55, 82);
        pufflepuff[2] = new Рufflepuff("Джастин", "Финч-Флетчли", 82, 99, 47, 36, 97);
        printРufflepuffStudents(pufflepuff);
        sumРufflepuffStudentsPoints(pufflepuff);
        System.out.println();
        Ravenclaw[] ravenclaw = new Ravenclaw[3];
        ravenclaw[0] = new Ravenclaw("Чжоу", "Чанг", 70, 50, 31, 85, 37, 83);
        ravenclaw[1] = new Ravenclaw("Падма", "Патил", 78, 87, 33, 44, 55, 66);
        ravenclaw[2] = new Ravenclaw("Маркус", "Белби", 10, 44, 80, 90, 55, 92);
        printRavenclawStudents(ravenclaw);
        sumRavenclawStudentsPoints(ravenclaw);
        System.out.println();
        Slytherin[] slytherin = {
        new Slytherin("Драко", "Малфой", 48, 81, 38, 12, 97, 7, 99),
        new Slytherin("Грэхэм", "Монтегю", 60, 48, 50, 55, 97, 45, 76),
        new Slytherin("Грегори", "Гойл", 71, 44, 90, 60, 51, 75, 11)};
        printSlytherinStudents(slytherin);
        sumSlytherinStudentsPoints(slytherin);
        System.out.println();
        sumBestStudent(pufflepuff, gryffindor);
        }
    }