
public class AddMovieMenu {
	private String movieName;
	private String movieId;
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	
	AddMovieMenu() {
		System.out.println("Enter the movie title you'd like to add to your collection.");
	}
	
	public void AddMovieId() {
		System.out.println("Enter the movie ID for the movie title that you've just entered.");
	}
}
