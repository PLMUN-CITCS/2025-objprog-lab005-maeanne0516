public class MathLibraryDemo {
    public static void main(String[] args) {

        // Calculate Power
        double base = 2;
        int exponent = 3;
        double powerResult = Math.pow(base, exponent);  // base raised to the exponent

        // Calculate Square Root
        double numberForSqrt = 16;
        double sqrtResult = Math.sqrt(numberForSqrt);  // square root of the number

        // Round a Decimal Number
        double decimalNumber = 5.67;
        long roundedNumber = Math.round(decimalNumber);  // round the decimal number

        // Generate a Random Number
        double randomNumber = Math.random();  // generates a random number between 0.0 and 1.0

        // Output the Results
        System.out.println("Power: " + powerResult);  // Output the power result
        System.out.println("Square Root: " + sqrtResult);  // Output the square root result
        System.out.println("Rounded Number: " + roundedNumber);  // Output the rounded number
        System.out.println("Random Number: " + randomNumber);  // Output the random number
    }
}

