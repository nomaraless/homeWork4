import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача 2
        System.out.println("Введите температуру");
        byte temperature = sc.nextByte();
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
        //Задача 3
        System.out.println("Введите скорость");
        short speed = sc.nextShort();
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
        //Задача 4
        System.out.println("Введите возраст");
        int age1 = sc.nextInt();
        if (age1 >= 2 && age1 <= 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад");
        } else if (age1 >= 7 && age1 <= 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу");
        } else if (age1 >= 18 && age1 <= 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в университет");
        } else if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Ребенок слишком мал");
        }
        //Задача 5
        System.out.println("Введите возраст");
        byte childAge = sc.nextByte();
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он не может кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то он может кататься без сопровождения взрослого");
        }
        //Задача 6
        byte capacity = 102;
        System.out.println("Введите количество людей в вагоне");
        short numbOfPerson = sc.nextShort();
        if (numbOfPerson < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (numbOfPerson >=60 && numbOfPerson < capacity) {
            System.out.println("В вагоне остались только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        //Задача 7
        System.out.println("Введите три числовых значения");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число " + two);
        } else {
            System.out.println("Наибольшее число " + three);
        }
        sc.close();
    }
}