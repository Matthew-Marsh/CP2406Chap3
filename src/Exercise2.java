public class Exercise2 {
    public static void main(String[] args) {

        int numberOfDivisors = 0;
        int highestDivisor = 0;
        int numberWithHighestDivisor = 0;
        for (int currentInteger = 1; currentInteger <= 10000; currentInteger++) {
            numberOfDivisors = 0;
            for (int divisor = 1; divisor <= currentInteger; divisor++) {
                if ( currentInteger % divisor == 0 ) {
                    numberOfDivisors++;
                }
            }
            if (numberOfDivisors > highestDivisor) {
                highestDivisor = numberOfDivisors;
                numberWithHighestDivisor = currentInteger;
            }
        }
        System.out.println("Number with the highest divisor is: " + numberWithHighestDivisor + " with " + highestDivisor + " divisors.");

    }
}
