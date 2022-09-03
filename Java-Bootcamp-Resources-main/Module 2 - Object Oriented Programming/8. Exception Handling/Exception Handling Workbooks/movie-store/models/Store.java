package models;

import java.util.ArrayList;

public class Store {
    private  ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie)); 
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public void action(String name, String action) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null/blank");
        }

        if (this.movies.isEmpty()) {
            throw new IllegalStateException("Movie list is empty!");
        }

        if (!(action.equalsIgnoreCase("sell") || action.equalsIgnoreCase("rent") || action.equalsIgnoreCase("rent"))) {
            System.out.println("**" + action + "**");
            throw new IllegalArgumentException("Invalid action!");
        }

        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).getName().equalsIgnoreCase(name)) {
                switch(action) {
                    case "sell":
                        if (this.movies.get(i).isAvailable() == false) {
                            throw new IllegalStateException("Movie is not available!");
                        }
                        this.movies.remove(i);
                        return;
                    case "rent":
                        if (this.movies.get(i).isAvailable() == false) {
                            throw new IllegalStateException("Movie is not available!");
                        }
                        this.movies.get(i).setAvailable(false);
                        return;
                    case "return":
                        this.movies.get(i).setAvailable(true);
                        return;
                }
            }
        }
        throw new IllegalArgumentException("Movie not in store!");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < movies.size(); i++) {
            temp += movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
}
