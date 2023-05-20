import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 1) Написать программу, выводящую информацию о вас(имя, фамилия, профессия).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите вашу фамилию: ");
        String surName = scanner.nextLine();
        System.out.println("Введите вашу должность: ");
        String profession = scanner.nextLine();
        System.out.println("Вы ввели: "+"Имя: "+ name + ", Фамилия: " + surName + ", Должность: "+ profession + "." );
    }
}