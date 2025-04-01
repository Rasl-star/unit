package ru.netology;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnRemainIfAmountIsNotMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnBoundaryIfAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnCorrectRemainForAmountGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2500;
        int actual = service.remain(amount);
        int expected = 500;
        Assert.assertEquals(actual, expected);
    }
}