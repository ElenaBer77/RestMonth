package ru.netology.services.restMonth.services;


public class RestMonthService {
    public int calculator(int income, int expense, int threshold) {
        int count = 0; // месяцев отдыха
        int money = 0; // денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // на счету больше или равно порогу
                count++;
                money = (money - expense) / 3;
            } else {
                money = money + income - expense;
            }
        }
        return count;
    }
}
