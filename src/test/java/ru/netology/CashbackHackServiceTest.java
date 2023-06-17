package ru.netology;

import org.junit.Test;

import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void amount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals (actual, expected);
    }
    @Test
    public void amountLess1000() {

        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void amountMore1000() {

        int actual = service.remain(1001);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }
}