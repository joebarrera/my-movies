public class Movies {
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
	public String toString() {
		return "(Movie Name: " + this.movieName + ", Movie ID: " + this.movieId + ")";
	}
}
