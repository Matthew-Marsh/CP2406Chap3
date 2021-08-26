import textio.TextIO;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.print("Enter the phrase: ");
        String phrase = TextIO.getln();

        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; ++i) {
            String word = words[i].replaceAll("\\W", "");
            System.out.println(word);
        }
    }
}
