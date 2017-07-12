package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число и месяц текущего (2017) года в формате ДД ММ: ");
        byte day = scanner.nextByte();
        byte month = scanner.nextByte();

        if (day > 31) {
            System.out.println("неверное число дней");
        }
        switch (month) {
            case 1: System.out.println("С начала года прошло " + day + " дня  (дней)."); break;
            case 2: int z1 = 31 + day; System.out.println("С начала года прошло " + z1 + " дня (дней)."); break;
            case 3: int z2 = 31 + 28 + day; System.out.println("С начала года прошло " + z2 + " дня (дней)."); break;
            case 4: int z3 = 31 * 2 + 28 + day; System.out.println("С начала года прошло " + z3 + " дня (дней)."); break;
            case 5: int z4 = 31 * 2 + 28 + 30 + day; System.out.println("С начала года прошло " + z4 + " дня (дней)."); break;
            case 6: int z5 = 31 * 2 + 28 + 30 * 2 + day; System.out.println("С начала года прошло " + z5 + " дня (дней)."); break;
            case 7: int z6 = 31 * 3 + 28 + 30 * 2 + day; System.out.println("С начала года прошло " + z6 + " дня (дней)."); break;
            case 8: int z7 = 31 * 4 + 28 + 30 * 2 + day; System.out.println("С начала года прошло " + z7 + " дня (дней)."); break;
            case 9: int z8 = 31 * 5 + 28 + 30 * 2 + day; System.out.println("С начала года прошло " + z8 + " дня (дней)."); break;
            case 10: int z9 = 31 * 5 + 28 + 30 * 3 + day; System.out.println("С начала года прошло " + z9 + " дня (дней)."); break;
            case 11: int z10 = 31 * 6 + 28 + 30 * 3 + day; System.out.println("С начала года прошло " + z10 + " дня (дней)."); break;
            case 12: int z11 = 31 * 6 + 28 + 30 * 4 + day; System.out.println("С начала года прошло " + z11+ " дня (дней)."); break;
            default: System.out.println("ошибочные данные");
        }
    }
    {
    }
}