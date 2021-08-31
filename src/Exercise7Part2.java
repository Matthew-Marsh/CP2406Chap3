public class Exercise7Part2 {
    public static void main(String[] args) {
        boolean[] birthdayCount;
        int count;
        birthdayCount = new boolean[365];
        count = 0;
        int differentBirthdayCount;
        differentBirthdayCount = 0;
        while (count < 365) {
            int birthday;
            birthday = (int)(Math.random()*365);
            count++;
            if (!birthdayCount[birthday]) {
                birthdayCount[birthday] = true;
                differentBirthdayCount++;
            } else {
                System.out.println("Someone had this birthday: " + birthday);
            }
        }
        System.out.printf("Out of 365 people there were %d birthdays.", differentBirthdayCount);
    }
}
