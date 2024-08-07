package lab8.ex4.comparator;

import java.util.Comparator;

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return Double.compare(left.getRating(), right.getRating());
    }
}
