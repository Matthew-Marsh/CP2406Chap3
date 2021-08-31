public class Exercise6 {
    public static void main(String[] args) {

        int highestDivisor = 0;
        int[] numbers = new int[10001];
        numbers[1] = 1;
        for (int currentInteger = 1; currentInteger <= 10000; currentInteger++) {
            int numberOfDivisors = 0;
            for (int divisor = 1; divisor <= currentInteger; divisor++) {
                if ( currentInteger % divisor == 0 ) {
                    numberOfDivisors++;
                }
            }
            numbers[currentInteger] = numberOfDivisors;

            if (numberOfDivisors > highestDivisor) {
                highestDivisor = numberOfDivisors;
            }
        }
        System.out.println("The maximum number of divisors was: " + highestDivisor + " divisors.");
        System.out.println("Numbers with highest divisors are:");
        for ( int number = 1; number <= 10000; number++) {
            if (numbers[number] == highestDivisor)
                System.out.println(" " + number);
        }
    }
}
