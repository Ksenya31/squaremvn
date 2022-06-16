package ru.netology.sqr;

public class SQRService {
    public int squaresCalculate(int min, int max) {
        int count = 0;
        for (int i = 10; i < 99; i++) {
            int square = i * i;
            if (square >= min && square <= max) {
                count++;
            }
        }
        return count;
    }
}
