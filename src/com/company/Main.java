package com.company;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void printSeparator() {
        System.out.println("================================");
    }

    // задание1 Високосный год
    public static void checkOfYear(int year) {
        int divFour = year % 4;
        int divHundred = year % 100;
        int divFourHundred = year % 400;
        if (divFourHundred != 0 && (divFour != 0 || divHundred == 0)) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год является високосным.");
        }
    }

    // задание2 Версия приложения
    public static void printVersion(int year, int type) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            System.out.println("Установите облегченную версию приложения");
        } else if (type == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }

    // задание3 Длительность доставки
    public static void getTimeOfDelivery(int distance) {
        int minTimeOfDelivery = 1;
        int KTimeOfDelivery = (distance - 21) / 40;
        int AlltimeOfDelivery = minTimeOfDelivery * 2 + KTimeOfDelivery;
        if (distance <= 20) {
            System.out.println("Для доставки на дистанцию " + distance + " км потребуется " + minTimeOfDelivery + " день");
        } else {
            System.out.println("Для доставки на дистанцию " + distance + " км потребуется " + AlltimeOfDelivery + " дней(я)");
        }
    }

    // задание4 Проверка дублей. Проверяет, есть ли дубли, предварительно сортируя строку и убирает верхний регистр
    public static void checkDoubles  (String a) {
        String a1 = a.toLowerCase();
        char[] arr = a1.toCharArray();
        Arrays.sort (arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i]) == arr[i + 1]) {
                System.out.println("Внимание! Дубль в строке "+ a +". Литера - " + arr [i + 1]+".");
                break;
            } else {
                System.out.println("В строке "+a+ " дублей нет.");
                break;
            }
        }
    }


    public static void main(String[] args) {
        printSeparator();
        int year = 1900;
        checkOfYear(year);
        printSeparator();

        int clientDeviceYear = 2022;
        int typeOS = 1;
        printVersion(clientDeviceYear, typeOS);

        printSeparator();
        int deliveryDistance = 105;
        getTimeOfDelivery(deliveryDistance);

        printSeparator();

        String s = "aAbccddefgghiijjkk";
        checkDoubles(s);
        String a = "123456";
        checkDoubles(a);




    }
}
