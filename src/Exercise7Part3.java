public class Exercise7Part3 {
    public static void main(String[] args) {
        boolean[] birthdayCount;
        int count;
        birthdayCount = new boolean[365];
        count = 0;
        int differentBirthdayCount;
        differentBirthdayCount = 0;
        while (differentBirthdayCount < 365) {
            int birthday;
            birthday = (int)(Math.random()*365);
            count++;
            if (!birthdayCount[birthday]) {
                birthdayCount[birthday] = true;
                differentBirthdayCount++;
            }
        }
        System.out.printf("It took %d people to find a birthday for every single day.", count);
    }
}
