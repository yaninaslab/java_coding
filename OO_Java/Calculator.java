/* This is a simple calculator in Java. It helps to add, subtract, multiply, divide and get a remainder of two integers.
*/

public class Calculator {

    public Calculator() {

    }

    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    public int modulo(int a, int b) {
        int result = a % b;
        return result;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        int addition = myCalculator.add(5, 7);
        System.out.println(addition);

        System.out.println(myCalculator.subtract(45, 11));

        System.out.println(myCalculator.multiply(5, 4));

        System.out.println(myCalculator.divide(45, 5));

        System.out.println(myCalculator.modulo(45, 6));

    }

}
