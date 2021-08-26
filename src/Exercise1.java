public class Exercise1 {
    public static void main(String[] args) {
        int firstDice = (int) (Math.random() * 6) + 1;
        int secondDice = (int) (Math.random() * 6) + 1;
        int rollCount = 0;
        rollCount++;
        System.out.println("First die: " + firstDice + " and second Die: " + secondDice);
        while ((firstDice != 1) || (secondDice != 1)) {
            firstDice = (int) (Math.random() * 6) + 1;
            secondDice = (int) (Math.random() * 6) + 1;
            rollCount++;
            System.out.println(rollCount + ": First die: " + firstDice + " and second Die: " + secondDice);
        }
        System.out.println("Your program took " + rollCount + " rolls to get a Snake-eyes.");
    }
}
