package ru.netology.sqr.runetologymvnsqr.services;

public class SQRService {
    public int calculate (int min, int max) {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (min <= (i * i) && (i * i) <= max) {
                number++;
            }
        }
        return number;
    }
}
