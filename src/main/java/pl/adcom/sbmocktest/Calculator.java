package pl.adcom.sbmocktest;

public class Calculator {

    public int add(int number1, int number2){
        return number1 + number2;
    }

    public double devide(int number1, int number2){
        if(number2 == 0){
            throw new ArithmeticException("number can't by devide by 0");
        }
        return number1/number2;
    }
}
