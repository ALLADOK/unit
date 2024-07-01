package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {


    @Test
    void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1_000;

        Assert.assertEquals(actual, expected);
    }

    @Test
    void shouldCalculateCashback1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
}