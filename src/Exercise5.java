import textio.TextIO;

public class Exercise5 {
    public static void main(String[] args) {
        double sales;
        String city;
        double salesTotal = 0;
        int missingCount = 0;

        TextIO.readFile("citysales.txt");
        while (!TextIO.eof()) {
            String line = TextIO.getln();
            String[] data = line.split(":");
            try {
                sales = Double.parseDouble(data[1]);
                salesTotal += sales;
            }
            catch (NumberFormatException errorInformation) {
                missingCount++;
            }
        }
        System.out.println("The total sales of all cities listed is: $" + salesTotal);
        if (missingCount == 0) {
            System.out.println("No cities missing data.");
        } else if (missingCount == 1) {
            System.out.println("One city missing data.");
        } else {
            System.out.println(missingCount + " cities missing data.");
        }
    }
}
