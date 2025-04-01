package ru.netology;
import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnZeroIfAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainForNonMultipleAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 750;
        int expected = 250;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnBoundaryMinusAmountIfSmallValue() {
        CashbackHackService service = new CashbackHackService();
        int amount = 200;
        int expected = 800;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnCorrectRemainForLargeNonMultipleAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2345;
        int expected = 655;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}
