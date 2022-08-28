package examples.movies;

public class Cinema {
    private Movie[] movies;
    private int index;

    public Cinema() {
        this.movies = new Movie[5];
        index = 0;
    }

    public void addMovie(Movie newMovie) {
        movies[index] = newMovie;
        index++;

    }

    public void displayMovies() {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].makeSound() + " - " + movies[i].getTitle());
        }
    }
}
