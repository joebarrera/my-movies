import java.util.Comparator;

public class MovieNameComparator implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		return o1.getMovieName().compareTo(o2.getMovieName());
	}
	
}
