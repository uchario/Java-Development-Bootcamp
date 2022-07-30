import java.util.Scanner;
public class Hangman {
    public static Scanner scan = new Scanner(System.in);

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        String word = "meet";
        System.out.println(word);

        String placeholder []  = new String [word.length()];

        for (int i = 0; i < word.length(); i++) {
            placeholder[i] = "_";
        }

        String misses = "";
        int count = 0;

        for (int i = 0; i < placeholder.length; i++) {

            System.out.print("\nGuess: " + " ");
            String inputChar = scan.nextLine();
            boolean checkGuess = checkGuess(word, inputChar);

            if (checkGuess) {
                placeholder[word.indexOf(inputChar)] = inputChar;
            } else {
                misses += inputChar;
                count++;
            }

            System.out.println("\nGuess: " + inputChar);
            System.out.println("\n" + gallows[count]);
            System.out.print("\nWord: ");

            for (int j = 0; j < placeholder.length; j++) {
                System.out.print(placeholder[j] + " ");
            }

            System.out.println("\n\nMisses: " + misses);
        }
        
    }

    public static String randomWord(String[] words) {
        double randomNumber = Math.random() * words.length;
        randomNumber++;
        int randInt = (int) randomNumber;
        return words[randInt];
    }

    /*
     * returns true if the user guessed a letter from the word correctly
     */
    public static boolean checkGuess(String word, String inputChar) {
        if (word.indexOf(inputChar) == -1) {
            return false;
        }

        return true;
    }

    /*
     * updates the placeholders when the user makes a correct guess
     */
    public static void updatePlaceholders(String word, int index) {
        
    }

    /*
     * prints the placeholders
     */
    public static void printPlaceholders() {

    }

    /*
     * prins guesses that the user missed
     */
    public static void printMissedGuesses() {

    }

}





