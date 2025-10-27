package ru.netology.service;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void HowMachSpendBeforeBonus() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

        int amount = 2000;
        int expected = 0;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected,
                "Для суммы " + amount + " остаток должен быть " + expected);


    }

    @org.testng.annotations.Test
    public void HowMachSpendBeforeBonusTest2() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

        int amount = 1511;
        int expected = 489;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected,
                "Для суммы " + amount + " остаток должен быть " + expected);


    }

    @org.testng.annotations.Test
    public void HowMachSpendBeforeBonusTest3() {
        ru.netology.service.CashbackHackService service = new ru.netology.service.CashbackHackService();

        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        org.testng.Assert.assertEquals(actual, expected,
                "Для суммы " + amount + " остаток должен быть " + expected);


    }

    }
