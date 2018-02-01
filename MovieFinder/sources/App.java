import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int mainMenuUserInput = 0;
		String movieTitleUserInput = null;
		String movieIdUserInput = null;

		// do-while loop used to return the user back to the main menu if they've haven't chosen to exit the app
		do {
			// displays the main menu
			MainMenu mainMenu = new MainMenu();

			// Creates scanner object
			Scanner input = new Scanner(System.in);

			mainMenuUserInput = input.nextInt();
			
			if(mainMenuUserInput == 1) {
				AddMovieMenu addMovieMenu0 = new AddMovieMenu();
				
				movieTitleUserInput = input.next();
				
				addMovieMenu0.setMovieName(movieTitleUserInput);
				
				//System.out.println(addMovieMenu0.getMovieName());
				
				addMovieMenu0.AddMovieId();
				
				movieIdUserInput = input.next();
				
				addMovieMenu0.setMovieId(movieIdUserInput);
				
				//System.out.println(addMovieMenu0.getMovieId());
			}
			else if(mainMenuUserInput == 2) {
				// this is to be written
			}
			else if(mainMenuUserInput == 3) {
				System.out.println("Goodbye!");
			}
			else {
				System.out.println("You did not enter a valid selection.");
			}
		} while (mainMenuUserInput != 3);
	}
}
