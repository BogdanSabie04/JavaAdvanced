package examples.movies;

public abstract class Movie {

    String type;
    String title;
    String description;
    String director;
    boolean isUnderAge;

    public abstract String makeSound();


    public Movie(){

    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    int lengthInMinutes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public boolean isUnderAge() {
        return isUnderAge;
    }

    public void setUnderAge(boolean underAge) {
        isUnderAge = underAge;
    }


}
