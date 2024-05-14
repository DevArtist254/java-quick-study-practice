package MovieSelector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("A, H, C and Qq to quit");

            String action = sc.nextLine();

            if (action == "Qq") break;

            System.out.println("Movie title is:");

            String movie = sc.nextLine();

            Movie m = Movie.getTheMovie(action, movie);
            m.watchMovie();
        }
    }
}
