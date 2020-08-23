package pl.adcom.sbmocktest;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

//    BDD Behavior driven development
    @Test
    public void should_add_two_numbers(){
//        given
        Calculator calculator = new Calculator();
//        when
//        int result = calculator.add(10, 15);
//        then
        Assert.assertEquals( calculator.add(10, 15), 25);
        Assert.assertEquals( calculator.add(-10, 15), 5);
        Assert.assertEquals( calculator.add(2, -2), 0);

    }

    @Test
    public void should_no_add_two_numbers(){
//        given
        Calculator calculator = new Calculator();
//        when
//        int result = calculator.add(10, 15);
//        then
        Assert.assertNotEquals( calculator.add(10, 20), 25);
        Assert.assertNotEquals( calculator.add(-2, 15), 5);
        Assert.assertNotEquals( calculator.add(14, 12), 17);
    }

    @Test
    public void should_devide_two_number() {
//        given
        Calculator calculator = new Calculator();
//        when

//        then
        Assert.assertEquals(calculator.devide(100, 10), 10, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void should_no_devide_by_zero() {
//        given
        Calculator calculator = new Calculator();
//        when

//        then
        Assert.assertEquals(calculator.devide(100, 0), 10, 0);
    }

}
