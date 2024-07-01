package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateAmount() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 0;
        int expected = 1_000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAmount1() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}