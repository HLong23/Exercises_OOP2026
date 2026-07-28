package Lab9_.B4_2;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}
