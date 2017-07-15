package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число и месяц текущего года в формате ДД ММ ГГ: ");
        byte day = scanner.nextByte();
        byte month = scanner.nextByte();
        short year = scanner.nextShort();

        if (day > 31 || day <= 0 || month > 12 || month <= 0 || year <= 0) { // подстраховка на случай введения отрицательных чисел и чисел, превышающих
            // максимальное количество дней в месяце(31) и максимальное количество месяцев в году (12)
            System.out.print("данные введены неверно");
            return;
        }

        if (day > 30 & (month == 4) || (month == 6) || (month == 9) || (month == 11)) { // подстраховка на случай неверного введения
            // количеества дней в апреле, июне, сентябре, ноябре (более 30)
            System.out.println("неверное число месяца");
            return;
        }

            if ((day > 29 & month == 2) && (((year % 4 == 0) & (year % 100 != 0)) || (year % 400 == 0))) {  // подстраховка на случай введения
                // неверной даты в феврале високосного года
                System.out.print("неверное число февраля в високосном году");
                return;

            } else if (day > 28 & month == 2) { // подстраховка на случай неверного введения числа в феврале обычного года(превышающей 28)
                System.out.print("неверное число февраля");
            return;
        }

        int days = 0;

        switch (month) {
            case 1: System.out.println("С начала года прошло " + day + " дня  (дней)."); break;
            case 2: days = 31 + day; break;
            case 3: days = 31 + 28 + day; break;
            case 4: days = 31 * 2 + 28 + day; break;
            case 5: days = 31 * 2 + 28 + 30 + day; break;
            case 6: days = 31 * 2 + 28 + 30 * 2 + day; break;
            case 7: days = 31 * 3 + 28 + 30 * 2 + day; break;
            case 8: days = 31 * 4 + 28 + 30 * 2 + day; break;
            case 9: days = 31 * 5 + 28 + 30 * 2 + day; break;
            case 10: days = 31 * 5 + 28 + 30 * 3 + day; break;
            case 11: days = 31 * 6 + 28 + 30 * 3 + day; break;
            case 12: days = 31 * 6 + 28 + 30 * 4 + day; break;
            default: System.out.println("ошибочные данные");
        }

        if (((year % 4 == 0) & (year % 100 != 0)) || (year % 400 == 0))
            System.out.print("До начала нового года осталось " + (366 - days) + " дней (дня)."); // Год високосный. Из общего количества дней
            // високосного года вычитаем количество прошедших дней

        else {
            System.out.print("До начала нового года осталось " + (365 - days) + " дней (дня)."); // Год обычный. Из общего количества дней года
            // вычитаем количество прошедших дней
        }
    }
}
