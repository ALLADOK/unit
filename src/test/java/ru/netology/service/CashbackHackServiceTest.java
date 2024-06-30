package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.*;

public class CashbackHackServiceTest {

    @Test
    void shouldCalculateCashback(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1_000;

        int actual = service.remain(amount);
        int expected = amount;

        assertEquals(actual, expected);
    }
    @Test
    void shouldCalculateCashback1(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

}