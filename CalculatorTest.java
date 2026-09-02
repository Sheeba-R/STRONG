public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        // Test Case 1 - Addition
        double result = c.add(10, 5);
        double expected = 15;

        if(result == expected) {
            System.out.println("Test case 1 for add() is PASS");
        } else {
            System.out.println("Test case 1 for add() is FAIL");
        }

        // Test Case 2 - Subtraction
        result = c.subtract(10, 5);
        expected = 5;

        if (result == expected) {
            System.out.println("Test case 2 for subtract() is PASS");
        } else {
            System.out.println("Test case 2 for subtract() is FAIL");
        }

        // Test Case 3 - Multiplication
        result = c.multiply(10, 5);
        expected = 50;

        if (result == expected) {
            System.out.println("Test case 3 for multiply() is PASS");
        } else {
            System.out.println("Test case 3 for multiply() is FAIL");
        }

        // Test Case 4 - Division
        result = c.divide(10, 5);
        expected = 2;

        if (result == expected) {
            System.out.println("Test case 4 for divide() is PASS");
        } else {
            System.out.println("Test case 4 for divide() is FAIL");
        }

        // Test Case 5 - Division by zero
        try {
            c.divide(10, 0);
            System.out.println("Test case 5 for divide by zero is FAIL");
        } catch (ArithmeticException e) {
            System.out.println("Test case 5 for divide by zero is PASS");
        }
    }
}