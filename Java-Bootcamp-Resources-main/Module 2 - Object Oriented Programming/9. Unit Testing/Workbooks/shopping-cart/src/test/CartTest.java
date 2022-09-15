package src.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import src.main.models.Cart;
import src.main.models.Item;

public class CartTest {

    Cart cart;

    @Before
    public void setup() {
        cart = new Cart();
        cart.add(new Item("Toblerone", 5.99));
        cart.add(new Item("Pepsi", 1.99));
    }
    
    @Test
    public void itemAddedTest() {
        assertTrue(cart.contains(new Item("Toblerone", 5.99)));
    }

    @Test
    public void skipsDuplicate() {
        assertFalse(cart.add(new Item("Toblerone", 5.99)));
    }
}
