public class Exercise7Part1 {
    public static void main(String[] args) {
        int[] birthdayCount;
        int count;
        birthdayCount = new int[365];
        count = 0;
        while (true) {
            int birthday;
            birthday = (int)(Math.random()*365);
            count++;
            System.out.printf("Birthday: %d%n", birthday);
            birthdayCount[birthday]++;
            if (birthdayCount[birthday] == 3) {
                break;
            }
        }
        System.out.printf("It took %d attempts to have three people with the same birthday.", count);
    }
}
