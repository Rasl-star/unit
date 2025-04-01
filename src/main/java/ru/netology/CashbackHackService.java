package ru.netology;

public class CashbackHackService {
    private final int boundary = 1000;

    public int remain(int amount) {
        int remainder = amount % boundary;
        return remainder == 0 ? 0 : boundary - remainder;
    }
}
