package src.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.Test;

import src.main.models.Store;
import src.main.models.Movie;

public class StoreTest {

    Store store;

    @Before
    public void setup() {
        store = new Store();
        store.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));
    }

    @Test
    public void movieAdded() {
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test
    public void sellMovie() {
        store.sellMovie("The Shawshank Redemption");
        assertFalse(store.contains(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2)));
    }

}
