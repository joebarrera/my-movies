import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		int mainMenuUserInput = 0;
		int addMovieToCollectionInput = 0;
		String movieTitleUserInput = null;
		String movieIdUserInput = null;

		// Creates scanner object
		Scanner input = new Scanner(System.in);

		// creates tree set
		Set<Movies> movieSet0 = new TreeSet<Movies>(new MovieNameComparator());

		// do-while loop used to return the user back to the main menu if they've
		// haven't chosen to exit the app
		do {
			// displays the main menu
			MainMenu mainMenu = new MainMenu();

			mainMenuUserInput = input.nextInt();

			if (mainMenuUserInput == 1) {
				
				// do-while lopp used to return the user back through the flow to get a valid input for adding a movie to their collection
				do {
					// displays prompt for movie name
					AddMovieMenu addMovieMenu0 = new AddMovieMenu();
					movieTitleUserInput = input.next();

					Movies movie0 = new Movies();

					movie0.setMovieName(movieTitleUserInput);

					System.out.println("You entered: " + movie0.getMovieName());

					// displays prompt for movie id
					AddMovieIdPrompt addMovieIdPrompt = new AddMovieIdPrompt();
					movieIdUserInput = input.next();

					movie0.setMovieId(movieIdUserInput);

					System.out.println("You entered: " + movie0.getMovieId());

					System.out.println("You've entered: [" + movie0.toString() + "]");
					
					// displays add movie confirmation prompt
					ConfirmAddMoviePrompt confirmAddMovieMenu = new ConfirmAddMoviePrompt();
					
					addMovieToCollectionInput = input.nextInt();

					if (addMovieToCollectionInput == 1) {
						movieSet0.add(movie0);

						System.out.println("[" + movie0.toString() + "] has been added to your list.");
					} else if (addMovieToCollectionInput == 2) {
						// do nothing
					} else if (addMovieToCollectionInput == 3) {
						// do nothing
					}else {
						System.out.println("You did not enter a valid selection.");
					}
				} while (addMovieToCollectionInput != 1 && addMovieToCollectionInput != 3);
				// System.out.println(movieSet0);
			} else if (mainMenuUserInput == 2) {
				// prints full list of movies you've added to your collection
				System.out.println(movieSet0);
			} else if (mainMenuUserInput == 3) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("You did not enter a valid selection.");
			}
		} while (mainMenuUserInput != 3);
	}
}
