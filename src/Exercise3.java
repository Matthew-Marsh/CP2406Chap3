import textio.TextIO;

public class Exercise3 {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        char userOperator;
        double result;

        System.out.println("Please enter an expression using +, -, * or / operators or enter \'0\' to finish:");

        while (true) {
            System.out.print("> ");
            firstNumber = TextIO.getDouble();
            if (firstNumber == 0)
                break;
            userOperator = TextIO.getChar();
            secondNumber = TextIO.getDouble();

            if (userOperator == '-') {
                result = firstNumber - secondNumber;
            } else if (userOperator == '+') {
                result = firstNumber + secondNumber;
            } else if (userOperator == '*') {
                result = firstNumber * secondNumber;
            } else if (userOperator == '/') {
                result = firstNumber / secondNumber;
            } else {
                System.out.println(userOperator + " is an invalid operator.");
                continue;
            }
            System.out.println("Result of expression is: " + result);

        }
    }
}
