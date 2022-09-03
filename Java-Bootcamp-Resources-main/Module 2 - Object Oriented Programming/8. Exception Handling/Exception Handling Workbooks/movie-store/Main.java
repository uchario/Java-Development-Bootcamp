import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Movie;
import models.Store;
public class Main {
    static Store store = new Store();
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n********************JAVA VIDEO STORE********************\n");
       
        try {
            loadMovies("movies.txt");
            System.out.println(store);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        manageMovies();
    }

    public static void loadMovies(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);
        while (scanFile.hasNextLine()) {
            String[] lineArray = scanFile.nextLine().split("--");
            store.addMovie(new Movie(lineArray[0], lineArray[1], Double.parseDouble(lineArray[2])));
        }
        scanFile.close();
    }

    public static void manageMovies() {
        while (true) {
            System.out.println("\nWould you like to \n\ta). purchase\n\tb). rent \n\tc). return");
            String option = scan.nextLine();
            System.out.print("Enter the name of the movie: ");
            String movieChoice = scan.nextLine();

            switch (option) {
                case "a":
                    store.action(movieChoice, "sell");
                    break;
                case "b":
                    store.action(movieChoice, "rent");
                    break;
                case "c":
                    store.action(movieChoice, "return");
                    break;
            }
        }
    }

    /**
     * Name: manageMovies
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) purchase b) rent c) return d) exit.
     *   •        case a: ask for the name and sell.
     *   •        case b: ask for the name and rent.
     *   •        case c: ask for the name and return.
     *   • 3. call close() from the Scanner object.
     */


    /**
     * Name: loadMovies
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads movies from <fileName>.txt.
     *   • 2. adds all movies to the store object's movie field.
     *        Hint: You will need to 'split' a String into three Strings.
     */

}
